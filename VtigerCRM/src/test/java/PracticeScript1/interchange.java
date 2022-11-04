package PracticeScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class interchange {

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/manje/OneDrive/Desktop/Interchange.html");
		WebElement element1=driver.findElement(By.id("a1"));
		element1.clear();
		element1.sendKeys("hello");
		WebElement element2=driver.findElement(By.name("n2"));
		element2.clear();
		element2.sendKeys("hi");
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	

	}

}
