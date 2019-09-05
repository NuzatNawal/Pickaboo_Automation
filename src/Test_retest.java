import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_retest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.pickaboo.com/");
		driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div[2]/div[1]/div/div/div[2]/div[2]/div/a")).click();
		driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div[3]/form/div/div/div/ul/li[1]/div/input")).click();
		driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div[3]/form/div/div/div/ul/li[1]/div/input")).sendKeys("prova.nowshin@gmail.com");
		driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div[3]/form/div/div/div/ul/li[1]/div/input")).click();
		driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div[3]/form/div/div/div/ul/li[2]/div/input")).sendKeys("pr33tha");
		driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div[3]/form/div/div/div/ul/li[3]/div/button")).click();
		Thread.sleep(7500);
		//driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/form/div/div/input")).sendKeys("pr33tha");
		//driver.findElement(By.xpath("html/body/div[2]/div/div[4]/div/div/div[2]/div/div[1]/div[2]/div[2]/ul/li[1]/a")).click();
		/*Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[2]/div[1]/div/div/div[2]/div[2]/div/a/span"));
		action.moveToElement(we).moveToElement(driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[2]/div[1]/div/div/div[2]/div[2]/div/div/div/ul/li/a/span"))).build().perform();
		Actions builder = new Actions(driver);
		builder.moveToElement(hoverElement).perform();
		By locator = By.id("clickElementID");
		driver.click(locator);*/
		
		//WebElement TxtBoxContent = driver.findElement(By.linkText("My Account"));
		//Actions builder = new Actions(driver);
		//builder.moveToElement(TxtBoxContent).perform();
		//By locator = By.linkText("My Account");
		//driver.click(locator);
		
		/*Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[2]/div[1]/div/div/div[2]/div[2]"));
		action.moveToElement(we).moveToElement(driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[2]/div[1]/div/div/div[2]/div[2]/div/div/div/ul/li/a/span"))).click().build().perform();*/
		
		driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/form/div/div/input")).click();
		driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/form/div/div/input")).sendKeys("Bluetooth Speaker");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[3]/div/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/form/div/div/button")).click();
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		//SCROLL*/
		
		driver.findElement(By.xpath("html/body/div[2]/div/div[4]/div/div/div[2]/div/div[2]/div[2]/div[2]/ul/li[4]/div/div[1]/a/img[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div[4]/div/div/div[2]/div/div[1]/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[6]/dl/dd/div/ul/li[1]/a/span[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div[4]/div/div/div[2]/div/div[1]/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[7]/div[3]/div[2]/button[1]")).click();
		Thread.sleep(7500);
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div[7]/div/div/div[4]/a[3]")).click();
		Thread.sleep(5000);
		
		//LOGOUT USING "linktext"
		driver.findElement(By.linkText("My Account")).click(); 
		driver.findElement(By.xpath("html/body/div[2]/div/div[4]/div/div/div[2]/div/div[1]/div[2]/div[2]/ul/li[1]/a")).click();
				
	
		
	}
	

}
