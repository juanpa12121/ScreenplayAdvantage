package co.com.bancolombia.certification.advantagedemo.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target ICN_LOGIN_MENU_USER = Target.the("icon_login").located(By.id("menuUserLink"));
    public static final Target TXT_LOGIN_USERNAME = Target.the("login_username").located(By.name("username"));
    public static final Target TXT_LOGIN_PASSWORD = Target.the("login_password").located(By.name("password"));
    public static final Target BTN_LOGIN = Target.the("login_button").located(By.id("sign_in_btn"));
}
