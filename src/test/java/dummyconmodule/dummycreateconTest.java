package dummyconmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class dummycreateconTest {
	
		
		@Test 
		public void dummycreatelnameTest(){
			System.out.println("contact created");
			
		}
	      @Test (groups="SmokeSuit")
	      public void dummycreateconwithorgTest(){
	  		System.out.println("con with org created");
	      }
	      
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



