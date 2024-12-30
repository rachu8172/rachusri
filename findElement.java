package rachu.sri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class findElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(6000);
		driver.findElement(By.name("sex")).click();
	}

}
