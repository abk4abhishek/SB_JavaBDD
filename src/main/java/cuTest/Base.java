package cuTest;

import pageFactory.Homepage;
import tools.WebDrive;


public class Base{

	
	public Homepage Homepage;
	public WebDrive D;
	
	public Base(String browser) {
		
		D=new WebDrive(browser);
		Homepage=new Homepage(D);

		
	}
	
	

}
