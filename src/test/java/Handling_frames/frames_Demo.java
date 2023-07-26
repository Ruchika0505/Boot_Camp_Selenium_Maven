package Handling_frames;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class frames_Demo {

		public static void main(String[] args) {
		
			 ChromeOptions option = new ChromeOptions();
	            option.addArguments("--remote-allow-origins=*");

	           WebDriverManager.chromedriver().setup();
	           WebDriver driver = new ChromeDriver(option);
			
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			driver.manage().window().maximize();
					
			driver.switchTo().frame("packageListFrame");
			driver.findElement(By.linkText("org.openqa.selenium")).click();// frame1
			
			driver.switchTo().defaultContent();// switch back to page
			
			driver.switchTo().frame("packageFrame");
			driver.findElement(By.linkText("WebDriver")).click();  // frame2
			
			driver.switchTo().defaultContent();// switch back to page
			
			driver.switchTo().frame("classFrame");
			driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Overview']")).click();

		}

	}

	

