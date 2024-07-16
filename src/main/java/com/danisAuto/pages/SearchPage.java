/*
 * created by max$
 */


package com.danisAuto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void selectBodyStyle() {
        driver.findElement(By.xpath("//*[.='Shoes']")).click();
    }


    public SearchPage selectKids(String numberWahlSchuhe) {
        driver.findElement(By.xpath("//ul[@class='lystZ1 FxZV-M _4oK5GO -hyY7t']/li[" + numberWahlSchuhe + "]")).click();
        return this;
    }

    public SearchPage selectSandals(String numberOfWahlSchuhe) {
        driver.findElement(By.xpath("//ul[@class='ODGSbs']//li[" + numberOfWahlSchuhe + "]/a")).click();
        return this;
    }

    public SearchPage clickOnFirstItem(String numberOfItem) {
        pause(3000);
        scrollToElementByCoordinates(0, 1500);

        driver.findElement(By.xpath
                ("//*[@id='filtered-catalog-size-links']/../div[6]/div/div[2]/div[2]/div[2]/div["
                        + numberOfItem + "]")).click();

        return this;
    }


    @FindBy(xpath = "//*[@class=\"hD5J5m\"]//span[1]")
    WebElement anyPrice;

    public String equalsAnyPrice(int priceSandals) {
        String[] priceSplit = anyPrice.getText().split(" ");
        String x = priceSplit[priceSplit.length - 2].replace(',', '.');
        double x1 = Double.parseDouble(x);

        if (x1 > priceSandals) {
            return "High";
        } else {
            return "low";
        }
    }

}
