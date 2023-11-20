package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver; 
		
		
        //Setting webdriver.gecko.driver property
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Boom\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        //Instantiating driver object and launching browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        

        //Using get() method to open a webpage
        driver.get("https://the-internet.herokuapp.com/");
        
        Thread.sleep(3000);
        
        // Next navigate to the checkbox page
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
        Thread.sleep(3000);
        
        driver.close();
        System.out.println("Script execution completed");
	}

}
