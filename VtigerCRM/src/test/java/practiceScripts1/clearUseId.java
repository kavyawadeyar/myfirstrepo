package practiceScripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clearUseId {

	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///C:/Users/manje/OneDrive/Desktop/clearuseid.html");
	 Thread.sleep(2000);
	 driver.findElement(By.id("i1")).clear();
	 Thread.sleep(3000);
	 driver.quit();
	 

	}

}
