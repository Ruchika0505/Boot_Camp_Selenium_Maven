package Handling_Events;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsAndWindows {

	
public static void main(String[] args) {
		
	  ChromeOptions option = new ChromeOptions();
      option.addArguments("--remote-allow-origins=*");

      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/");
				
		//driver.switchTo().newWindow(WindowType.TAB); // OPENS NEW TAB
		driver.switchTo().newWindow(WindowType.WINDOW); // OPENS IN ANOTHER WINDOW
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		
}
}