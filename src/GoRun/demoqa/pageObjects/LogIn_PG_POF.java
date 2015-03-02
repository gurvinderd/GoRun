package GoRun.demoqa.pageObjects;

/**
 * Created by Gurvinder on 3/1/2015.
 */
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;

public class LogIn_PG_POF {

    final WebDriver driver;

    @FindBy(how = How.ID, using = "log")

    public WebElement txtbx_UserName;

    @FindBy(how = How.ID, using = "pwd")

    public WebElement txtbx_Password;

    @FindBy(how = How.NAME, using = "submit")

    public WebElement btn_Login ;

// This is a constructor, as every page need a base driver to find web elements

    public LogIn_PG_POF(WebDriver driver){

        this.driver = driver;

    }

}