package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropAction {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement source = d.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement target = d.findElement(By.xpath("//h1[.='Block 4']"));
		Thread.sleep(3000);
		Actions a=new Actions(d);
		a.dragAndDrop(source, target).perform();
	}
}
