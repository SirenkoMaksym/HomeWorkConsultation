/*
 * created by max$
 */


package com.danisAuto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }



    public SearchPage clickOnSearchCarsLink() {

        return new SearchPage(driver);
    }

    public SearchPage clickOnSearchSchuheLink(String number) {
        pause(1000);
        driver.findElement(By.xpath("//*[@class='bhd0J_ ZkIJC- gUPof_']//li["+number+"]")).click();
        return new SearchPage(driver);
    }
}
//