package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenClass
{
    protected static WebDriver driver;

    public static void main(String[] args)
    {
System.setProperty("webdriver.chrome.driver","src/test/driver/chromedriver.exe");
driver= new ChromeDriver();
    }
}
