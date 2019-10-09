package newproject;

//import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.*;

public class Wait {
	
	public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";
        driver.get(baseUrl);
        
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Explicit Wait
        WebDriverWait myWait=new WebDriverWait(driver, 3);
        try{
        	myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
            driver.findElement(By.id("email")).sendKeys("tutorial");
            }

        catch(org.openqa.selenium.TimeoutException nsee){
                    System.out.println(nsee.toString());
         }
	}
}
