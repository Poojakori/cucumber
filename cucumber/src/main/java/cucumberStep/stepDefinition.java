package cucumberStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinition {
    static WebDriver driver;
    @Given("^User launch the browser for google search\\.$")
    public void user_launch_the_browser_for_google_search() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ekpoo\\\\Desktop\\\\TekArch\\\\Selenium\\\\DriverLinks\\\\chromedriver_win32\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Then("^Enter the data in the search field\\.$")
    public void enter_the_data_in_the_search_field() throws Throwable {

    }
}
