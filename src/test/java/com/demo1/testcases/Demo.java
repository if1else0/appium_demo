package com.demo1.testcases;

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
public class Demo {
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
        ( (WebElement) driver.findElements(By.id("com.netease.newsreader.activity:id/biz_navi_tab")).get(4)).click();
        driver.findElement(By.id("com.netease.newsreader.activity:id/biz_pc_main_info_profile_avatar")).click();
        driver.findElement(By.id(("com.netease.newsreader.activity:id/login_username"))).sendKeys("robotium2016@163.com");
        driver.findElement(By.id("com.netease.newsreader.activity:id/login_password")).click();
        driver.findElement(By.id("com.netease.newsreader.activity:id/login_password")).sendKeys("uiautomator");
        driver.findElement(By.id("com.netease.newsreader.activity:id/do_login_button")).click();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
