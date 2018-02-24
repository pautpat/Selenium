package Actions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelectDropdown{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
	// Multiselect dropdown Method of Action class
		driver.navigate().to("http://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement s = driver.findElement(By.xpath("//*[contains(@class,'ui fluid dropdown selection multiple')]"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.click(s).build().perform();
		Thread.sleep(3000);
		a.sendKeys("A",Keys.ENTER).build().perform();
		Thread.sleep(3000);
		a.sendKeys("E",Keys.ENTER).build().perform();
		Thread.sleep(3000);

		driver.close();
		
	}
			
	}

