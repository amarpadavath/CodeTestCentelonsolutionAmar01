package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WaitUtil;

public class Header {
	
private WebDriver driver ;
	
	private WaitUtil waitUntil;
	
	private By signIn = By.xpath("(//a[contains(text(), 'Sign In')])[1]");
	
	public Header(WebDriver  driver)
	{
		this.driver = driver;
		this.waitUntil= new WaitUtil(driver);
	}
	
	public void clickOnSignInButton()

	{
		
		WebElement clickSignIn = waitUntil.waitForElementToBeClickable(signIn);
		clickSignIn.click();
	}

}
