package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends BaseTest {


    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValid() {
        loginPage.sendTextToUserNameField();
        loginPage.sendTextToPasswordField();
        loginPage.clickOnLoginButton();
        String expectedMessage = "Products";

        String actualMessage = getTextFromElement(By.xpath("//span[@class = 'title']"));
        Assert.assertEquals(expectedMessage, actualMessage);


    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.sendTextToUserNameField();
        loginPage.sendTextToPasswordField();
        loginPage.clickOnLoginButton();
        String expectedMessage = "Products";
        String actualMessage = getTextFromElement(By.xpath("//span[@class = 'title']"));
        Assert.assertEquals(expectedMessage, actualMessage);

        List<WebElement> totalProducts = driver.findElements(By.className("inventory_item"));
        System.out.println("Total Numbers of Products" + totalProducts.size());
    }


    }

