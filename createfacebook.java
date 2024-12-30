package rachu.sri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createfacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email ")).sendKeys("Rachu07");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("chandu");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}
