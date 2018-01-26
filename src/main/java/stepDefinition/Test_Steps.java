package stepDefinition;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumberTest.Base;

public class Test_Steps {
//	public static WebDriver driver=null;
	public static Base root=null;
	@Given("^User is on Home Page of SPIX$")
	public void user_is_on_Home_Page_of_SPIX() throws Throwable {
		root=new Base("chrome");
		root.Homepage.Open();
		
//		System.setProperty("webdriver.chrome.driver", "F:/Abk/Tools/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://www.startpage.com");
	}

	@When("^User inputs Search term in the Search Box$")
	public void user_inputs_Search_term_in_the_Search_Box() throws Throwable {
//		driver.findElement(By.id("query")).sendKeys("paris");
		root.Homepage.InputSearch("bitcoin");
	}

	@When("^User clicks Go button$")
	public void user_clicks_Go_button() throws Throwable {
//		driver.findElement(By.id("submit1")).click();
		root.Homepage.ClickGo();
	}

	@Then("^User navigates to Web Search page$")
	public void user_navigates_to_Web_Search_page() throws Throwable {
//		System.out.println(driver.getTitle());
		root.Homepage.CheckPageTitle();
	}

	@Then("^Page Title is Startpage Web Search$")
	public void page_Title_is_Startpage_Web_Search() throws Throwable {
//		System.out.println(driver.getTitle());
//		driver.quit();
		root.Homepage.CheckPageTitle();
		root.perform.EndDriver();
	}

}