package com.demo1.testcases;

import com.demo1.BasicTestCase;
import com.demo1.Util;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;


/**
 * Created by Aaron on 2016/2/28.
 */
public class WebviewDemo3 extends BasicTestCase {

    @Test
    public void webview() throws InterruptedException {
        pm.getPageHome().waitForActivityDisplay();
        pm.getPageHome().clickNewsItem(1);
        Util.sleep(4);
        pm.getPageNews().switchContext();
        System.out.println(pm.getPageNews().getNewsTitle());
        JavascriptExecutor js = (JavascriptExecutor) pm.getPageBasic().getDriver();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        js.executeScript("mobile: scroll", scrollObject);
        Util.sleep(4);
    }
}

