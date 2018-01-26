package cucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenTest {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Abk/Tools/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.startpage.com");
		driver.findElement(By.id("query")).sendKeys("paris");
		driver.findElement(By.id("submit1")).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}




