import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class propertyTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "path-chromedriver");
	  driver = new ChromeDriver();
	  // driver = new FirefoxDriver();
	  baseUrl = "http://opensource.demo.orangehrm.com/";
	  }

  @Test
  public void testProperty() throws Exception {
    driver.get(baseUrl + "/PropertyWatch/index.html");
    driver.findElement(By.id("property")).clear();
    driver.findElement(By.id("property")).sendKeys("Omaha");
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
    Thread.sleep(5000);
  }

  
  

  @Test
  public void testProperty2() throws Exception {
	  
	   driver.get(baseUrl + "/PropertyWatch/index.html");
	    driver.findElement(By.id("property")).clear();
	    driver.findElement(By.id("property")).sendKeys("Papillion");
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    Thread.sleep(5000);
  }
  
  @Test
  public void testProperty3() throws Exception {
	  
	  driver.get(baseUrl + "/PropertyWatch/index.html");
	    driver.findElement(By.id("property")).clear();
	    driver.findElement(By.id("property")).sendKeys("Wilsonville");
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    Thread.sleep(5000);
  }
  
  @Test
  public void testProperty4() throws Exception {
	  
  driver.get(baseUrl + "/PropertyWatch/userLogin.html");
  driver.findElement(By.id("user")).clear();
  driver.findElement(By.id("user")).sendKeys("blade");
  driver.findElement(By.id("pwd")).clear();
  driver.findElement(By.id("pwd")).sendKeys("fisk");
  Thread.sleep(5000);
  driver.findElement(By.cssSelector("button.btn.btn-default")).click();
  Thread.sleep(5000);
  }
  
  
  @Test
  public void testProperty5() throws Exception {
	  
	  driver.get(baseUrl + "/PropertyWatch/userLogin.html");
	    driver.findElement(By.id("user")).clear();
	    driver.findElement(By.id("user")).sendKeys("ninja");
	    driver.findElement(By.id("pwd")).clear();
	    driver.findElement(By.id("pwd")).sendKeys("headband");
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    Thread.sleep(5000);
  }
  
  
  @Test
  public void testProperty6() throws Exception {
	  
	  driver.get(baseUrl + "/PropertyWatch/userLogin.html");
	    driver.findElement(By.linkText("Not Registered? Click This Button.")).click();
	    driver.findElement(By.id("first")).clear();
	    driver.findElement(By.id("first")).sendKeys("Charlie");
	    driver.findElement(By.id("last")).clear();
	    driver.findElement(By.id("last")).sendKeys("Candy");
	    driver.findElement(By.id("user")).clear();
	    driver.findElement(By.id("user")).sendKeys("sweets");
	    driver.findElement(By.id("pwd")).clear();
	    driver.findElement(By.id("pwd")).sendKeys("yummyum");
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("sugar@yahoo.com");
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    Thread.sleep(5000);
	  
	  
  }
  
  @Test
  public void testProperty7() throws Exception {
	  
	  
	  driver.get(baseUrl + "/PropertyWatch/userLogin.html");
	    driver.findElement(By.linkText("Not Registered? Click This Button.")).click();
	    driver.findElement(By.id("first")).clear();
	    driver.findElement(By.id("first")).sendKeys("Shawn");
	    driver.findElement(By.id("last")).clear();
	    driver.findElement(By.id("last")).sendKeys("Sheep");
	    driver.findElement(By.id("user")).clear();
	    driver.findElement(By.id("user")).sendKeys("Wool");
	    driver.findElement(By.id("pwd")).clear();
	    driver.findElement(By.id("pwd")).sendKeys("hoves");
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("farm@gmail.com");
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    Thread.sleep(5000);
	  
  }
  
  
  
  @Test
  public void testProperty8() throws Exception {
	  driver.get(baseUrl + "/PropertyWatch/userLogin.html");
	    driver.findElement(By.linkText("Want to delete account? Click Here")).click();
	    driver.findElement(By.id("user")).clear();
	    driver.findElement(By.id("user")).sendKeys("Pop");
	    driver.findElement(By.id("pwd")).clear();
	    driver.findElement(By.id("pwd")).sendKeys("Tyol");
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    Thread.sleep(5000);
	    
	  
  }
  
  
  
  
  @Test
  public void testProperty9() throws Exception {
	  
	    driver.get(baseUrl + "/PropertyWatch/userLogin.html");
	    driver.findElement(By.id("user")).clear();
	    driver.findElement(By.id("user")).sendKeys("pop");
	    driver.findElement(By.id("pwd")).clear();
	    driver.findElement(By.id("pwd")).sendKeys("tyol");
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	    Thread.sleep(5000);
  }
  
  @Test
  public void testProperty10() throws Exception {
  driver.get(baseUrl + "/PropertyWatch/userLogin.html");
  Thread.sleep(5000);
  driver.findElement(By.cssSelector("button.btn.btn-default")).click();
  Thread.sleep(5000);
  }
  
  
  
  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
