package org.vktestiguess.helpers;

import org.openqa.selenium.By;
import org.vktestiguess.models.AccountData;
import org.vktestiguess.ApplicationManager;

import java.util.concurrent.TimeUnit;

public class LoginHelper extends HelperBase {
    public LoginHelper(ApplicationManager manager) {
        super(manager);
        //        this.manager = manager;
    }

    public void logIn(AccountData ad) throws InterruptedException {
        driver.get("https://sonic-world.ru/forum/?_fromLogin=1&_fromLogout=1");
        TimeUnit.SECONDS.sleep(5);
//        driver.findElement(By.xpath("//form[@action='https://sonic-world.ru/forum/login/']")).click();
        driver.findElement(By.id("elUserSignIn")).click();
        driver.findElement(By.id("auth")).click();
        driver.findElement(By.id("auth")).sendKeys(ad.getName());
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(ad.getPassword());
        driver.findElement(By.id("elSignIn_submit")).click();
    }

    public void logOut() throws InterruptedException {
        driver.findElement(By.id("elUserLink")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Выход')])[2]")).click();
        TimeUnit.SECONDS.sleep(5);
    }
}
