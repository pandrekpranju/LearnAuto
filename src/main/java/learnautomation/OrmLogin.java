package learnautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrmLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjali.pandrekar\\eclipse\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(null);
		WebDriverWait wait= new WebDriverWait(driver,20);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		

	}

}
