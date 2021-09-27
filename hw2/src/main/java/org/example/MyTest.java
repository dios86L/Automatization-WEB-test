package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class MyTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromiumDriver();
    }
}
