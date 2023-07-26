package Handling_Events;



	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auth_demo {

		public static void main(String[] args)
		{
		
			 ChromeOptions option = new ChromeOptions();
	         option.addArguments("--remote-allow-origins=*");

	           WebDriverManager.chromedriver().setup();
	           WebDriver driver = new ChromeDriver(option);
		
		//http://the-internet.herokuapp.com/basic_auth
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
		
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
			
		String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
		if(text.contains("Congratulations"))
		{
			System.out.println("successful login");
		}
		else
		{
			System.out.println("login failed");
		}
		}

	}


