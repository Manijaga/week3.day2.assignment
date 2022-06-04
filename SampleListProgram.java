package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleListProgram {

	public static void main(String[] args) throws InterruptedException {
		// webdrive setup
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		// lunch URL
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// in the search box type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.name("searchVal")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		// to the left of the screen under "Gender" click the "Men"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"))
				.click();
		Thread.sleep(2000);
		// Under "Category" click "Fashion Bags
		driver.findElement(By.xpath(
				"//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']"))
				.click();
		// Print the count of the items Found.
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		int size = driver.findElements(By.xpath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']/div"))
				.size();
		System.out.println("The count of the items Found - " + size);
		// Get the list of brand of the products displayed in th.size()e page and print
		// the list.
		// Get the list of names of the bags and print it
		for (int i = 1; i < size; i++) {
			System.out.println("Set:- " + i + " Brand Name:- " + driver.findElements(By.xpath(
					"//div[@class='ReactVirtualized__Grid__innerScrollContainer']/div/a/div/div[2]/div[@class='brand']"))
					.get(i).getText() + " AND Bag Name:- "
					+ driver.findElements(By.xpath(
							"//div[@class='ReactVirtualized__Grid__innerScrollContainer']/div/a/div/div[2]/div[2]"))
							.get(i).getText());
		}
	}

}
