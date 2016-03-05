package com.demo1.testcases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

/**
 * Created by Aaron on 2016/2/28.
 */
public class ByNameDemo {
    AppiumDriver driver;
    private String deviceName = "Nexus 5";
    private String platformVersion = "4.4.4";
    private String apkName = "news.apk";
    private String appActivity = "com.netease.nr.biz.ad.AdActivity";

    @Before
    public void setUp() throws Exception {
        File apk = new File(System.getProperty("user.dir")+File.separator+"apk"+File.separator+apkName);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName",deviceName);
        capabilities.setCapability("platformVersion",platformVersion);
        capabilities.setCapability("app",apk);
        capabilities.setCapability("noSign",true);
        capabilities.setCapability("noReset",true);
        capabilities.setCapability("appActivity",appActivity);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @Test
    public void demo() throws InterruptedException {
        Thread.sleep(20000);
        driver.findElement(By.name("十三五研究建北京至台北高铁")).click();
        Thread.sleep(3000);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
