package dummybrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Launchingbrowser {

	  @Test
      public void launchingbrowser() {
    	  
    	  WebDriver driver;
    	String Browser = System.getProperty("browser");
    	String URL = System.getProperty("url");
    
    	 if(Browser.equals("Chrome")) {
    		 driver=new ChromeDriver();
    	 }else {
    	     driver=new FirefoxDriver();
    	 }
    	 driver.get(URL);
    	 driver.quit();
    	 
      }
}
