package org.vktestiguess.tests;

import org.junit.Test;
import org.vktestiguess.models.AccountData;
import org.vktestiguess.models.PageData;
import org.vktestiguess.models.PostData;

public class SecondTest extends TestBase {
    @Test
    public void test() throws InterruptedException {
        manager.navigation.startPage();
        manager.login.logIn(new AccountData("TSG", "sonicr"));
        manager.navigation.goToPage(new PageData("Тапки и проч."));
        manager.navigation.goToPage(new PageData("Flood Flood Flood 18"));
        manager.post.createPost(new PostData("And another another one"));
        manager.login.logOut();
    }}
