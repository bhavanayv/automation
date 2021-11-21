package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckoxStatusActi {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			WebDriver d=new ChromeDriver();
			d.get("https://demo.actitime.com/login.do");
			boolean check = d.findElement(By.id("keepLoggedInCheckBox")).isSelected();
			if(check==true)
				System.out.println("Checkbox is checked");
			else
				System.out.println("checkbox is unchecked");
			d.close();
	}

}
