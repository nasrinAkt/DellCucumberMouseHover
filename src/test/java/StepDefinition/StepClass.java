package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepClass {
	WebDriver driver;
	@Given("^open dell application$")
	public void open_dell_application() throws Throwable {
	   System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
	   ChromeOptions run = new ChromeOptions();
	   run.addArguments("--remote-allow-origins=*");
	   
	   driver = new ChromeDriver();
	   driver.get("https://www.dell.com/en-us");
	   
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.manage().window().maximize();
	   
	   
	}

	@Then("^Mouse Hover services$")
	public void mouse_Hover_services() throws Throwable {
	 
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Services']"))).build().perform();
		
		 Thread.sleep(2000);
		
	}

	@Then("^click view all services$")
	public void click_view_all_services() throws Throwable {
	  WebElement view = driver.findElement(By.xpath("//a[text()='View All Services']")); 
	  
	  view.click();
	  
	  Thread.sleep(2000);
	  
	  driver.close();
	}
	@Then("^Mouse Hover IT intrastructure$")
	public void mouse_Hover_IT_intrastructure() throws Throwable {
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.xpath("//span[text()='IT Infrastructure']"))).build().perform();
	Thread.sleep(2000);
	   
	}

	@Then("^Mouse Hover on Products$")
	public void mouse_Hover_on_Products() throws Throwable {
	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.xpath("//button[text()='Products']"))).build().perform();
	  
	Thread.sleep(2000);
	  
	}

	@Then("^click Servers$")
	public void click_Servers() throws Throwable {
	WebElement ser = driver.findElement(By.linkText("Servers"));
	ser.click();
	Thread.sleep(2000);
	  driver.close();
	}

	@Then("^Mouse Hover Computers & Accessories$")
	public void mouse_Hover_Computers_Accessories() throws Throwable {
	 Actions ac = new Actions(driver);
	 ac.moveToElement(driver.findElement(By.xpath("//span[text()='Computers & Accessories']"))).build().perform();
	 
	 Thread.sleep(2000);
	 
	}

	@Then("^Mouse Hover on Laptops$")
	public void mouse_Hover_on_Laptops() throws Throwable {
	Actions see = new Actions(driver);
	
	see.moveToElement(driver.findElement(By.xpath("//button[text()='Laptops']"))).build().perform();
	Thread.sleep(2000);
	
	}

	@Then("^click view all laptops$")
	public void click_view_all_laptops() throws Throwable {
	  WebElement view = driver.findElement(By.linkText("View All Laptops"));
	  
	  view.click();
	  
	  Thread.sleep(2000);
	  
	  driver.close();
	}

	@Then("^mouse hover on deals$")
	public void mouse_hover_on_deals() throws Throwable {
	   Actions ac = new Actions(driver);
	   ac.moveToElement(driver.findElement(By.xpath("//span[text()='Deals']"))).build().perform();
	   
	   Thread.sleep(2000);
	   
		
		
	}

	@Then("^click Computer Accessories deals$")
	public void click_Computer_Accessories_deals() throws Throwable {
	   
		WebElement run = driver.findElement(By.xpath("//button[text()='Computer Accessories Deals']"));
		run.click();
		Thread.sleep(2000);
		
		
	}

	@Then("^click on audio deals$")
	public void click_on_audio_deals() throws Throwable {
	  WebElement t = driver.findElement(By.linkText("Audio Deals"));
	  t.click();
	  Thread.sleep(2000);
	 
		
	}

	@Then("^Verify user can see audio deals$")
	public void verify_user_can_see_audio_deals() throws Throwable {
	 
	boolean run1 =	driver.findElement(By.id("hero-subtitle")).isDisplayed();
		Assert.assertTrue(run1);
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Sign In']"))).build().perform();
		Thread.sleep(3000);
		driver.close();
	}





}
