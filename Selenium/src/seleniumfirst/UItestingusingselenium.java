package seleniumfirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UItestingusingselenium {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chrome driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
driver.get("http//www.google.com");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("software automated testing");
driver.findElement(By.xpath("//input[@name='btnk']")).sendKeys(Keys.ENTER);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.close();


}
}
