package steps;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.TodoPage;

import java.time.Duration;

public class UserSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginpage = new LoginPage(driver);

    @Given("User is at the login page")

    public void welcome_message_should_be_display() {

        loginpage.load("https://todo.qacart.com/login");
    }
    @When("User fill the email and password and login")

    public void user_fill_the_email_and_password_and_login() {

        loginpage.Login("marwa90antoul@gmail.com","mayar2021*");
    }
    @Then("Welcome message should be display")

    public void user_is_at_the_login_page()  {
        // TODO Auto-generated method stub
       boolean WelcomeDisplayed = new TodoPage(driver).isWelcomeDisplayed();
        Assert.assertTrue(WelcomeDisplayed);

    }

}
