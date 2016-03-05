package com.demo1.pages;

import com.demo1.UIHelper;
import org.openqa.selenium.WebElement;

import java.util.Set;

/**
 * Created by Aaron on 2016/2/28.
 */
public class PageNews extends PageBasic{

    public PageNews(UIHelper helper){
        super(helper);
    }

    public void clickSettings(){
        getSettingsView().click();
    }

    public WebElement getSettingsView(){
       return helper.findById("com.netease.newsreader.activity:id/biz_newspage_menu_more");
    }

    public void clickShare(){
        clickSettings();
        helper.clickByText("分享");
    }

    public void clickShareToWechat(){
        helper.clickByText("微信朋友圈");
    }

    public String getNewsTitle(){
        return helper.findViewByXpath("//*[@id=\"article_body\"]/div[2]/div[1]").getText().toString();
    }

}
