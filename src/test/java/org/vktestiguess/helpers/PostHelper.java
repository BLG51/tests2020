package org.vktestiguess.helpers;

import org.openqa.selenium.By;
import org.vktestiguess.ApplicationManager;
import org.vktestiguess.models.PostData;

import java.util.concurrent.TimeUnit;

public class PostHelper extends HelperBase{
    public PostHelper(ApplicationManager manager) {
//        this.manager = manager;
        super(manager);
    }

    public void createPost(PostData pd) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.linkText("Ответить в тему")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.xpath("//div[@id='cke_1_contents']/div")).click();
        driver.findElement(By.xpath("//div[@id='cke_1_contents']/div")).sendKeys(pd.getText());
        TimeUnit.SECONDS.sleep(10);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        TimeUnit.SECONDS.sleep(5);
    }

}
