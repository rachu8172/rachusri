package rachu.sri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class webDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=instagram&oq=inst&gs_lcrp=EgZjaHJvbWUqDQgAEAAYgwEYsQMYgAQyDQgAEAAYgwEYsQMYgAQyDQgBEAAYgwEYsQMYgAQyBggCEEUYOTINCAMQABiDARixAxiABDINCAQQABiDARixAxiABDINCAUQABiDARixAxiABDIHCAYQABiABDIGCAcQRRg90gEJMTAxODdqMGo3qAIIsAIB&sourceid=chrome&ie=UTF-8");
		driver.manage().window().minimize();
		Thread.sleep(4000);
		Actions actions=new Actions(driver);
		actions.scrollByAmount(0, 3600).perform();
	}

}
