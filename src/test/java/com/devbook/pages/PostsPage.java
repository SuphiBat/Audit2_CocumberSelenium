package com.devbook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostsPage extends BasePage{
    @FindBy(id = "post-form-btn")
    public WebElement submitBtn;
}
