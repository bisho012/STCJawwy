package Tests;

import org.testng.annotations.Test;

public class SignInTestCases extends TestBase {

    @Test
    public void checkBtnSignIn(){
        mainPage.pressSignIn();
    }
}
