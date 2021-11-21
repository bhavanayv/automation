package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/user/OneDrive/Desktop/Naukari.html");
		Thread.sleep(4000);
		File f=new File("./data/resume.docx");
		String absolutepath = f.getAbsolutePath();
		d.findElement(By.id("cv")).sendKeys(absolutepath);
	}
}


//getAbsolutepath()--- non static method present in file class(java.io package)