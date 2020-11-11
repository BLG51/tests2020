package org.vktestiguess.helpers;

import org.openqa.selenium.*;
import org.vktestiguess.ApplicationManager;

public class HelperBase{

    protected WebDriver driver;
    protected boolean acceptNextAlert = true;
    protected ApplicationManager manager;

    public HelperBase(ApplicationManager manager) {
    this.manager = manager;
    this.driver = manager.getDriver();
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
