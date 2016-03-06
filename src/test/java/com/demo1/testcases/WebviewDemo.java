package com.demo1.testcases;

import com.demo1.BasicTestCase;
import com.demo1.Util;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Aaron on 2016/2/28.
 */
public class WebviewDemo extends BasicTestCase {

    @Test
    public void webview() throws InterruptedException {
        pm.getPageHome().waitForActivityDisplay();
        pm.getPageHome().clickNewsItem(3);
        Util.sleep(4);
        pm.getPageNews().switchContext();
        System.out.println(pm.getPageNews().getNewsTitle());
    }
}

