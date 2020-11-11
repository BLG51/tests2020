package org.vktestiguess.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.vktestiguess.ApplicationManager;

public class TestBase{

    ApplicationManager manager;
    @Before
    public void setUp() throws Exception {
    manager = new ApplicationManager();
    }

    @After
    public void tearDown() throws Exception {
    manager.stop();
    }


}
