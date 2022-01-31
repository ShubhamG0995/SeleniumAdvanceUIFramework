package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {
	
	public static void main(String[] args) {
		
		GoogleSearch();
		
	}
	public static void GoogleSearch() {
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	//GO to google.com
	
	driver.get("https://google.com");
	
	//enter text in search text box
	
	driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
	
	//click on search button
	
	driver.findElement(By.name("btnK")).click();
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
	//close browser
	driver.close();
	
	System.out.println("Test completed successfully");
	}

}
