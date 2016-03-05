package com.demo1.testcases;

import com.demo1.BasicTestCase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

/**
 * Created by Aaron on 2016/2/28.
 */
public class DemoNew extends BasicTestCase {

    @Test
    public void demo() throws InterruptedException {
        Thread.sleep(20000);
        pm.getPageNavigation().goToMyTab();
        pm.getPageMy().clickLoginImageView();
        pm.getPageLogin().login("robotium2016@163.com","uiautomator");
    }

}
