package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToBottom {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor)d;
		// scroll to bottom of the page
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		// scroll to top of the page
		j.executeScript("window.scrollTo(0,0)");
	}
}

