package TestBase;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	WebDriver driver;
	public void init_browser() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Taranjot\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();// It is 
	}
	
	
	public void execute(String teststeps, String locatorType, String selector, String action, String value) {
		
		WebElement element;
		switch(action.toLowerCase()) 
		{
		case "openbrowser":
			System.out.println("I want to open chrome browser");
			init_browser();
			driver.manage().window().maximize();
			break;
		case "enterurl":
			driver.get(value);
			break;
		case "sleep":
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "sendkeys":
			element = getElement(locatorType, selector);
            element.clear();
		element.sendKeys(value);
			break;
		case "click":
			element = getElement(locatorType, selector);

			element.click();
			break;

		default:
			break;
}
	}
	public WebElement getElement(String locatorType, String selector) {

    WebElement element = null;
    
    switch(locatorType) {
    case"id":
    	element = driver.findElement(By.id(selector));
    	break;
    case "name":
		element = driver.findElement(By.name(selector));
		break;
	case "xpath":
		element = driver.findElement(By.xpath(selector));
		break;
	case "tagname":
		element = driver.findElement(By.tagName(selector));
		break;
	case "cssselector":
		element = driver.findElement(By.cssSelector(selector));
		break;
	case "partialLinkText":
		element = driver.findElement(By.partialLinkText(selector));
		break;
	case "LinkText":
		element = driver.findElement(By.linkText(selector));
		break;
	case "className":
		element = driver.findElement(By.className(selector));
		break;
	default:
		break;
    
    }
		return element;
	}
}