package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import web.pageobjects.LoginObjects;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerifyDisplayed {
    public static Performable element(String elementType) throws Exception{
        Target element;

        switch (elementType){
            case "Login Successfull":
                element = LoginObjects.LOGIN_Successfull;
                break;
            default:
                throw new Exception("There is no element type: "+ elementType);
        }
        WaitUntil.the(element, isVisible()).forNoMoreThan(100).seconds();
        return Task.where("{0} verify element is displayed", Ensure.that(element).isDisplayed());
    }
}