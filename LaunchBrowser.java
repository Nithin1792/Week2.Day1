package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setup is used to setup path to instal in local machine
		// this manages the driver
		
		WebDriverManager.chromedriver().setup();
	//	WebDriverManager.edgedriver().setup();
		
		//Step 2 : launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Step3 : maximize the window
		driver.manage().window().maximize();
		
		//Step 4 ; launch the uRL/https should be there always else we will have exception
		
		driver.get("https://www.google.co.in/");
		
		//Step 5 : get the title
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		//Step 6 : close the browser
		//driver.close();
	}

}
