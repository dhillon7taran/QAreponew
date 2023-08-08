package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffWebTable {
	static WebDriver driver;

	static WebElement basetable;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchbrowser();

		// testtable();
		specificrowprint();
	}

	public static void launchbrowser() {

		driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers");

		driver.manage().window().maximize();

	}

	public static void testtable() {

		basetable = driver.findElement(By.tagName("table"));

		List<WebElement> totalRows = basetable.findElements(By.tagName("tr"));

		// List<WebElement> totalRows1 =
		// basetable.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));

		/*
		 * for(int i=0; i<totalRows1.size(); i++) {
		 * 
		 * System.out.println(totalRows.get(i).getText()); }
		 */

		System.out.println(totalRows.size());

		/*
		 * for(WebElement allRows :totalRows) {
		 * 
		 * System.out.println(allRows.getText()); }
		 */

	}

	public static void specificrowprint() {

		basetable = driver.findElement(By.tagName("table"));

		WebElement spRow = basetable.findElement(By.xpath("//*[@id= 'leftcontainer']/table/tbody/tr[21]"));
		String value = spRow.getText();
		System.out.println(value);

		// To get 4th Column data

		WebElement column = basetable.findElement(By.xpath("//*[@id= 'leftcontainer']/table/tbody/tr[21]/td[4]"));
		System.out.println(column.getText());

	}
}
