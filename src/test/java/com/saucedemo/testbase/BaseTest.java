package com.saucedemo.testbase;


import com.saucedemo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = com.saucedemo.propertyreader.PropertyReader.getInstance().getProperty("browser");;
@BeforeMethod
    public void setUp(){
    selectBrowser(browser);

    }
    @AfterMethod
    public void tearDown(){
     closeBrowser();
    }
}
