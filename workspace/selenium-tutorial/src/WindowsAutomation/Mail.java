package WindowsAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Mail {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launch gmail website
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		// :ogin with yor credentials
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("identifier")).sendKeys("pautpatjob@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.className("RveJvd")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Andreas330");
		Thread.sleep(5000);
		driver.findElement(By.className("RveJvd")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("WaidBe")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='aVMuZe']/div[3]/div[4]/button")).click();
		//driver.findElement(By.className("T-I J-J5-Ji T-I-KE L3")).click();
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("to")).sendKeys("pautpat@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("subjectbox")).sendKeys("Test Mail");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hello Text");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@data-tooltip='Attach files']/descendant::*[3]")).click();
		Thread.sleep(5000);
		
		// Create Object for Robot class
		Robot r = new Robot();
		StringSelection s = new StringSelection("C:\\Users\\pautp\\Desktop\\notepad.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		Thread.sleep(5000);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[text()='Send']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sign out")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		

		

		
		//driver.close();
		

		
		
		// Create a new email 
		
		//To address as Hari email id , write subject , body 
		
		// Attach any file to mail
		
		// send the mail
		
		
		// Signout from email
		
		// Close the browser
		
		
		
		

	}

}
