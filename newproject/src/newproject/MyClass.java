package newproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MyClass {

    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		
//    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//		//ChromeOptions options=new ChromeOptions();
//		//options.addArguments("--disable-extensions");
//    	WebDriver driver = new ChromeDriver();
//    	
      String baseUrl = "https://demo.guru99.com/test/newtours/";
      // String baseUrl = "https://google.com/";
      String expectedTitle = "Welcome: Mercury Tours";
       String actualTitle = "";
//
//        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
//
//        // get the actual value of the title
        actualTitle = driver.getTitle();
//
//        /*
//         * compare the actual title of the page with the expected one and print
//         * the result as "Passed" or "Failed"
//         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        System.out.println(actualTitle);
//       
        //close Fire fox
        driver.close();
    }
}