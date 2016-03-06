package com.demo1.pages;

import com.demo1.UIHelper;
import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2016/2/28.
 */
public class PageNews1 {
    UIHelper helper;

    public PageNews1(UIHelper helper) {
        this.helper = helper;
    }

    public WebElement getSettingsView() {
        return helper.findById("com.netease.newsreader.activity:id/biz_newspage_menu_more");
    }

    public void clickSettingsView() {
        getSettingsView().click();
    }

    public WebElement getShareView() {
        return helper.finByName("分享");
    }

    public void clickShareView(){
        getSettingsView().click();
        getShareView().click();
    }

    public void clickShareToWechat(){
        helper.finByName("微信朋友圈").click();
    }

    public WebElement getNewsTitle(){
        WebElement tiltle = helper.findViewByXpath("//*[@id=\"article_body\"]/div[2]/div[1]");
        return tiltle;
    }

    public String getNewsTitleText(){
        return getNewsTitle().getText().toString();
    }

}
