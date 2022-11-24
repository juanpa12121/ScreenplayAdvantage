package co.com.bancolombia.certification.advantagedemo.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuyLaptopPage {
    public static final Target ICN_LAPTOP_CATEGORY = Target.the("Select laptops category").located(By.id("laptopsImg"));
    public static final Target IMG_FIRST_LAPTOP = Target.the("First laptop").located(By.id("9"));
    public static final Target SPAN_GRAY = Target.the("Gray").located(By.xpath("(//span[@id='rabbit'])[2]"));
    public static final Target TXT_QUANTITY = Target.the("Quantity for click").located(By.name("quantity"));
    public static final Target TXT_QUANTITY1 = Target.the("Quantity for text").located(By.name("quantity"));
    public static final Target BTN_ADD_TO_CART = Target.the("Add to cart").located(By.name("save_to_cart"));
    public static final Target BTN_CHECKOUT = Target.the("Cart").located(By.id("checkOutPopUp"));
    public static final Target BTN_NEXT = Target.the("Next button").located(By.id("next_btn"));
    public static final Target CHK_MASTECARD = Target.the("Mastercard").located(By.id("pay_now_btn_MasterCredit"));
    public static final Target SPAN_THANKS_MESSAGE = Target.the("Thanks message").located(By.xpath("//span[@class='roboto-regular ng-scope']"));
}
