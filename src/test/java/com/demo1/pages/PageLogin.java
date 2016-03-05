package com.demo1.pages;

import com.demo1.UIHelper;
import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2016/2/28.
 */
public class PageLogin {
    UIHelper helper;

    public PageLogin(UIHelper helper){
        this.helper = helper;
    }

    public WebElement getNameEditText(){
        return helper.findById("com.netease.newsreader.activity:id/login_username");
    }

    public WebElement getPasswordEditText(){
        return helper.findById("com.netease.newsreader.activity:id/login_password");
    }

    public WebElement getLoginButton(){
        return helper.findById("com.netease.newsreader.activity:id/do_login_button");
    }

    public void clickLoginButton(){
        getLoginButton().click();
    }

    public void enterToNameET(String text){
        helper.enterText(getNameEditText(),text);
    }

    public void enterToPwdET(String text){
        helper.enterText(getPasswordEditText(),text);
    }

    public void login(String name,String password){
        helper.clear(getNameEditText());
        enterToNameET(name);
        enterToPwdET(password);
        clickLoginButton();
    }

}
