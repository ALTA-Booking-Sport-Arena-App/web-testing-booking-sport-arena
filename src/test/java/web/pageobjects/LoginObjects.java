package web.pageobjects;

import io.cucumber.java.en.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://booking-sport-arena.vercel.app/login#")
public class LoginObjects extends PageObject {
    public static Target EMAIL_FIELD = Target.the("email field")
            .locatedBy("#input-email");
    public static Target PASSWORD_FIELD = Target.the("password field")
            .locatedBy("#input-password");
    public static Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("#login-button");
    public static Target LOGIN_Successfull = Target.the("login successfull")
            .locatedBy("//div[@text='Successfully logged in']");
}
