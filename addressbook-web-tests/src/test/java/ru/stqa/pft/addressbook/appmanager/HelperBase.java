package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    private WebDriver webDriver;

    public HelperBase(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    protected void click(By locator) {
        webDriver.findElement(locator).click();
    }

    protected void type(String group_name, By locator, String text) {
        click(locator);
        webDriver.findElement(locator).clear();
        webDriver.findElement(locator).sendKeys(text);
    }

}
