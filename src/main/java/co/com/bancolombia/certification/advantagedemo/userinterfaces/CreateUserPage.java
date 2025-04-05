package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUserPage {
    public static final Target TXT_USERNAME = Target.the("Username").located(By.name("usernameRegisterPage"));
    public static final Target TXT_EMAIL = Target.the("Email").located((By.name("emailRegisterPage")));
    public static final Target TXT_PASSWORD = Target.the("Password").located(By.name("passwordRegisterPage"));
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("Confirm password").located(By.name("confirm_passwordRegisterPage"));
    public static final Target TXT_FIRST_NAME = Target.the("First name").located(By.name("first_nameRegisterPage"));
    public static final Target TXT_LAST_NAME = Target.the("Last name").located(By.name("last_nameRegisterPage"));
    public static final Target TXT_PHONE_NUMBER = Target.the("Phone number").located(By.name("phone_numberRegisterPage"));
    public static final Target LST_COUNTRY = Target.the("Country").located(By.name("countryListboxRegisterPage"));
    public static final Target TXT_CITY = Target.the("City").located(By.name("cityRegisterPage"));
    public static final Target TXT_ADDRESS = Target.the("Address").located(By.name("addressRegisterPage"));
    public static final Target TXT_STATE = Target.the("State").located(By.name("state_/_province_/_regionRegisterPage"));
    public static final Target TXT_POSTAL_CODE = Target.the("Postal code").located(By.name("postal_codeRegisterPage"));
    public static final Target CHK_I_AGREE = Target.the("I agree").located(By.name("i_agree"));
    public static final  Target BTN_REGISTER = Target.the("Register").located(By.id("register_btn"));

}
