package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userName = By.id("user-name");
    By password = By.id("password");

    public void sendTextToUserNameField(){
        sendTextToElement(userName,"standard_user");
    }
    public  void sendTextToPasswordField(){
        sendTextToElement(password,"secret_sauce");
    }
    public void clickOnLoginButton(){    By clickOnLogin = By.id("login-button");

        clickOnElement(clickOnLogin);
    }


}
