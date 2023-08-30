package com.devbook.pages;


import com.devbook.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(id="dashboard-h1")
    public WebElement dashboardText;
    @FindBy(xpath = "//p[contains(text(),'Welcome')]")
    public WebElement welcomeMessage;
    @FindBy(xpath = "//*[text()='Audit']/../td[1]")
    public WebElement school_Name;

    public String getTitle(String title){
        return Driver.get().findElement(By.xpath("//td[text()='"+title+"']")).getText();
    }
    public String getCompany(String companyName){
        return Driver.get().findElement(By.xpath("//td[text()='"+companyName+"']")).getText();
    }
    public String getTextCommon(String element){
        return Driver.get().findElement(By.xpath("//td[text()='"+element+"']")).getText();
    }
}
