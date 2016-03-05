package com.demo1.pages;

import com.demo1.UIHelper;

/**
 * Created by Aaron on 2016/2/28.
 */
public class PageNavigation {
    private UIHelper helper;

    public PageNavigation(UIHelper helper){
        this.helper = helper;
    }

    public void goToNewsTab(){
        helper.clickByText("新闻");
    }

    public void goToMyTab(){
        helper.clickByText("我");
    }

}
