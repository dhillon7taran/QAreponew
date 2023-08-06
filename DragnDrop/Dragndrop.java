package DragnDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {

	static WebDriver driver;

	public static void main(String[] args) {
		launchbrowser();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		dragndrop();

	}

	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://javascript.info/article/mouse-drag-and-drop/ball4/");
		driver.manage().window().maximize();

	}

	public static void dragndrop() {

		WebElement dragFrom = driver.findElement(By.xpath("//img[@id = 'ball']"));

		WebElement dropTo = driver.findElement(By.xpath("//img[@id = 'gate']"));

		// To perform mouse event we use Actions class in Selenium

		Actions action = new Actions(driver);

		action.dragAndDrop(dragFrom, dropTo).build().perform();

	}
}
