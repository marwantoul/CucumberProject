package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;
    @Before
    public void setup(){
        driver = new DriverFactory().initDriver(); // appel à la méthode trouvé dans la classe initDriver dans DriverFactory

    }

    @After
    public void tearDown(){

        driver.quit();


    }
}
