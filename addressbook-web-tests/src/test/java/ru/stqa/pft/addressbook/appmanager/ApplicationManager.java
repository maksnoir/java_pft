package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private final NavigationHelper navigationHelper = new NavigationHelper();
    private GroupHelper groupHelper;

    private SessionHelper sessionHelper;
    private String admin;

    public void init() {
        navigationHelper.wd = new FirefoxDriver();
        navigationHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        navigationHelper.wd.get("http://localhost/addressbook/"); //group.php
        groupHelper = new GroupHelper(navigationHelper.wd);
        sessionHelper.login ("admin", "secret");
        sessionHelper = new SessionHelper(navigationHelper.wd);
    }



    public void logout() {
      navigationHelper.wd.findElement(By.linkText("Logout")).click();
    }

    public void stop() {
        navigationHelper.wd.quit();
    }

    private boolean isElementPresent(By by) {
      try {
        navigationHelper.wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    private boolean isAlertPresent() {
      try {
        navigationHelper.wd.switchTo().alert();
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
