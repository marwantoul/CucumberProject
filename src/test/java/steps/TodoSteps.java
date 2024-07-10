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
import pages.NewTodoPage;
import pages.TodoPage;

import java.time.Duration;

public class TodoSteps {


    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginpage = new LoginPage(driver);
    @Given("User is at the todos page")

    public void UserIsAtTheTodosPage() {
        /*
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://todo.qacart.com/login");
        */


        loginpage.load("https://todo.qacart.com/login");

        loginpage.Login("marwa90antoul@gmail.com","mayar2021*");

        //driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("marwa90antoul@gmail.com");
        // driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("mayar2021*");
        // driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    }
    @When("User add a new todo")

    public void UserAddANewTodo() {
        // TODO Auto-generated method stub
        /*
        driver.findElement(By.xpath("//span[@class=\"MuiIconButton-label\"]")).click();
        driver.findElement(By.cssSelector("data-testid=\"add\"")).click();
        By.xpath("//button[@data-testid=\"submit-newTask\"]").findElement(driver).click();
        */


        new TodoPage(driver).ClickPlusButton();
        new NewTodoPage(driver).AddToDO("Learn Cucumber");


    }
    @Then("Todo should be added correctly")

    public void TodShouldBeAddedCorrectly() {
        // TODO Auto-generated method stub

        String text =new TodoPage(driver).GetTodoText();

        Assert.assertEquals(text,"Learn Cucumber");
        //  driver.quit();
    }

}
