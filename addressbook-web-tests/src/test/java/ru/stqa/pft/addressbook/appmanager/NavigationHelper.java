package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {

    public NavigationHelper() {
        super(wd);
    }

    public void goToGroupPage() {
        click(By.linkText("groups"));
    }
}
