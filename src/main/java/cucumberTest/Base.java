package cucumberTest;

import pageFactory.Homepage;
import tools.WebDrive;


public class Base {

	
	public Homepage Homepage;
	public WebDrive perform;
	
	public Base(String browser) {

		Homepage=new Homepage(browser);

		perform=new WebDrive(Homepage.D.driver);
	}
	
	

}
