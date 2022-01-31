package selenium_session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectHtmlTagdDropdown {

	public static void main(String[] args) {
		
		// html tag :<select>
		//use select class in selenium
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");

	}

}
