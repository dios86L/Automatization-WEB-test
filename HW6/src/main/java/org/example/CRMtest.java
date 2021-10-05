package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class CRMtest {

    private static WebDriver driver;
    private static final String CRM_URL = "https://crm.geekbrains.space";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        AtomicReference<WebDriverWait> webDriverWait = new AtomicReference<>(new WebDriverWait(driver, 10));

        driver.get(CRM_URL);

        login();

        driver.findElement(By.xpath("//a//span[contains(., 'Проекты')]")).isSelected();



        driver.findElement(By.xpath("//a//span[contains(., 'Все проекты')]")).click();

        webDriverWait.get().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a//span[contains(., 'Все проекты')]")));
        webDriverWait.get().until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a//span[contains(., 'Все проекты')]"))));
        driver.findElement(By.xpath("//a//span[contains(., 'Все проекты')]")).click();

        webDriverWait.get().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='btn-group']//a[contains(., 'Создать проект')]")));
        webDriverWait.get().until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='btn-group']//a[contains(., 'Создать проект')]"))));
        driver.findElement(By.xpath("//div[@class='btn-group']//a[contains(., 'Создать проект')]")).click();


        driver.findElement(By.xpath("//input[@name='crm_project[name]']")).sendKeys("test");

        driver.findElement(By.xpath("//span[contains(.,'Укажите организацию')]")).click();

        driver.findElement(By.xpath("//li//div[contains(.,'12323142342134')]")).click();

        Select priority = new Select(
                driver.findElement(By.xpath("//select[@name='crm_project[priority]']")));
        priority.selectByVisibleText("Низкий");

        Select financeSource = new Select(
                driver.findElement(By.xpath("//select[@name='crm_project[financeSource]']")));
        financeSource.selectByVisibleText("Из средств заказчика");

        Select businessUnit = new Select(
                driver.findElement(By.xpath("//select[@name='crm_project[businessUnit]']")));
        businessUnit.selectByVisibleText("Research & Development");

        Select curator = new Select(
                driver.findElement(By.xpath("//select[@name='crm_project[curator]']")));
        curator.selectByVisibleText("Амелин Владимир");

        Select rp = new Select(
                driver.findElement(By.xpath("//select[@name='crm_project[rp]']")));
        rp.selectByVisibleText("Амелин Владимир");

        Select manager = new Select(
                driver.findElement(By.xpath("//select[@name='crm_project[manager]']")));
        manager.selectByVisibleText("Амелин Владимир");


        driver.findElement(By.xpath("//div[@id='select2-drop-mask']")).click();

        driver.findElement(By.xpath("//li//div[contains(.,'1111 Ольга')]")).click();

        driver.findElement(By.xpath("//button[contains(., 'Сохранить и закрыть')]")).click();

        Thread.sleep(5000);

        driver.quit();

    }

    public static void login() {
        WebElement element = driver.findElement(By.id("prependedInput"));
        element.sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
    }
}