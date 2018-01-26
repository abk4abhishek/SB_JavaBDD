package tools;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDrive {

	public WebDriver driver;
	public WebElement elem;
	
	public WebDrive(String browser){
		
		if(browser=="chrome") {
			System.setProperty("webdriver.chrome.driver","F:\\Abk\\Tools\\chromedriver.exe");
			driver = new ChromeDriver();
			}
	}
	
	public WebDrive(WebDriver D){
		driver=D;
	}
	
	
	public void get(String url) {
		driver.get(url);
	}
	
	public WebElement FindElement(String what,String how) {
		if(how=="id") {
		 elem= driver.findElement(By.id(what));
		}
		return elem;
	}
	
	public void InputText(WebElement x,String input) {
		x.sendKeys(input);
	}
	
	public void Click(WebElement x) {
		x.click();
	}
	
	public String PageTitle() {
		String Title=driver.getTitle();
		return (Title);
	}
	
	public void EndDriver() {
		driver.quit();
	}
	
}
