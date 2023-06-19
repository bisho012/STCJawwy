package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ValidateSubPackage extends TestBase {

    @Test
    public void ValidateKSA(){
        subscriptionPage.clickEnglishLanguage();
        SoftAssert softAssert = new SoftAssert();

        String prem = "PREMIUM";
        String basic = "CLASSIC";
        String lite = "LITE";
        String ExpectedCurrency = "SAR/month";
        String pricePrem = "60";
        String priceBasic = "25";
        String priceLite = "15";
        //Labels of the packages available
        softAssert.assertTrue(prem.contains(subscriptionPage.getLblPrem()), "Premium label Assertion Failed");
        softAssert.assertTrue(basic.contains(subscriptionPage.getLbBasic()), "Basic label Assertion Failed");
        softAssert.assertTrue(lite.contains(subscriptionPage.getLblLight()), "Light label Assertion Failed");
        //Currency/Package
        softAssert.assertTrue(ExpectedCurrency.contains(subscriptionPage.getCurrencyLite()), "SAR Currency Lite Assertion Failed");
        softAssert.assertTrue(ExpectedCurrency.contains(subscriptionPage.getCurrencyBasic()), "SAR Currency Basic Assertion Failed");
        softAssert.assertTrue(ExpectedCurrency.contains(subscriptionPage.getCurrencyPrem()), "SAR Currency Premium Assertion Failed");
        //Prices
        softAssert.assertTrue(priceLite.contains(subscriptionPage.getPriceLite()), "Lite Price Assertion Failed");
        softAssert.assertTrue(priceBasic.contains(subscriptionPage.getPriceBasic()), "Basic Price Assertion Failed");
        softAssert.assertTrue(pricePrem.contains(subscriptionPage.getPricePrem()), "Premium Price Assertion Failed");
        softAssert.assertAll();
    }

    @Test
    public void ValidateKW(){
        subscriptionPage.clickEnglishLanguage();
        SoftAssert softAssert = new SoftAssert();
        subscriptionPage.clickCountry();
        subscriptionPage.clickKW();

        String prem = "PREMIUM";
        String basic = "CLASSIC";
        String lite = "LITE";
        String ExpectedCurrency = "KWD/month";
        String pricePrem = "4.8";
        String priceBasic = "2.5";
        String priceLite = "1.2";
        //Labels of the packages available
        softAssert.assertTrue(prem.contains(subscriptionPage.getLblPrem()), "Premium label Assertion Failed");
        softAssert.assertTrue(basic.contains(subscriptionPage.getLbBasic()), "Basic label Assertion Failed");
        softAssert.assertTrue(lite.contains(subscriptionPage.getLblLight()), "Light label Assertion Failed");
        //Currency/Package
        softAssert.assertTrue(ExpectedCurrency.contains(subscriptionPage.getCurrencyLite()), "KWD Currency Lite Assertion Failed");
        softAssert.assertTrue(ExpectedCurrency.contains(subscriptionPage.getCurrencyBasic()), "KWD Currency Basic Assertion Failed");
        softAssert.assertTrue(ExpectedCurrency.contains(subscriptionPage.getCurrencyPrem()), "KWD Currency Premium Assertion Failed");
        //Prices
        softAssert.assertTrue(priceLite.contains(subscriptionPage.getPriceLite()), "Lite Price Assertion Failed");
        softAssert.assertTrue(priceBasic.contains(subscriptionPage.getPriceBasic()), "Basic Price Assertion Failed");
        softAssert.assertTrue(pricePrem.contains(subscriptionPage.getPricePrem()), "Premium Price Assertion Failed");
        softAssert.assertAll();
    }
    @Test
    public void ValidateBH(){
        subscriptionPage.clickEnglishLanguage();
        SoftAssert softAssert = new SoftAssert();
        subscriptionPage.clickCountry();
        subscriptionPage.clickBH();

        String prem = "PREMIUM";
        String basic = "CLASSIC";
        String lite = "LITE";
        String ExpectedCurrency = "BHD/month";
        String pricePrem = "6";
        String priceBasic = "3";
        String priceLite = "2";
        //Labels of the packages available
        softAssert.assertTrue(prem.contains(subscriptionPage.getLblPrem()), "Premium label Assertion Failed");
        softAssert.assertTrue(basic.contains(subscriptionPage.getLbBasic()), "Basic label Assertion Failed");
        softAssert.assertTrue(lite.contains(subscriptionPage.getLblLight()), "Light label Assertion Failed");
        //Currency/Package
        softAssert.assertTrue(ExpectedCurrency.contains(subscriptionPage.getCurrencyLite()), "BHD Currency Lite Assertion Failed");
        softAssert.assertTrue(ExpectedCurrency.contains(subscriptionPage.getCurrencyBasic()), "BHD Currency Basic Assertion Failed");
        softAssert.assertTrue(ExpectedCurrency.contains(subscriptionPage.getCurrencyPrem()), "BHD Currency Premium Assertion Failed");
        //Prices
        softAssert.assertTrue(priceLite.contains(subscriptionPage.getPriceLite()), "Lite Price Assertion Failed");
        softAssert.assertTrue(priceBasic.contains(subscriptionPage.getPriceBasic()), "Basic Price Assertion Failed");
        softAssert.assertTrue(pricePrem.contains(subscriptionPage.getPricePrem()), "Premium Price Assertion Failed");
        softAssert.assertAll();
    }
}
