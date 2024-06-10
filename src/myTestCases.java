import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {
	WebDriver driver = new ChromeDriver();
	String URL="https://www.almosafer.com/en";
	
	@BeforeTest
	public void mySetup() {
		
		driver.get(URL);
	}
	
	@Test
	public void firstTest() {}

}
