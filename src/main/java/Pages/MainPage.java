package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends PageBase{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    By btn_SignIn = By.xpath("(//li[@class='authorization-link'])[1]");

    public void pressSignIn(){
        click(btn_SignIn);
    }
}
