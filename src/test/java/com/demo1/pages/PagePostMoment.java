package com.demo1.pages;

import com.demo1.UIHelper;
import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2016/2/28.
 */
public class PagePostMoment {
    UIHelper helper;

    public PagePostMoment(UIHelper helper){
        this.helper = helper;
    }

    public void clickSendBtn(){
        getSendBtn().click();
    }

    public WebElement getSendBtn() {
       return helper.findById("com.tencent.mm:id/cds");
    }


}
