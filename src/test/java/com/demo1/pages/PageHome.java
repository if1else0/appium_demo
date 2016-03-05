package com.demo1.pages;

import com.demo1.UIHelper;
import com.demo1.Util;
import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2016/2/28.
 */
public class PageHome {
    UIHelper helper;

    public PageHome(UIHelper helper){
        this.helper = helper;
    }

   public void clickNewsItem(int index){
       helper.findByIdAndIndex("com.netease.newsreader.activity:id/perfect_item",index-1).click();
   }

  public void waitForActivityDisplay(){
      Util.waitForElementById(helper.getDriver(),"com.netease.newsreader.activity:id/biz_main_menu_search");
  }

}
