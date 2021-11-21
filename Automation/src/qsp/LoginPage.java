package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement untbx;	//declaration
	private WebElement pwtbx;
	private WebElement lgbtn;
	public LoginPage(WebDriver driver) {
		untbx=driver.findElement(By.id("username"));	//initialisation
		pwtbx=driver.findElement(By.name("pwd"));
		lgbtn=driver.findElement(By.xpath("//div[.='Login ']"));
	}
/*	public void setUser(String un)
	{
		untbx.sendKeys(un);							//utilisation
	}
	public void setPassword(String pw)
	{
		pwtbx.sendKeys(pw);
	}
	public void setLogin() 
	{
		lgbtn.click();
	}*/
	//business logic method
	public void setLogin(String un,String pw)
	{
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
}
