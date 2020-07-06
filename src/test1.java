import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("WebDriver.chrome.driver", "E:\\chromedriver.exe");
		
		driver.get("https://app.meltwater.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("XXXXXXXXXXX");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xxxxxxxxx");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[@class='ddArrow icon-arrow-down']")).click();
		driver.findElement(By.xpath("//li[@ng-click='openAbsoluteOptions()']")).click();
		driver.findElement(By.xpath("//div[@class='datePickerStartDateCalendar hasDatepicker']//a[@class='ui-state-default' and text()='25']")).click();
		driver.findElement(By.xpath("//div[@class='datePickerEndDateCalendar hasDatepicker']//a[@class='ui-state-default' and text()='22']")).click();
		driver.findElement(By.xpath("//span[@ng-click='completeDialog()\']")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		
	}

}
