package learnautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pranjali.pandrekar\\eclipse\\chromedriver.exe");
			
		//need to set this as we are using chrome driver we need driver which we have downloded to open the browser 
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.facebook.com/");//opens the urls which we have passed
			
			
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript(("window.scrollTo(1, document.body.scrollHeight"));
			
			//driver.findElement(By.className("_sv4"));
			
		
	
	}

}
