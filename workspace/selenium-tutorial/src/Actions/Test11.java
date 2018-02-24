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

public class Test11 {

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
	/*	driver.get("https://www.naukri.com/top-company-jobs");
		Thread.sleep(5000);
		driver.findElement(By.className("mTxt")).click();
		Thread.sleep(5000);
		driver.manage().window().maximize();*/
	//	driver.findElement(By.xpath("//*[text()='More']")).click();
	//	Thread.sleep(5000);
	//	driver.manage().window().maximize();
//		ArrayList<String> windowList = new ArrayList<String>(driver.getWindowHandles());
//		System.out.println(windowList);	
//		driver.switchTo().window(windowList.get(0));
//		Thread.sleep(3000);
//		driver.switchTo().window(windowList.get(1));
//		Thread.sleep(3000);
//		driver.quit();
//		
		
		// Select from the dropdown 
		/*Select s = new Select(driver.findElement(By.name("birthday_month")));
		s.selectByVisibleText("Mar"); // from the web element;
		s.selectByIndex(1); // from the web element;
		s.selectByValue("4"); // you need to look at the source code
		
		*/
	 // Active element
		
		
		// *** Screenshot Method
		
		/*driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f2= new File("C:\\Users\\pautp\\Desktop\\Img\\img.png");
		try {
			FileUtils.copyFile(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//Windows based Alerts and Web Based alerts . Selenium supports only Web Based Alerts,
		//Java Robot class supports desktop based applications.. for ex. Gmail File attach is window based / desktop based alert
		
		/*driver.get("http://www.way2sms.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.id("password")).sendKeys("8346285268");
		driver.findElement(By.id("password")).sendKeys("8346285268",Keys.ENTER);
		Thread.sleep(3000);
	//	driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(3000);
	//	driver.switchTo().alert().accept();
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		System.out.println(alertText);
		driver.close();
*/

		
	// How to handle frame elements
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement gElement = driver.findElement(By.name("q"));
		
		Thread.sleep(3000);
		
		
		Actions a = new Actions(driver);
		a.click(gElement).sendKeys("flip").build().perform(); 
		Thread.sleep(3000);
		WebElement x = driver.findElement(By.xpath("//*[@id='sbse2']/div[2]/b"));
		a.click(x).build().perform();
		// Code to get a list of frames in your web page
		/*Actions a = new Actions(driver);
		a.click(gElement).sendKeys("flip").build().perform(); // Every action class method needs an argument and need to call .build().perform() methods
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);*/

			
	}

}