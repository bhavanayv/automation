package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		driver.navigate().to("https://www.gmail.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.close();
	}

}
