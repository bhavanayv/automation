package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://in.pinterest.com/");
		cd.close();
		String title=cd.getTitle();
		System.out.println(title);
		cd.close();
	}

}
