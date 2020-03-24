package pom_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver dr;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","src\\test\\resources\\DRIVER\\chromedriver_v79.exe");
	    dr=new ChromeDriver();
	    dr.get("http://www.amazon.in");
  }
}
