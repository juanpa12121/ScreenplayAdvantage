package co.com.bancolombia.certification.advantagedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target ICN_MENU_USER = Target.the("Ingresar al menu de usuario").located(By.id("menuUserLink"));
    public static final Target LBL_CREATE_NEW_ACCOUNT = Target.the("Crear una nueva cuenta").located(By.xpath("//a[@class='create-new-account ng-scope']"));
    public static final Target LBL_RESULT = Target.the("Label result").located(By.xpath("(//span[contains(text(),'jp3611')])[2]"));
}
