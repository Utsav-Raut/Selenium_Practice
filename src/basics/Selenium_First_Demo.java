package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_First_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver; 
		
        //Setting webdriver.gecko.driver property
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Boom\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        //Instantiating driver object and launching browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //Using get() method to open a webpage
        driver.get("https://the-internet.herokuapp.com/");
        
        //Closing the browser
//        driver.quit();
        System.out.println("Script run completed");
	}

}
