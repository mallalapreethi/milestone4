package pageObjects;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusableComponents.Base;
import uistore.LearnMoreui;

public class LearnMorepage  extends Base{
	public static Logger log=Logger.getLogger(Base.class.getName());

	


	@BeforeTest
	public void init( ) throws IOException {
		driver=initilizeDriver();
		log.info("Driver is initialised");
		driver.get(pro.getProperty("url"));

		System.out.println(pro.getProperty("url"));
		log.info("navigation to url");		
			
		
	}
	
	@Test
	public void learn() throws InterruptedException {
		
		LearnMoreui l=new LearnMoreui(driver);
		
		
		Thread.sleep(5000);
		
		l.getLearnmore().click();
		
		Assert.assertEquals(l.getSymbol().getText(), "How to Read Laundry Symbols");
		log.info("Assertion completed");
		
		
		
	}
	@AfterTest
	public void close() {
		
		driver.quit();
		
	}

}
