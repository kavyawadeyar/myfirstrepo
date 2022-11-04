package practiceScripts1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrloffFlipkartApplication
{

	public static void main(String[] args) 
	
	{
	//System.setProperty("web driver.chrome.driver","./src/main/resources/chromedriver.exe");

	//ChromeDriver driver=new ChromeDriver();
	
  //WebDriverManager.chromedriver().setup();
	//ChromeDriver driver=new ChromeDriver();
	
	
	//WebDriverManager.firefoxdriver().setup();
	//FirefoxDriver driver=new FirefoxDriver();
	
	
//	WebDriverManager.edgedriver().setup();
	//EdgeDriver driver=new EdgeDriver();
	
	//driver.quit();
//driver.close();
	
	//WebDriverManager.chromedriver().setup();
	//WebDriver driver=new ChromeDriver();
	//driver.get("https://www.facebook.com");
	//driver.quit();
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		
	
	

	
	
	
	
	}

}
