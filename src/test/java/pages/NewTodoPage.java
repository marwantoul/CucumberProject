package pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTodoPage extends BasePage {

    public NewTodoPage(WebDriver driver) {
        super(driver);
    }

    By NewTodoInput = By.xpath("//input[@data-testid=\"new-todo\"]");
    By NewTodoButton = By.xpath("//button[@data-testid=\"submit-newTask\"]");


    public void AddToDO(String item){
        driver.findElement(NewTodoInput).sendKeys(item);
        driver.findElement(NewTodoButton).click();

    }
}
