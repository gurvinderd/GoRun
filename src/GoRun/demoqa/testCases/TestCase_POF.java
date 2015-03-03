package GoRun.demoqa.testCases;

/**
 * Created by Gurvinder on 3/1/2015.
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.PageFactory;

import GoRun.demoqa.pageObjects.Home_PG_POF;

import GoRun.demoqa.pageObjects.LogIn_PG_POF;
import org.testng.annotations.Test;

public class TestCase_POF {

    static WebDriver driver;

    @Test
    public void main() throws InterruptedException {

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.store.demoqa.com");

        // This is to Instantiate Home Page and LogIn Page class

        Home_PG_POF HomePage = PageFactory.initElements(driver, Home_PG_POF.class);

        LogIn_PG_POF LoginPage = PageFactory.initElements(driver, LogIn_PG_POF.class);

        // Once both classes Initialised, use their Web Element Objects

        HomePage.lnk_MyAccount.click();

        LoginPage.txtbx_UserName.sendKeys("testuser_1");

        LoginPage.txtbx_Password.sendKeys("Test@123");

        LoginPage.btn_Login.click();

        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

        HomePage.lnk_LogOut.click();

        driver.quit();

    }

}
