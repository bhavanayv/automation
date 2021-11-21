package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadResumeInNaukari {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d.get("https://www.naukri.com/");
		//d.findElement(By.xpath("//span[@id='block']")).click();
		d.findElement(By.xpath("//div[.='Login']")).click();
		d.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("bhavana.yv@gmail.com");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("bhavs2468");
		d.findElement(By.xpath("//button[@type='submit']")).submit();
		d.findElement(By.xpath("//div[@class='btn btn-block btn-large white-text']")).click();
		File f=new File("./data/resume.docx");
		String absolutepath = f.getAbsolutePath();
		d.findElement(By.xpath("//input[@id='attachCV']")).sendKeys(absolutepath);
	}
}
