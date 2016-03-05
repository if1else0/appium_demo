package com.demo1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Aaron on 2016/2/28.
 */
public class UIHelper {
    private AppiumDriver driver;

    public UIHelper(AppiumDriver driver){
        this.driver = driver;
    }

    public WebElement findById(String id){
        return driver.findElementById(id);
    }

    public WebElement findByClass(String clsName){
        return driver.findElementByClassName(clsName);
    }

    public WebElement findByIdAndIndex(String id, int index){
        return (WebElement)driver.findElements(By.id(id)).get(index);
    }

    public WebElement finByName(String name){
        return  driver.findElementByName(name);
    }

    public void longClick(WebElement element){
        TouchAction action = new TouchAction(driver);
        action.longPress(element).release().perform();
    }

    public void longClickByText(String text){
        longClick(finByName(text));
    }

    public void clickByText(String text){
        finByName(text).click();
    }

    public void clear(WebElement element){
        element.clear();
    }

    public void enterText(WebElement element,String text){
        element.click();
        element.sendKeys(text);
    }

    public AppiumDriver getDriver(){
        return driver;
    }

    public WebElement findViewByXpath(String xpath){
        return driver.findElementByXPath(xpath);
    }
}
