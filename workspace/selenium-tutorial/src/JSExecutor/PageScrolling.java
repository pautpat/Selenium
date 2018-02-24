package JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver; 
		jsExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight);"); // move from top to bottom
		Thread.sleep(5000);
		jsExecutor.executeScript("window.scrollTo(document.body.scrollHeight,0);"); // scroll from bottom to top
		Thread.sleep(5000);

		driver.close();
	}

}
