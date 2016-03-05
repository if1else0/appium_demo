package com.demo1.pages;

import com.demo1.UIHelper;

import java.util.Set;

/**
 * Created by Aaron on 2016/3/5.
 */
public class PageBasic {
    UIHelper helper;
    public PageBasic(UIHelper helper){
        this.helper = helper;
    }
    public void swithContext(){
        Set<String> contextNames = helper.getDriver().getContextHandles();
        for (String contextName : contextNames) {
            System.out.println(contextName);
        }
        String lastestContextView = contextNames.toArray()[contextNames.size()-1].toString();
        if(lastestContextView.contains("WEBVIEW")){
            helper.getDriver().context(lastestContextView);
        }
    }

    public void switchToNative(){
        helper.getDriver().context("NATIVE");
    }
}
