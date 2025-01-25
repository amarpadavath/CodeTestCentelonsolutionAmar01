package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WaitUtil;

public class Loginpage {
	
	private WebDriver driver;
	
	private WaitUtil waitUtil;
	
	private By createButton = By.xpath("//a[@class='action create primary']/span[text()='Create an Account']");
	
	public Loginpage(WebDriver driver)
	{
		this.driver = driver;
		this.waitUtil = new WaitUtil(driver);
		}
	
	public void clickOnCreateButtom()
	{
		WebElement createAccountButton = waitUtil.waitForElementToBeClickable(createButton);
		createAccountButton.click();
		
	}
	
}
