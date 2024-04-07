package seleniumwebdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTraining {
    
    WebDriver driver; // Declare WebDriver as a class variable

    // Launching the Chrome Browser
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(); // Initialize the WebDriver
		
        driver.get("https://www.simplilearn.com/");
    }

    // Searching selenium training and clicking on it
    public void search() throws InterruptedException {
        driver.findElement(By.id("header_srch")).sendKeys("Selenium");
        Thread.sleep(3000);
        driver.findElement(By.className("search_icon")).click();
        Thread.sleep(3000);
        System.out.println("The page title is: " + driver.getTitle());
    }

    // Close the browser
    public void closeBrowser() {
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Kunjesh");
        SearchTraining obj = new SearchTraining();
        obj.launchBrowser();
        obj.search();
        obj.closeBrowser();
    }
}
