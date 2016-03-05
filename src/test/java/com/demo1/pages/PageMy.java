package com.demo1.pages;

import com.demo1.UIHelper;
import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2016/2/28.
 */
public class PageMy {
    UIHelper helper;

    public PageMy(UIHelper helper){
        this.helper = helper;
    }

    public WebElement getLoginImageView(){
        return helper.findById("com.netease.newsreader.activity:id/biz_pc_main_info_profile_avatar");
    }

    public void clickLoginImageView(){
        getLoginImageView().click();
    }


}
