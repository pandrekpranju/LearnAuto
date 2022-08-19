package learnautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollPage {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjali.pandrekar\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		WebDriverWait wait= new WebDriverWait(driver,30);
		
		//launch the website
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//maximise the window
		driver.manage().window().maximize();
		
		//to utilize JavascriptExecutor, create a reference for the interface and assign it to the WebDriver instance
		//by type casting it.
		//JavascriptExecutor is an interface,that provides way to execute javscript on selected window or current page.
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		
		js.executeScript("history.go(0)");
		
		//get the height of the webpage and scroll to the end
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
//		 WebElement element = driver.findElement(By.id("myText"));
//         String text = element.getText();
//		
//		driver.findElement(By.id("myText")).sendKeys("opmysuatpran@yopmail.com");

		

	}

}
