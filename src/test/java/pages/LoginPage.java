package pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    By emailInput = By.xpath("//*[@id=\"email\"]");
    By passwordInput = By.xpath("//*[@id=\"password\"]");
    By emailSubmit = By.xpath("//*[@id=\"submit\"]");


    public void Login(String email, String password){

        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(emailSubmit).click();

    }
}
