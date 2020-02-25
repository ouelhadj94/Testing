package testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("this is test annotation");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class annotation");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  }
@AfterClass
  public void afterClass() {
System.out.println("this is after class annotation"); 
  }

}
