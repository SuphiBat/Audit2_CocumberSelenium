package com.devbook.stepDefinitions;

import com.devbook.pages.DashboardPage;
import com.devbook.pages.LoginPage;
import com.devbook.utilities.ConfigurationReader;
import com.devbook.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        //System.out.println("I open the browser and navigate to devbook webpage");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        //System.out.println("I enter teacher username and password and click login button");
        loginPage.loginAsTeacher();
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        //System.out.println("I verify that url changed dashboard");
        //BrowserUtils.waitFor(2);
        String actualMessage = dashboardPage.welcomeMessage.getText();
        Assert.assertTrue(actualMessage.contains("Welcome"));
    }

    @When("The user enters student credentials")
    public void the_user_enters_student_credentials() {
        //System.out.println("I enter student username and password and click login button");
        //Assert.assertTrue(100<99); // We wrote it to be failed
        loginPage.loginAsStudent();
    }

    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {
        //System.out.println("I enter developer username and password and click login button");
        loginPage.loginAsDeveloper();
    }


    //    @When("The user enters SDET credentials")
//    public void the_user_enters_sdet_credentials() {
//        //System.out.println("I enter SDET username and password and click login button");
//    }
    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        loginPage.login(username, password);
    }

    @And("The welcome message contains {string}")
    public void the_welcome_message_contains(String user) {
        String actualMessage = dashboardPage.welcomeMessage.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertTrue(actualMessage.contains(user));
    }

    @Then("The warning message contains {string}")
    public void the_warning_message_contains(String expectedMessage) {
        // to find disappearing warning message
//        String validationMessage= loginPage.emailInputBox.getAttribute("validationMessage");
//        System.out.println("validationMessage = " + validationMessage);
//        Assert.assertEquals(expectedMessage,validationMessage);
        String actualMessage= loginPage.getDisappearingWarningMessage(expectedMessage);
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
