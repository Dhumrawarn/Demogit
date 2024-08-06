package SeleniumPractice;

import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement login =driver.findElement(By.xpath("//span[@id = 'nav-link-accountList-nav-line-1']"));
		login.click();
		//Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email_login']"));
		email.sendKeys("7972135323");
		
		WebElement cont_but = driver.findElement(By.xpath("//input[@class='a-button-input']"));
		cont_but.click();
		
		driver.close();
		
		
				
	}

}
