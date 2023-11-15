package multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTesting {
    static WebDriver driver;
    static String browser = "Chrome"; // change it to Firefox or Edge

    //Setup Chrome browser//
    static String baseUrl = " https://www.saucedemo.com/ ";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid browser name ");
        }

        //Get baseURL
        driver.get(baseUrl);


        //Print the title of the page//
        System.out.println("Title of the page : " + driver.getTitle());


        //Print current URL
        System.out.println("The current URL is : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("The page source is : " + driver.getPageSource());

        //Enter email to email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("prexastudy@gmail.com");

        //Enter the password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Abcd1234");

        //click on login button

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //Print the current url
        System.out.println("Current URL after login :" + driver.getCurrentUrl());

        //Navigate to base url
        driver.get(baseUrl);

        //Refresh the page
        driver.navigate().refresh();

        //close the browser
        driver.quit();
    }

}
