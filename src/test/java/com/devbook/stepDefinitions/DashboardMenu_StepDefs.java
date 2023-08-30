package com.devbook.stepDefinitions;

import com.devbook.pages.DashboardPage;
import com.devbook.pages.LoginPage;
import com.devbook.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DashboardMenu_StepDefs {
    DashboardPage dashboardPage=new DashboardPage();
    LoginPage loginPage=new LoginPage();

    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> expectedList) {
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);
        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.menuList);
        Assert.assertEquals(expectedList,actualList);
    }
    @When("The user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userCredentials) {
        System.out.println("userCredentials = " + userCredentials);
        loginPage.login(userCredentials.get("username"),userCredentials.get("password"));
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(userCredentials.get("Message")));
    }
}
