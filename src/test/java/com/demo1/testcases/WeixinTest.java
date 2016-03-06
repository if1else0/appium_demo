package com.demo1.testcases;

import com.demo1.Util;
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
        Util.waitForElementById(driver,"com.tencent.mm:id/acu");
        driver.findElement(By.name("Aaron、李惠娟、startup")).click();
        long timeout = System.currentTimeMillis() + 4 * 60 * 1000;
        while(System.currentTimeMillis() < timeout){
            int size = driver.findElementsById("com.tencent.mm:id/b_").size();
            if(size > 0){
                ((WebElement)driver.findElementsById("com.tencent.mm:id/b_").get(size - 1)).click();
                if(!driver.findElements(By.id("com.tencent.mm:id/b43")).isEmpty()){
                    driver.findElement(By.id("com.tencent.mm:id/b43")).click();
                    if(!driver.findElements(By.id("com.tencent.mm:id/cdh")).isEmpty()){
                        driver.findElement(By.id("com.tencent.mm:id/cdh")).click();
                        System.out.println("===========================");
                    }
                }else{
                    //两种情况，一种是领取到了，再次进入，已经被领取完，直接进入详情页面，
                    //另外一种是没领取到，直接在红包页面，提示手慢了
                    //第一种情况
                    if(!driver.findElements(By.id("com.tencent.mm:id/cdh")).isEmpty()){
                        driver.findElement(By.id("com.tencent.mm:id/cdh")).click();
                    }else{
                        driver.navigate().back();
                    }
                    Util.waitForElementById(driver,"com.tencent.mm:id/c5k");
                }
            }

        }

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
