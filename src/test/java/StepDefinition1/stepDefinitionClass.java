package StepDefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepDefinitionClass {
	
	 static WebDriver driver;
	
	

	
	
	 @Given("user is on BigW search page")
	 public void user_is_on_BigW_search_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\EnteringValues\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bigw.com.au/");
	}

	 @When("user enter iphone")
	 public void user_enter_iphone() {
	    WebElement search=driver.findElement(By.id("site-search-text"));
			search.sendKeys("iphone");
			WebElement click = driver.findElement(By.xpath("//button[@class='siteSearchSubmit btn']"));
			click.click();
	}
	 
	 @When("user select baby section")
	 public void user_select_baby_section() {
		 WebElement s = driver.findElement(By.xpath("//div[@class='site-search-department-display']"));
		 Select s1=new Select(s);
		 s1.selectByVisibleText("Baby");

}
}
