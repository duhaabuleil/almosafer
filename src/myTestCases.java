import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {
	WebDriver driver = new ChromeDriver();
	String URL="https://www.almosafer.com/en";
	String ExpectedLang="en";
	String ExpextedCurrency="SAR";
	 String ExpectedContactNumber="+966554400000";
	 boolean QitafLogoIsThere = true ;
	
	@BeforeTest
	public void mySetup() {
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary")).click();
		}
	
	@Test
	public void chickTheLanguage() {
		
		WebElement HtmlLang = driver.findElement(By.tagName("html"));
		String ActualLan=HtmlLang.getAttribute("lang");
		Assert.assertEquals(ActualLan, ExpectedLang);
		
		
	}
	
	@Test
	public void TestTheCurrencyIsSAR() {
		
		String ActualCurrency = driver.findElement(By.xpath("//button[@data-testid = 'Header__CurrencySelector']"))
				.getText();
		Assert.assertEquals(ExpextedCurrency, ActualCurrency);
	
		
	}
	
	@Test
	public void TestContactNumber() {
		String ActualContactNumber = driver.findElement(By.tagName("strong")).getText();

		Assert.assertEquals(ActualContactNumber, ExpectedContactNumber);
		
		
	}
	@Test
	public void CheckQitafLogoIfDisplayed() {
		
		 boolean ActualQitaflogo = driver.findElement(By.xpath("//svg[@data-testid ='Footer__QitafLogo']")).isDisplayed(); 
				Assert.assertEquals(ActualQitaflogo, QitafLogoIsThere); 
		
		
		
	}

}
