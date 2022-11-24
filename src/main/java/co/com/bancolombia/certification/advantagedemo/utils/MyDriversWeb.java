package co.com.bancolombia.certification.advantagedemo.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyDriversWeb {
    private static WebDriver driver;

    public static MyDriversWeb web(){
        System.setProperty("webchromedriver", "chromedriver.exe");
        ChromeOptions optionsEmpanadas = new ChromeOptions();
        optionsEmpanadas.addArguments("--incognito");
        driver = new ChromeDriver(optionsEmpanadas);
        driver.manage().window().maximize();
        return new MyDriversWeb();
    }

    public WebDriver inThePageWeb(String url){
        driver.get(url);
        return driver;
    }

    //Click with javascript
    public static void clickWithJS( String locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", locator);
    }
}
