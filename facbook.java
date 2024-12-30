package rachu.sri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class facbook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=facebook+login&sca_esv=d079194dc31bcce1&ei=zmNyZ6iIK4bU4-EPntPL2Ao&oq=facebook+login&gs_lp=Egxnd3Mtd2l6LXNlcnAiDmZhY2Vib29rIGxvZ2luKgIIADILEAAYgAQYsQMYgwEyBRAAGIAEMggQABiABBixAzILEAAYgAQYsQMYgwEyCBAAGIAEGLEDMgUQABiABDILEAAYgAQYsQMYgwEyBRAAGIAEMgUQABiABDIFEAAYgARInB9Q0ARYmxNwAXgBkAEAmAGIBaAB7weqAQkxLjAuMS41LTG4AQHIAQD4AQGYAgSgAo4IwgIKEAAYsAMY1gQYR8ICDRAAGIAEGLADGEMYigXCAg0QABiABBixAxhDGIoFwgIKEAAYgAQYQxiKBZgDAIgGAZAGCpIHCTIuMC4xLjUtMaAH6RA&sclient=gws-wiz-serp");
		driver.manage().window().minimize();
		Thread.sleep(6000);
		driver.findElement(By.name("sex")).click();
	}

}
