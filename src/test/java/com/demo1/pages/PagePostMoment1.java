package com.demo1.pages;

import com.demo1.UIHelper;
import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2016/2/28.
 */
public class PagePostMoment1 {
    UIHelper helper;

    public PagePostMoment1(UIHelper helper) {
        this.helper = helper;
    }

    public WebElement getSendBtn(){
        return helper.findById("com.tencent.mm:id/cds");
    }

    public void clickSendBtn(){
        getSendBtn().click();
    }

    public WebElement getMomentEditText(){
        return helper.findById("com.tencent.mm:id/bo0");
    }

    public void enterMoment(String text){
        getMomentEditText().click();
        getMomentEditText().sendKeys(text);
    }

}
