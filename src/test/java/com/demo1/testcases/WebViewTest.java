package com.demo1.testcases;

import com.demo1.BasicTestCase;

import org.junit.Test;


/**
 * Created by Aaron on 2016/2/28.
 */
public class WebViewTest extends BasicTestCase{


    @Test
    public void demo() throws InterruptedException {
        pm.getPageHome1().waitForPageLoad();
        pm.getPageHome1().clickNewsItem(2);
        pm.getPageBasic().switchContext();
        System.out.println(pm.getPageNews1().getNewsTitleText());
    }


}
