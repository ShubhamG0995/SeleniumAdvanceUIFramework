package selenium_session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		List<WebElement> langlist= driver.findElements(By.xpath("//div[@id='SIvCob']/a")); // [/a is for selecting all the links]
		
		System.out.println(langlist.size());
		
		for (WebElement e : langlist) {
			String text = e.getText();
			System.out.println(text);
			if (text.trim().equals("मराठी")) {
				e.click();
				break;
			}
		}
	}

}
