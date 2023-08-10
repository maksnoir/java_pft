package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {


    public SessionHelper(FirefoxDriver wd) {
        super(wd);

    }

    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String login, String password) {
        type(By.name("user"), login);
        type(By.name("pass"), password);
        click(By.xpath("//input[@value='Login']"));
    }

    private void type(By user, String login) {
    }
}
