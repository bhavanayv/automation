package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		// enter java into the search text box
		d.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		// store all the links inside the list matching with the word java
		List<WebElement> autosug = d.findElements(By.xpath("//span[contains(.,'java')]"));
		int count = autosug.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			//WebElement allsugg = autosug.get(i);
			String text = autosug.get(i).getText();
			System.out.println(text);
		}
		// using for each loop
		/*for(WebElement sugg:autosug) {
			System.out.println(sugg.getText());
			
		}
		*/
		//click on the 1st suggestion
		 autosug.get(0).click();
		d.close();
	}
}

