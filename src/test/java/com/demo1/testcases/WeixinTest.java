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
import java.util.List;

/**
 * Created by Aaron on 2016/2/28.
 */
public class WeixinTest {
    private AppiumDriver driver;
    private String deviceName = "Nexus 5";
    private String platformVersion = "4.4.4";
    private String apkName = "weixin_740.apk";
    private String appActivity = "com.tencent.mm.ui.LauncherUI";

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
    public void testHB() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.name("Aaron")).click();
        int size = driver.findElementsById("com.tencent.mm:id/b_").size();
        ((WebElement)driver.findElementsById("com.tencent.mm:id/b_").get(size - 1)).click();
        if(!driver.findElements(By.id("com.tencent.mm:id/b43")).isEmpty()){
            driver.findElement(By.id("com.tencent.mm:id/b43")).click();
            if(!driver.findElements(By.id("com.tencent.mm:id/cdh")).isEmpty()){
                driver.findElement(By.id("com.tencent.mm:id/cdh")).click();
                System.out.println("===========================");
            }
        }else{
            driver.navigate().back();
        }
        while(true){
            Thread.sleep(3000);
            System.out.println("abc");
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
