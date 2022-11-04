package PracticeScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample2 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// welcome to selenium application
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/manje/OneDrive/Desktop/button1.html");
	Thread.sleep(3000);
	driver.findElement(By.id("a2")).click();
	Thread.sleep(2000);
	driver.quit();
	//end of test case

	}

}
