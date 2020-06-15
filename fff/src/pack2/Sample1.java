package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\online\\7-8\\fff\\Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		String str=driver.findElement(By.xpath("//div[@class='cWood-medium f12 mb0 mt0 pb15 pt10']")).getText();
		System.out.println(str);
		
		String str1=driver.findElement(By.id("MultiCity")).getAttribute("class");
		System.out.println(str1);
		
		System.out.println(driver.findElement(By.id("RoundTrip")).isEnabled());
		System.out.println(driver.findElement(By.id("RoundTrip")).isSelected());
		System.out.println(driver.findElement(By.id("RoundTrip")).isDisplayed());

	}

}
