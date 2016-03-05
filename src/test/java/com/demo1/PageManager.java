package com.demo1;

import com.demo1.pages.*;

/**
 * Created by Aaron on 2016/2/28.
 */
public class PageManager {
    private UIHelper helper;
    PageNavigation pageNavigation;
    PageMy pageMy;
    PageLogin pageLogin;
    PageHome pageHome;
    PageNews pageNews;
    PagePostMoment pagePostMoment;
    PageBasic pageBasic;

    public PageManager(UIHelper helper){
        this.helper = helper;
    }

    public PageNavigation getPageNavigation(){
        if(pageNavigation == null){
            pageNavigation = new PageNavigation(helper);
        }
        return  pageNavigation;
    }

    public PageMy getPageMy(){
        if(pageMy == null){
            pageMy = new PageMy(helper);
        }
        return pageMy;
    }

    public PageLogin getPageLogin(){
        if(pageLogin == null){
            pageLogin = new PageLogin(helper);
        }
        return  pageLogin;
    }

    public PageHome getPageHome(){
        if(pageHome == null){
            pageHome = new PageHome(helper);
        }
        return pageHome;
    }

    public PageNews getPageNews(){
        if (pageNews == null){
            pageNews = new PageNews(helper);
        }
        return pageNews;
    }

    public PagePostMoment getPagePostMoment(){
        if (pagePostMoment == null){
            pagePostMoment = new PagePostMoment(helper);
        }
        return pagePostMoment;
    }

    public PageBasic getPageBasic(){
        if(pageBasic == null){
            pageBasic = new PageBasic(helper);
        }
        return pageBasic;
    }
}
