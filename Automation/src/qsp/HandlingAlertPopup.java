package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		d.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		/*String text=d.switchTo().alert().getText();
		d.switchTo().alert().accept();
		System.out.println(text);
		d.close();*/
		WebDriverWait wait=new WebDriverWait(d, 10);
		Alert a=d.switchTo().alert();
		String text=a.getText();
		a.accept();
		System.out.println(text);
		d.close();
	}
}
