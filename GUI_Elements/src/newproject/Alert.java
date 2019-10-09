package newproject;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Alert {

    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String alertMessage = "";

        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
       
        System.out.println(alertMessage);
        driver.quit();
       
    }
	
}
