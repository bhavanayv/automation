package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutDuplicates {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/user/OneDrive/Desktop/Hoteldemo.html");
		WebElement mtrlistbox = d.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		for(int i=0;i<alloptions.size();i++)
		{
			String text=alloptions.get(i).getText();
			hs.add(text);
		}
		for(String text:hs)
		{
			System.out.println(text);
		}
		d.close();
	}
}
/*-we are using hashset as it doesnt allow duplicates.
-set does'nt preserve the order of insertion whereas array preserves the order of insertion
- get() is not there in sets it is there only in arrays. so we cannot use normal for loop in sets.
we have to mandatorily use for each loop or enhanced for.
-add() is used tyo add an element and also check whether element is added or not.
-hs.add(text)----adding elemnets to hashset ad printing them without duplicates.*/

