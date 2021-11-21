package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDuplicates {
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
			if(hs.add(text)==false)
				System.out.println(text);
		}
		d.close();
	}
}


/*-return type of add() is true or false
-true---element is added
-false--element not added
-whenevr the elemnet is nnot added we are printing that i.e, 
we are printing duplicates using if statement fro hashset*/












