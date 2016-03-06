package com.demo1.pages;

import com.demo1.UIHelper;
import com.demo1.Util;
import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2016/2/28.
 */
public class PageHome1 {
    UIHelper helper;

    public PageHome1(UIHelper helper){
        this.helper = helper;
    }

   public void clickNewsItem(int index){
       helper.findByIdAndIndex("com.netease.newsreader.activity:id/perfect_item",index - 1).click();
   }

    public void waitForPageLoad(){
        Util.waitForElementById(helper.getDriver(), "com.netease.newsreader.activity:id/title");
    }

}
