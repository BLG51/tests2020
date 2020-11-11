package org.vktestiguess.helpers;

import org.openqa.selenium.*;
import org.vktestiguess.ApplicationManager;
import org.vktestiguess.models.PageData;
import org.vktestiguess.models.URLData;

import java.util.concurrent.TimeUnit;

public class NavigatorHelper extends HelperBase{
    private String baseURL;
    public NavigatorHelper(ApplicationManager manager, String baseURL) {
        super(manager);
        this.baseURL = baseURL;
    }

    public void startPage(){
    driver.get(baseURL);
    }

    public void goToURL(URLData data) throws InterruptedException {
        driver.get(data.getURL());
        TimeUnit.SECONDS.sleep(5);
    }
    public void goToPage(PageData data) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.linkText(data.getPagename())).click();
//        driver.findElement(By.linkText("Тапки и проч.")).click();
//        TimeUnit.SECONDS.sleep(5);
//        driver.findElement(By.linkText("Flood Flood Flood 18")).click();
    }

}
