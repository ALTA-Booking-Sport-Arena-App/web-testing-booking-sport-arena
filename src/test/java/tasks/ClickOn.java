package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import web.pageobjects.LoginObjects;
import web.pageobjects.RegisterObjects;

public class ClickOn {
    public static Performable button(String buttonType) throws Exception{
        Target button;

        switch (buttonType){
            case "Login":
                button = LoginObjects.LOGIN_BUTTON;
                break;
            case "Register":
                button = RegisterObjects.REGISTER_BUTTON;
                break;
            case "Homepage Menu":
                button = RegisterObjects.HOMEPAGE_MENU;
                break;
            case "Register Menu":
                button = RegisterObjects.Register_MENU;
                break;
            default:
                throw new Exception("There is no button type: " + buttonType);
        }

        return Task.where("{0} click " + buttonType + "button", Click.on(button));
    }
}
