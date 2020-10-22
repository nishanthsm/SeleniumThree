package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestFindingElements {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement	username = driver.findElement(By.id("identifierId"));
		username.sendKeys("nishanth@acuverconsulting.com");
		
		  WebElement nxtbtn= driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"));
		  nxtbtn.click();
		*/
		
		//driver.findElement(By.xpath("identifierId")).sendKeys("nishanth@acuverconsulting.com");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'identifierId\']"))).sendKeys("nishanth@acuverconsulting.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		
		//driver.findElement(By.name("password")).sendKeys("sdfhsdlhsohg");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("sdfhsdlhsohg");
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"password\"]/div[2]/div[2]/div")).getText());
		
		
	}

}
