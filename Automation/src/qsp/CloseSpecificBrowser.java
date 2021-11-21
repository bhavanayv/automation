package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowser {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("Enter the title which you want to close");
		Scanner s=new Scanner(System.in);
		String expectedtitle=s.nextLine();
		WebDriver d = new ChromeDriver();
		d.get("https://www.naukri.com/");
		Set<String> whs = d.getWindowHandles();
		for(String allwhs:whs)
		{
			d.switchTo().window(allwhs);
			String actualtitle=d.getTitle();
			if(actualtitle.contains(expectedtitle))
			{
				d.close();
			}
		}
	}
}
