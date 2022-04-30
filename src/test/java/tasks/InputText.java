package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import web.pageobjects.LoginObjects;

public class InputText {
    public static Performable onField(String fieldType, String value) throws Exception{
        Target field;

        switch (fieldType){
            case "Email":
                field = LoginObjects.EMAIL_FIELD;
                break;
            case "Password":
                field = LoginObjects.PASSWORD_FIELD;
                break;
            default:
                throw new Exception("There is no field type: " + fieldType);
        }

        return Task.where("{0} input value: '"+ value + "'", Enter.theValue(value).into(field));
    }
}
