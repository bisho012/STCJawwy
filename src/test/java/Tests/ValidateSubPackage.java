package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ValidateSubPackage extends TestBase {

    @Test
    public void ValidateSubPackage(){
        subscriptionPage.clickCountry();
        subscriptionPage.clickEgypt();
        SoftAssert softAssert = new SoftAssert();

        String prem = "بريميوم";
        String basic = "الأساسية";
        String light = "لايت";
        String ExpectedCurrency = "جنية مصري";
        String ExpectedCurrency1 = "درهم أماراتي";
        softAssert.assertTrue(prem.equals(subscriptionPage.getLblPrem()), "Premium label Assertion Failed");
        softAssert.assertTrue(basic.equals(subscriptionPage.getLbBasic()), "Basic label Assertion Failed");
        softAssert.assertTrue(light.equals(subscriptionPage.getLblLight()), "Light label Assertion Failed");
        softAssert.assertTrue(ExpectedCurrency.equals(subscriptionPage.getCurrency()), "Egyptian Currency Assertion Failed");


        subscriptionPage.clickCountry();
        subscriptionPage.clickUAE();
        softAssert.assertTrue(prem.equals(subscriptionPage.getLblPrem()), "Premium label Assertion Failed");
        softAssert.assertTrue(basic.equals(subscriptionPage.getLbBasic()), "Basic label Assertion Failed");
        softAssert.assertTrue(light.equals(subscriptionPage.getLblLight()), "Light label Assertion Failed");
        softAssert.assertTrue(ExpectedCurrency1.equals(subscriptionPage.getCurrency()), "Emiratie Currency Assertion Failed");
        softAssert.assertAll();
    }
}
