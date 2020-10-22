package config;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropdowns {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("country")).sendKeys("Germany");
		
		/*WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		dropdown.sendKeys("hi");
		Select select = new Select(dropdown);
		
		select.selectByValue("hi"); */
		
		
		//List<WebElement> values = driver.findElements(By.tagName("option"));
		//System.out.println("Total values are" +values.size());
		
		//System.out.println(values.get(7).getText());
		
		//
		       List<WebElement> links = driver.findElements(By.tagName("a"));
		       
		       System.out.println("Total links are  " + links.size());
		       
		       for(WebElement link: links) {
		    	   
		    	  System.out.println(link.getText()+link.getAttribute("href"));
		       }
		
	}

}
