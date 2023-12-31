package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void goToGroupPage() {
        click(By.linkText("groups"));
    }

    public void submitGroupCreation() {
        click(By.linkText("group page"));
    }

    public void fillGroupForm(GroupData groupData) {
        type("group_name", By.name("group_name"), groupData.getName());
        type("group_header", By.name("group_header"), groupData.getHeader());
        type("group_footer", By.name("group_footer"), groupData.getFooter());

    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.xpath("//div[@id='content']/form/input[5]"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void confirmGroupModification(String button) {
        click(By.name(button));
    }

    public void returnToGroupPage() {
        click(By.name("group page"));
    }
}
