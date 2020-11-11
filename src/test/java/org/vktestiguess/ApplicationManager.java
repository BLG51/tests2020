package org.vktestiguess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.vktestiguess.helpers.LoginHelper;
import org.vktestiguess.helpers.NavigatorHelper;
import org.vktestiguess.helpers.PostHelper;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class ApplicationManager {
    private final WebDriver driver;
    private final String baseUrl;
    private StringBuffer verificationErrors;
    public NavigatorHelper navigation;
    public PostHelper post;
    public LoginHelper login;

    public ApplicationManager() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        baseUrl = "https://sonic-world.ru/forum/?_fromLogin=1&_fromLogout=1";
        verificationErrors = new StringBuffer();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        navigation = new NavigatorHelper(this, baseUrl);
        post = new PostHelper(this);
        login = new LoginHelper(this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public NavigatorHelper getNavigation() {
        return navigation;
    }

    public PostHelper getPost() {
        return post;
    }

    public LoginHelper getLogin() {
        return login;
    }

    public void stop(){
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }

    }
}
