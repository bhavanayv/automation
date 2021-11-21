package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadResume {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.get("https://www.naukri.com/");
		d.findElement(By.xpath("//div[.='Login']")).click();
		d.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("bhavana.yv@gmail.com");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("bhavs2468");
		d.findElement(By.xpath("//button[@type='submit']")).submit();
		d.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		d.findElement(By.xpath("//i[@title='Click here to download your resume']")).click();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}

   

	


