package PracticeScript1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/manje/OneDrive/Desktop/clearuseid.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='c1w']")).clear();
		driver.findElement(By.cssSelector("input[class='c1w']")).sendKeys("hi");
		Thread.sleep(3000);
		driver.quit();
		

	}

	
	}


