package resuable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Master 
{
	public WebDriver dr ;
	public void run()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\J\\chromedriver.exe") ;
		dr = new ChromeDriver() ;
		dr.manage().window().maximize();
		dr.get("https://mvnrepository.com/");
		System.out.println("Executed..");
	}

}
