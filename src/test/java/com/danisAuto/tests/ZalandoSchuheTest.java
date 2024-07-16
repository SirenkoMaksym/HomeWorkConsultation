/*
 * created by max$
 */


package com.danisAuto.tests;

import com.danisAuto.pages.HomePage;
import com.danisAuto.pages.SearchPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ZalandoSchuheTest extends TestBase{

    HomePage homePage;
    SearchPage searchPage;
    @BeforeMethod
    public void precondition(){
        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
    }
    @Test
    public void priceValidationTest(){

        homePage.clickOnSearchSchuheLink("3");
        searchPage.selectKids("3" );
        searchPage.selectSandals("2");
        searchPage.clickOnFirstItem("1");
        System.out.println(searchPage.equalsAnyPrice(20));
        System.out.println(searchPage.equalsAnyPrice(50));

    }
}
