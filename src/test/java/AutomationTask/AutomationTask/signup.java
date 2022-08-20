package AutomationTask.AutomationTask;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class signup {
	   public static WebDriver driver;
	   public static XSSFWorkbook wB;
	   public static WebDriverWait wait;
	   
@BeforeClass
	public static void WebDriver() throws Exception
 {
		System.setProperty("webdriver.chrome.driver",
				"E:\\work space\\AutomationTask\\src\\test\\resources\\chromedriver1.exe");
	    driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(15);
 }
        @Test
		public void test() throws Exception {
     	   

		WebElement signin= driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
	    signin.click();
	    WebElement Email=driver.findElement(By.id("email_create"));
		Email.sendKeys("Test654999@gmail.com");
		
		WebElement CreateAccount= driver.findElement(By.id("SubmitCreate"));
		CreateAccount.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		j.executeScript("window.scrollBy(0,-500)");
		
		WebElement Gender= driver.findElement(By.id("uniform-id_gender2"));
		Gender.click();
		
		
		WebElement Firstname=driver.findElement(By.id("customer_firstname"));
		Firstname.sendKeys("Nagham");
		
		WebElement Lastname=driver.findElement(By.id("customer_lastname"));
		Lastname.sendKeys("Mohamed");
		
		j.executeScript("window.scrollBy(0,500)");
		j.executeScript("window.scrollBy(0,-500)");
		
		WebElement Password=driver.findElement(By.id("passwd"));
		Password.sendKeys("TY65#F56");
		
		Select Days=new Select( driver.findElement(By.id("days")));
		Days.selectByValue("17");
		
		Select Months=new Select( driver.findElement(By.id("months")));
		Months.selectByValue("10");
		
		Select Years=new Select( driver.findElement(By.id("years")));
		Years.selectByValue("1990");
		
		
		//firstname
		WebElement Firstname1=driver.findElement(By.id("firstname"));
		Firstname1.sendKeys("nagham");
		
		//lastname
		WebElement Lastname1=driver.findElement(By.id("firstname"));
		Lastname1.sendKeys("Mohamed");
		
		j.executeScript("window.scrollBy(0,500)");
		j.executeScript("window.scrollBy(0,-500)");
		
		//company
		WebElement Company= driver.findElement(By.id("company"));
		Company.sendKeys("TestCompany");
		
		//address1
		WebElement Address= driver.findElement(By.id("address1"));
		Address.sendKeys("Maadi");
		
		//City
		WebElement City= driver.findElement(By.id("city"));
		City.sendKeys("Maadi Gdeda");
		
		//id_state
		Select States=new Select( driver.findElement(By.id("id_state")));
		States.selectByValue("43");
		
		//postcode
		WebElement postalcode= driver.findElement(By.id("postcode"));
		postalcode.sendKeys("44444");
		
		j.executeScript("window.scrollBy(0,500)");
		j.executeScript("window.scrollBy(0,-500)");
		
		Select Country=new Select( driver.findElement(By.id("id_country")));
		Country.selectByValue("21");
		
		//other
		WebElement Additionalinfo= driver.findElement(By.id("other"));
		Additionalinfo.sendKeys("Test");
		
		//phone
		WebElement Homephone= driver.findElement(By.id("phone"));
		Homephone.sendKeys("222222222");
		
		//phone_mobile
		WebElement MobilePhone= driver.findElement(By.id("phone_mobile"));
		MobilePhone.sendKeys("0114444444");
		
		//alias
		WebElement Address2= driver.findElement(By.id("alias"));
        Address2.sendKeys("Alternative 22");
		
        //submitAccount
        WebElement SubmitAccount= driver.findElement(By.id("submitAccount"));
        SubmitAccount.click();
        
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String URL= driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://automationpractice.com/index.php?controller=my-account");
        
	    
}
@AfterTest
public void quit() {
	driver.quit();
}
}
