package pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodoPage extends BasePage {

    public TodoPage(WebDriver driver) {
        super(driver);
    }

    By WelcomeMessage = By.xpath("//*[@id=\"root\"]/div[2]/div/div/h2");

    By PlusButton = By.xpath("//span[@class=\"MuiIconButton-label\"]");



    By TodoItem = By.xpath("//h2[@data-testid=\"todo-text\"]");


    public boolean isWelcomeDisplayed(){

       return driver.findElement(WelcomeMessage).isDisplayed();

    }

    public void ClickPlusButton()  {
        driver.findElement(PlusButton).click();

    }

    public String GetTodoText(){

        return driver.findElement(TodoItem).getText();
    }
}
