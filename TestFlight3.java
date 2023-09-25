package seleniumtutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFlight3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");

		// for Title
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(2000);

		from.sendKeys("New york");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()='To']")).click();
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(2000);
		to.sendKeys("New Delhi");
		
		
		
		Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		to.sendKeys(Keys.ENTER);


	}
}