package Com.base;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import freemarker.core.ReturnInstruction.Return;
import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class Base_class{
	static WebElement element;
	static WebDriver driver;
	static JavascriptExecutor js;
	static Robot r;						//= new Robot();
	static WebDriverWait wait;			// = new WebDriverWait(driver, 30);
	static Select s;
	static Actions a;

//Selection of Browser			
	public static WebDriver getDriver (String Browser_Name) {
		try {
		if (Browser_Name.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (Browser_Name.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (Browser_Name.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (Browser_Name.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new ChromeDriver();
		}
		else {
			System.out.println("Invalid browser name.");
		}
		} catch (Exception e) {
			System.out.println("Browser getting error");
		}
		return driver;
	}
	
//getURl
	public static WebDriver getUrl(String url)	{
		try {
			getDriver().get(url);
		} catch (Exception e) {
			System.out.println("Invalid Url");
			}
		return getDriver();
	}
	
	
	public void ClickOneElement(WebElement element) {
		element.click();
	}
	
	
	public  static void mouseto(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	public void mouseclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).click().perform();// ----------->4
	}
	

public static  WebDriver getDriver() {
	return driver;
}
}