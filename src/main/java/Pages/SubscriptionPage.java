package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscriptionPage extends PageBase{
    public SubscriptionPage(WebDriver driver) {
        super(driver);
    }

    By btn_Country = By.xpath("//span[@id='country-name']");
    By btn_Egy = By.xpath("//div[@id='eg-contry-flag']");
    By btn_Uae = By.xpath("//div[@id='ae-contry-flag']");
    By btn_Alg = By.xpath("//div[@id='dz-contry-flag']");
    By lbl_light = By.xpath("//strong[@id='name-لايت']");
    By lbl_basic = By.xpath("//strong[@id='name-الأساسية']");
    By lbl_prem = By.xpath("//strong[@id='name-بريميوم']");
    By lbl_Currency = By.xpath("//div[@id='currency-الأساسية']//i");

    public void clickCountry(){
        click(btn_Country);
    }

    public void clickEgypt(){
        click(btn_Egy);
    }

    public void clickUAE(){
        click(btn_Uae);
    }

    public void clickALG(){
        click(btn_Alg);
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

    public String getCurrency(){
        waitElement(lbl_Currency);
        String lbl_curr = action(lbl_Currency).getText();
        return lbl_curr;
    }
}
