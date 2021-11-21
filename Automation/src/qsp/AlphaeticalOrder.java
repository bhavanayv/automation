package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphaeticalOrder {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/user/OneDrive/Desktop/Hoteldemo.html");
		WebElement mtrlistbox = d.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		for(int i=0;i<alloptions.size();i++)
		{
			String text=alloptions.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		//for(int i=0;i<al.size();i++)
		//{
		//	System.out.println(al.get(i));
		//}
		for(String alltext:al)
		{
			System.out.println(alltext);
		}
		d.close();
	}
}
//sort() is a static method in collections class