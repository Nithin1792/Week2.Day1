package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSalesSeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		// Step1: Enter username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		String title = driver.getTitle();
		System.out.println("title page 1: " + title);

		// Step 2 : Enter password
		WebElement password = driver.findElement(By.id("password"));
		String title1 = driver.getTitle();
		password.sendKeys("crmsfa");
				System.out.println("title page 1: " + title1);

//step3: Click on login button
		WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
		loginbutton.click();
		String title2 = driver.getTitle();
		System.out.println("title page 1: " + title2);

		WebElement linkText = driver.findElement(By.linkText("CRM/SFA"));
		linkText.click();
		String title3 = driver.getTitle();
		System.out.println("title page 1: " + title3);
	}

}
