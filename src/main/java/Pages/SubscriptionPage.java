package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscriptionPage extends PageBase{
    public SubscriptionPage(WebDriver driver) {
        super(driver);
    }

    By btn_Country = By.id("country-name");
    By btn_SA = By.id("sa");
    By btn_KW = By.id("kw");
    By btn_BH = By.id("bh");
    By lbl_light = By.xpath("//strong[@id='name-lite']");
    By lbl_basic = By.xpath("//strong[@id='name-classic']");
    By lbl_prem = By.xpath("//strong[@id='name-premium']");
    By lbl_Currency_lite = By.xpath("//div[@id='currency-lite']//i");
    By lbl_Currency_basic = By.xpath("//div[@id='currency-classic']//i");
    By lbl_Currency_prem = By.xpath("//div[@id='currency-premium']//i");
    By btn_lng = By.id("translation-btn");

    By lbl_price_lite = By.xpath("(//b)[2]");
    By lbl_price_classic = By.xpath("(//b)[3]");
    By lbl_price_premium = By.xpath("(//b)[4]");

    public void clickEnglishLanguage(){
        click(btn_lng);
    }
    public void clickCountry(){
        click(btn_Country);
    }

    public void clickKSA(){
        click(btn_SA);
    }

    public void clickKW(){
        click(btn_KW);
    }

    public void clickBH(){
        click(btn_BH);
    }

    public String getAmountLite(){
        waitElement(lbl_light);
        String lbl_Light = action(lbl_light).getText();
        return lbl_Light;
    }
    public String getLblLight(){
        waitElement(lbl_light);
        String lbl_Light = action(lbl_light).getText();
        return lbl_Light;
    }

    public String getLbBasic(){
        waitElement(lbl_basic);
        String lbl_Basic = action(lbl_basic).getText();
        return lbl_Basic;
    }

    public String getLblPrem(){
        waitElement(lbl_prem);
        String lbl_Prem = action(lbl_prem).getText();
        return lbl_Prem;
    }

    public String getCurrencyLite(){
        waitElement(lbl_Currency_lite);
        String lbl_curr = action(lbl_Currency_lite).getText();
        return lbl_curr;
    }

    public String getCurrencyBasic(){
        waitElement(lbl_Currency_basic);
        String lbl_curr = action(lbl_Currency_basic).getText();
        return lbl_curr;
    }

    public String getCurrencyPrem(){
        waitElement(lbl_Currency_prem);
        String lbl_curr = action(lbl_Currency_prem).getText();
        return lbl_curr;
    }

    public String getPriceLite(){
        waitElement(lbl_price_lite);
        String lbl_Light = action(lbl_price_lite).getText();
        return lbl_Light;
    }

    public String getPriceBasic(){
        waitElement(lbl_price_classic);
        String lbl_Light = action(lbl_price_classic).getText();
        return lbl_Light;
    }

    public String getPricePrem(){
        waitElement(lbl_price_premium);
        String lbl_Light = action(lbl_price_premium).getText();
        return lbl_Light;
    }
}
