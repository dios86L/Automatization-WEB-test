package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TestOnCRMtest {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUpBrowser() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, 5);
        driver.get("https://crm.geekbrains.space/");
        login();
    }

    @Test
    public void testIn() throws InterruptedException {

        driver.get("https://crm.geekbrains.space/project/create/");

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='crm_project[name]']")));
        driver.findElement(By.xpath("//input[@name='crm_project[name]']")).click();
        driver.findElement(By.xpath("//input[@name='crm_project[name]']")).sendKeys("test");
        Thread.sleep(10000);
        Assertions.assertEquals("test", driver.findElement(By.xpath("//input[@name='crm_project[name]']")).getAttribute("value"));


    }

    @Test
    public void name() throws InterruptedException {

        driver.get("https://crm.geekbrains.space/project/create/");

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='crm_project[name]']")));
        driver.findElement(By.xpath("//input[@name='crm_project[name]']")).click();
        driver.findElement(By.xpath("//input[@name='crm_project[name]']")).sendKeys("test");

        driver.findElement(By.xpath("//span[contains(.,'Укажите организацию')]")).click();

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='12323142342134']")));
        driver.findElement(By.xpath("//div[text()='12323142342134']")).click();
        Thread.sleep(5000);
        Assertions.assertEquals("12323142342134", driver.findElement(By.xpath("//span[text()='12323142342134']")).getText());


    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    public void login() {
        WebElement element = driver.findElement(By.id("prependedInput"));
        element.sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("_submit")).click();
    }
}
