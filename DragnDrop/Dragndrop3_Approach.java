package DragnDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop3_Approach {

	static WebDriver driver;

	public static void main(String[] args) {
		launchbrowser();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		dragndrop();

	}

	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

	}

	public static void dragndrop() {

		WebElement dragFrom = driver.findElement(By.xpath("//div[@id = 'draggable']"));

		WebElement dropTo = driver.findElement(By.xpath("//div[@id = 'droppable']"));

		// To perform mouse event we use Actions class in Selenium
		
		

		Actions action = new Actions(driver);

		action.dragAndDrop(dragFrom, dropTo).build().perform();

	}
}
