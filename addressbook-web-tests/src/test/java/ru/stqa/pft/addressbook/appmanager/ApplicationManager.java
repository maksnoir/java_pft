package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;

    private SessionHelper sessionHelper;
    private String admin;

    public void init() {
        WebDriver webDriver = new FirefoxDriver();
        navigationHelper = new NavigationHelper(webDriver);
        navigationHelper.getWebDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        navigationHelper.getWebDriver().get("http://localhost/addressbook/"); //group.php
        groupHelper = new GroupHelper(navigationHelper.getWebDriver());
        sessionHelper.login ("admin", "secret");
        sessionHelper = new SessionHelper(navigationHelper.getWebDriver());
    }



    public void logout() {
      navigationHelper.getWebDriver().findElement(By.linkText("Logout")).click();
    }

    public void stop() {
        navigationHelper.getWebDriver().quit();
    }

    private boolean isElementPresent(By by) {
      try {
        navigationHelper.getWebDriver().findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        navigationHelper.getWebDriver().switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
