package pageFactory;

import tools.WebDrive;


public class Homepage {
	
	public WebDrive D;
	
	public String Home_url="https://www.startpage.com";
	public String Search_Inputbox_id="query"; //id
	public String Go_Button_id="submit1"; //id
	public String Page_Title="Startpage Web Search";
	
	public Homepage(String browser){
		D=new WebDrive(browser);
	}
	public void Open() {
		D.get(Home_url);
	}
	
	public void ClickGo() {
		D.Click(D.FindElement(Go_Button_id, "id"));
	}
	
	public void CheckPageTitle() {
		String ActualPageTitle=D.PageTitle();
		if (Page_Title.equals(ActualPageTitle)) {
			System.out.println("Page Title Matched");
		}else {
			System.out.println("Page Title fails to match : Actual != Expected :: "+ ActualPageTitle +" != " + Page_Title );
		}
		
	}
	
	public void InputSearch(String searchterm) {
		D.InputText(D.FindElement(Search_Inputbox_id, "id"), searchterm);
	}
	
}
