package com.step;

import Com.base.Base_class;
import Com.pom.Login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step_defination extends Base_class {
	public  Login_page Lp;
	//static Login_page Lp;
//	@Given("User launch the browser {string}")
//	public void user_launch_the_browser(String string) {
//		getDriver(string);
//		
//	}
//	    
//	@When("User launch the Url {string}")
//	public void user_launch_the_Url(String string) {
//		getUrl(string);
//		
//	}
//	    
//	@When("User click on the shop")
//	public void user_click_on_the_shop() throws InterruptedException {
//		Login_page Lp = new Login_page(getDriver());
//
//		Thread.sleep(5000);
//		Lp.getLogin().click();
//	    
//	}
//	
//
////	private WebDriver getDriver() {
////		
////		return null;
////	}
//
//	@When("close the browser")
//	public void close_the_browser() {
//	   
//	}




@Given("User launch the browser {string}")
public void user_launch_the_browser(String string) {
	getDriver(string);

   
}

@When("User launch the Url {string}")
public void user_launch_the_url(String string) {
	getUrl(string);
   
}

@When("User click on the shop")
public void user_click_on_the_shop() throws InterruptedException {
	Login_page Lp = new Login_page(getDriver());
	Thread.sleep(5000);
		Lp.getLogin().click();
   Thread.sleep(2000);
}

@When("User click on men")
public void user_click_on_men() {

	Login_page Lp = new Login_page(getDriver());
	mouseto(Lp.getMen());
	//ClickOneElement(Lp.getMen());//1.from base class,2.Lp is constructor from log in page,3.get men s from getter/setter method 
    
    
}




@When("User click on tshirt")
public void user_click_on_tshirt() throws InterruptedException {
	Login_page Lp = new Login_page(getDriver());
	Thread.sleep(2000);
	//ClickOneElement(Lp.getTshirt());
	mouseto(Lp.getTshirt());
	mouseclick(Lp.getTshirt());
	Thread.sleep(2000); 
}

@When("user click low price")
public void user_click_low_price() throws InterruptedException {
	Login_page Lp = new Login_page(getDriver());
	Lp.getLowprice().click();
    
}

@When("use click Mrp price")
public void use_click_mrp_price() throws InterruptedException {
	Login_page Lp = new Login_page(getDriver());
	Thread.sleep(2000); 
    Lp.getMrppriceproduct().click();
}




}
