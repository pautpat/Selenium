package JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.name("userName"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver; 
		jsExecutor.executeScript("arguments[0].setAttribute('disabled','');", email);
		Thread.sleep(5000);
		jsExecutor.executeScript("arguments[0].removeAttribute('disabled');", email);

	//	driver.close();
	}

}
