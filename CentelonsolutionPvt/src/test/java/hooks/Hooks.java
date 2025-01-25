package hooks;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.LogUtil;
import utils.ScreenshotUtil;
import utils.WebDriverManagerUtil;


public class Hooks extends BaseTest {
	
	  private WebDriverManagerUtil webDriverManager;
	  
	  
	 @Before
	  
	  public void setup()
	  
	  {
		 LogUtil.info("Scenario is starting...");
		  webDriverManager = new WebDriverManagerUtil();
		
		   webDriverManager.setUpBrowser();
		 }
		 
	  
	/*  @Before
	  public void setup(Scenario scenario) {
	        // Initialize WebDriverManagerUtil
	        webDriverManager = new WebDriverManagerUtil();
	        
	        // Get the browser based on scenario tags
	        String browser = webDriverManager.setUpBrowserUsingTags(scenario);
	        
	        // Initialize the driver for the selected browser
	        initialiseDriver(browser);  // This method should initialize the WebDriver based on the browser value
	        System.out.println("WebDriver initialized");
	  }
	  */
	/* @AfterStep
	    public void afterScenario(Scenario scenario) {
	        // Capture screenshot for both passed and failed scenarios
	        String screenshotName = scenario.getName().replaceAll(" ", "_");
	        
	        if (scenario.isFailed()) {
	            // Append "-Failed" to the screenshot name for failed scenarios
	            ScreenshotUtil.takeScreenshot(driver, screenshotName + "_Failed");
	        } else {
	            // Append "-Passed" to the screenshot name for passed scenarios
	            ScreenshotUtil.takeScreenshot(driver, screenshotName + "_Passed");
	        }
	    }
	    */
	 @AfterStep
	    public void afterEachStep(Scenario scenario) {
	        // Take a screenshot after each step
	        String stepName = scenario.getName().replaceAll(" ", "_") + "_" + scenario.getStatus().toString();
	        ScreenshotUtil.takeScreenshot(driver, stepName);
	    }
	  
		 
	  
	  @After
	  public void teardown()

	  {
		  if(driver != null)
		  {
			  driver.quit();
		  }
		  
		  LogUtil.info("Scenario has ended.");
	  }
	 
}
