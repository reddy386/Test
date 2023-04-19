package Day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NopcommerceTest {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
          driver.findElement(By.id("Email")).clear();
	      driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	      driver.findElement(By.id("Password")).clear();
	      driver.findElement(By.id("Password")).sendKeys("admin");
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	    String excpt = driver.getTitle();
	    String actu = "Dashboard / nopCommerce administration";
	      if(actu.equals(excpt)) {
	    	  System.out.println("The Test case was working fine");
	      }else
	      {
	    	  System.out.println("The Test case was  not working fine");
	      }
	   
	driver.close();
	}

} 
