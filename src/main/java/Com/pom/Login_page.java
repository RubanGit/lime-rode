package Com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
   
public class Login_page {
	public WebDriver driver; 
		
	
public  Login_page(WebDriver dive) {
	driver=dive;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[text()='SHOP MEN']")
private WebElement login;

@FindBy(xpath="//a[@id='men_category']")
private WebElement men;

@FindBy(xpath="(//a[@class='c5 subCatItem tdN vT cuP'][normalize-space()='t-shirts'])[1]")
private WebElement tshirt;
	

@FindBy(xpath="//div[text()='Low Price']")//--//div[text()='Low Price']
private WebElement Lowprice;


@FindBy(xpath="//img[@id='17119447']")				////img[@id='17119447']
private WebElement Mrppriceproduct ;


public WebElement getMen() {
	return men;
}


public WebElement getTshirt() {
	return tshirt;
}


public WebElement getLowprice() {
	return Lowprice;
}



public WebElement getMrppriceproduct() {
	return Mrppriceproduct;
}


public WebElement getLogin() {
	return login;
}






}
