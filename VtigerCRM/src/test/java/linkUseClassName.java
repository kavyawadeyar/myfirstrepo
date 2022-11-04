import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkUseClassName {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/manje/OneDrive/Desktop/clearuseid.html");
		Thread.sleep(2000);
		driver.findElement(By.className("czx")).click();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
