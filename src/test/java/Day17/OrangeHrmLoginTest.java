package Day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLoginTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      driver.findElement(By.name("username")).sendKeys("Admin");
	      driver.findElement(By.name("password")).sendKeys("admin123");
	      driver.findElement(By.cssSelector("button[type='submit']")).click();
	    String excpt = driver.getTitle();
	    String actu = "OrangeHRM";
	      if(actu.equals(excpt)) {
	    	  System.out.println("The Test case was working fine");
	      }else
	      {
	    	  System.out.println("The Test case was  not working fine");
	      }
	   
	driver.quit();
	}

} 
