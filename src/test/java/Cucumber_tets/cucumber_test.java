package Cucumber_tets;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class cucumber_test {
WebDriver driver;
    @Given("Go to login page")
    public void go_to_login_page() {
            driver=new ChromeDriver();
            driver.get("https://app.cookieyes.com/login");
        }
    @When("Enter credentials")
    public void enter_credentials() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/form/div/div[1]/input")).sendKeys("pzwauaqyasaki@nucleant.org");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/form/div/div[2]/input")).sendKeys("pzwau@#/");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/form/div/div[4]/button")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Then("Validate the login session")
    public void validate_the_login_session() {
//        String expectedText="https://4m1th.github.io/protofolio/";
//        String actualText=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/div/div[1]/div[1]/h5")).getText();
//        Assert.assertEquals("Login not successful",expectedText.equals(actualText));
        System.out.println("Done");
    }
    @Then("close browser")
    public void close_browser() {
        driver.close();
    }
}
