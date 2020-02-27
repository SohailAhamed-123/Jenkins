import java.awt.List;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select2 {
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\EnteringValues\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.bigw.com.au/");
		
		WebElement f= d.findElement(By.xpath("//i[@class='fa fa-chevron-down chevron']"));
		
		Select s=new Select(f);
		java.util.List<WebElement> options = s.getOptions();
		
		for (WebElement w : options) {
			
			String text = w.getText();
			
			if(text.equals("Entertainment")) {
				
				System.out.println(text);
				
			}
			
		}
		
		
		
		
		
		
		
		
	}
	

}
