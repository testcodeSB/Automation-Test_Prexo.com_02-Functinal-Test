package DealsDrayFunctionalTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToTestPrexoWeb {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.dealsdray.com/");
		
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='material-icons notranslate MuiIcon-root MuiIcon-fontSizeMedium icon css-1jgtvd5']")).click();
		
		driver.findElement(By.xpath("//span[text()='Orders']")).click();
		driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\HP\\Downloads\\demo-data.xlsx");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Import']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		
		
		
		Thread.sleep(2000);
		String timestamp = getCurrentTimestamp();
		WebElement element = driver.findElement(By.xpath("//tr[4][@class='MuiTableRow-root css-1gqug66']"));
		Actions act=new Actions(driver);
		act.moveToElement(element).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
		
        String screenshotName = "./DealsDrayPrexoScreenshots/Homepage1-" + timestamp + ".png";
		TakesScreenshot Ts=(ChromeDriver) driver;
		File Src = Ts.getScreenshotAs(OutputType.FILE);
		File target = new File(screenshotName);
		FileHandler.copy(Src, target);
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.xpath("//tr[8][@class='MuiTableRow-root css-1gqug66']"));
		act.moveToElement(element2).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
		String screenshotName2 = "./DealsDrayPrexoScreenshots/Homepage2-" + timestamp + ".png";
		File Src2 = Ts.getScreenshotAs(OutputType.FILE);
		File target2 = new File(screenshotName2);
		FileHandler.copy(Src2, target2);
		Thread.sleep(2000);
		
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[4]/table/tbody/tr[4]/td[12]"));
		act.moveToElement(element3).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
		String screenshotName3 = "./DealsDrayPrexoScreenshots/Homepage3-" + timestamp + ".png";
		File Src3 = Ts.getScreenshotAs(OutputType.FILE);
		File target3 = new File(screenshotName3);
		FileHandler.copy(Src3,target3);
		Thread.sleep(2000);
		
		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[4]/table/tbody/tr[10]/td[12]"));
		act.moveToElement(element4).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
		String screenshotName4 = "./DealsDrayPrexoScreenshots/Homepage4-" + timestamp + ".png";
		File Src4 = Ts.getScreenshotAs(OutputType.FILE);
		File target4 = new File(screenshotName4);
		FileHandler.copy(Src4,target4);
		Thread.sleep(2000);
		
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[4]/table/tbody/tr[5]/td[17]"));
		act.moveToElement(element5).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
		String screenshotName5 = "./DealsDrayPrexoScreenshots/Homepage5-" + timestamp + ".png";
		File Src5 = Ts.getScreenshotAs(OutputType.FILE);
		File target5 = new File(screenshotName5);
		FileHandler.copy(Src5,target5);
		Thread.sleep(2000);
		
		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[4]/table/tbody/tr[10]/td[17]"));
		act.moveToElement(element6).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
		String screenshotName6 = "./DealsDrayPrexoScreenshots/Homepage6-" + timestamp + ".png";
		File Src6 = Ts.getScreenshotAs(OutputType.FILE);
		File target6 = new File(screenshotName6);
		FileHandler.copy(Src6,target6);
		
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

	public static String getCurrentTimestamp() {
		// TODO Auto-generated method stub
		 	LocalDateTime currentTime = LocalDateTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmm");
	        return currentTime.format(formatter);
	        
	}

}
