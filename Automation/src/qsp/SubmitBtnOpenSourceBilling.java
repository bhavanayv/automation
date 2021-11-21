package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitBtnOpenSourceBilling {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("http://demo.opensourcebilling.org/en/users/sign_in");
		WebElement link = d.findElement(By.xpath("//button[@name='btn_login']"));
		String text = link.getText();
		System.out.println(text);
		String tagname = link.getTagName();
		System.out.println(tagname);
		String attriute = link.getAttribute("class");
		System.out.println(attriute);
		d.close();
	}
}