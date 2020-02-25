package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class test1 {
	WebDriver driver;
  @Test
  public void f () {
	  driver.get("https://www.amazon.com");
	//driver.manage().window().maximize();
		 // WebElement field=driver.findElement(By.id("twotabsearchtextbox"));
		 // field.sendKeys("smart watch");
		 // field.submit();
		 // WebElement prime=driver.findElement(By.
		 // prime.click();
		 // WebElement sign= driver.findElement(By.className("hm-icon nav-sprite"));
		   //sign.click();
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/Owner/Downloads/chromedriver_win32/chromedriver.exe");
	   driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
	 
  }

}
