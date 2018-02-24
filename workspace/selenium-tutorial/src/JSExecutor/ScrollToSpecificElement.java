package JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToSpecificElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e =driver.findElement(By.xpath(".//*[@id='example']/div[4]/div[1]/div[2]/div[4]/div[1]/div[11]/div/input"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver; 
		
		jsExecutor.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(5000);

		driver.close();
	}

}
