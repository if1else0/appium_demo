package com.demo1.testcases;

import com.demo1.BasicTestCase;
import org.junit.Test;


/**
 * Created by Aaron on 2016/3/5.
 */
public class ShareToWeChat extends BasicTestCase {

    @Test
    public  void share(){
        pm.getPageHome().waitForActivityDisplay();
        pm.getPageHome().clickNewsItem(3);
        pm.getPageNews().clickShare();
        pm.getPageNews().clickShareToWechat();
        pm.getPagePostMoment().clickSendBtn();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
