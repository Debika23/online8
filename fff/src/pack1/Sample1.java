package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\online\\7-8\\fff\\Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("RoundTrip")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("OneWay")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		Thread.sleep(2000);
		driver.findElement(By.id("ToTag")).sendKeys("Texarkana, US - Texarkana Municipal (TXK)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"ORtrip\"]/section[2]/div[1]/dl/dd/div/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(@class,'')]//a[contains(@class,'ui-state-default')][contains(text(),'17')]")).click();;
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.id("Adults"));
		Select s=new Select(dropdown);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("4");
		Thread.sleep(2000);
		s.selectByVisibleText("5");
		Thread.sleep(2000);
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
	}

}
