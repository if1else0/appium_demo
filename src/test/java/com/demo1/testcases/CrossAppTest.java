package com.demo1.testcases;

import com.demo1.BasicTestCase;
import org.junit.Test;

/**
 * Created by Aaron on 2016/2/28.
 */
public class CrossAppTest extends BasicTestCase {

    @Test
    public void demo() throws InterruptedException {
        pm.getPageHome1().waitForPageLoad();
        pm.getPageHome1().clickNewsItem(2);
        pm.getPageNews1().clickShareView();
        pm.getPageNews1().clickShareToWechat();
        pm.getPagePostMoment1().enterMoment("abc");
        pm.getPagePostMoment1().clickSendBtn();
        Thread.sleep(10000);
    }

}
