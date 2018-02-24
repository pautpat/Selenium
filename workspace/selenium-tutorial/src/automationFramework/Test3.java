package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

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
		
	//	driver.get("http://www.facebook.com/");
		
		// Select from the dropdown 
		/*Select s = new Select(driver.findElement(By.name("birthday_month")));
		s.selectByVisibleText("Mar"); // from the web element;
		s.selectByIndex(1); // from the web element;
		s.selectByValue("4"); // you need to look at the source code
		*/
		Thread.sleep(5000);
	 // Active element
		/*driver.switchTo().activeElement().sendKeys("ashutosh");
		driver.switchTo().activeElement().clear();*/
		
		driver.get("http://way2sms.com");
		driver.manage().window().maximize(); // to maximize the window size
		// There is no method to minimize the window, but there is a method to reduce the size and change the location of windows
		// For changing the size of the window, there is a methos to get the height and width of the current window
		int h = driver.manage().window().getSize().getHeight();
		int w = driver.manage().window().getSize().getWidth();
		System.out .println("Height is " + h + "  width is "+ w);
		 // Create dimension object to set the size to reduce window size to
		Dimension d = new Dimension(300, 300);
		driver.manage().window().setSize(d);
		 
		// Setting the window position there is a method, first you get the position for that
		int x = driver.manage().window().getPosition().getX();
		int y = driver.manage().window().getPosition().getY();
		System.out .println("X is " + x + "  Y is "+ y);
		Point p = new Point(200, 400); // Object used to decide the window position
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);

		//	driver.findElement(By.xpath("//*[@id ='Login']/div/div/a/img")).click(); // using id 
		driver.findElement(By.xpath("//*[@class ='android-button']/a/img")).click(); // using class 
		Thread.sleep(5000);
	//	driver.close(); // closes only the only 1 window, and not all the windows opened
		driver.quit(); // closes both the windows
	
	}

}