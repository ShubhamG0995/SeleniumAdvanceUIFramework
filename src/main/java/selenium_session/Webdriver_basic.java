package selenium_session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_basic {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\Eclipse_Workspace\\dec21seleniumsession\\Resources\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver(); //Launch Browser
		
		driver.get("http://www.google.com");  //enter url
		
		String title = driver.getTitle(); //get the page title
		System.out.println("page title : " +title);
		
		//verification point/ checkpoint actual vs expected result
		if(title.equals("Google"))
		{
			System.out.println("tilte is correct");
		}
		else {
			System.out.println("wrong title");
		}
		
		//Automation steps +verification point-- Automation Test (Testing)
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource().contains("copyright"));
		driver.quit();
		
		
		
	}

}
