package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); WebDriver
		 * driver = new ChromeDriver(); driver.get("http://www.gmail.com");
		 * Thread.sleep(5000);
		 * driver.findElement(By.id("identifierId")).sendKeys
		 * ("pautpat@gmail.com");
		 * driver.findElement(By.className("RveJvd")).click();
		 * Thread.sleep(5000);
		 * driver.findElement(By.name("password")).sendKeys("$Margao2000");
		 * driver.findElement(By.className("RveJvd")).click();
		 * Thread.sleep(5000);
		 * driver.findElement(By.xpath("//*[@role='menuitem']")).click();
		 * //driver.close();
		 */
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.facebook.com/");
//		String s = driver.getTitle();
//		Thread.sleep(500);
//		driver.getCurrentUrl();// to check if site is secured https or not
//		driver.getPageSource(); // to verify if the page source is loaded properly or not
//		driver.findElement(By.name("identifier")).getAttribute(""); // to check table sizes, textbox sizes, font -size ect
		
		
		// to navigate to the previous site - navigation methods
		/*driver.get("http://www.facebook.com/");
		Thread.sleep(5000);
		driver.get("http://www.outlook.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);*/
		
		
		// Window handles to moe to a particular window
		driver.get("https://www.naukri.com/top-company-jobs");
		Thread.sleep(5000);
		driver.findElement(By.className("mTxt")).click();
		Thread.sleep(5000);
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//*[text()='More']")).click();
	//	Thread.sleep(5000);
	//	driver.manage().window().maximize();
		ArrayList<String> windowList = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windowList);	
		driver.switchTo().window(windowList.get(0));
		Thread.sleep(3000);
		driver.switchTo().window(windowList.get(1));
		Thread.sleep(3000);
		driver.quit();
		
		
		// Select from the dropdown 
		/*Select s = new Select(driver.findElement(By.name("birthday_month")));
		s.selectByVisibleText("Mar"); // from the web element;
		s.selectByIndex(1); // from the web element;
		s.selectByValue("4"); // you need to look at the source code
		
		*/
	 // Active element
		

	}

}