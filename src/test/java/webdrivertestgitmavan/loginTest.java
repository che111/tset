package webdrivertestgitmavan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class loginTest {
	
	public static  WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.firefox.bin", "D:\\my imp msg\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "G:\\java programs\\geckodriver-v0.17.0-win32\\geckodriver.exe");
		 driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
	}
	
	@Test
	public void dologin()
	{
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[1]/div[1]/div/div[1]/div/div[1]/input")).sendKeys("chetan290@gmail.com");
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/content")).click();
		System.out.println("Example to Git, Gitub using Mavan");
		//driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[1]/input")).sendKeys("abcd");
	}
	
	@AfterSuite
	public void close()
	{
		driver.quit();
	}
	

}
