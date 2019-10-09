package newproject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuietDemo {

	    public static void main(String[] args) {
	    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	    	WebDriver driver = new FirefoxDriver();
	        driver.get("http://www.popuptest.com/popuptest2.html");
	        driver.quit();  // using QUIT all windows will close
	    }
	}