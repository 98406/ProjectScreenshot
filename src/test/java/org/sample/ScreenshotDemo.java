package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/signup");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		TakesScreenshot tk=(TakesScreenshot)driver;
		Thread.sleep(4000);
		
		WebElement precise = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-ywje51 r-nllxps r-jxj0sb r-16wqof r-1dye5f7']"));
		File screenshotAs = precise.getScreenshotAs(OutputType.FILE);
		Scanner s = new Scanner(System.in);
		String fileName = s.next();
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\screenshot2023\\src\\test\\resources\\Coolsnap\\"+fileName+".png");
		FileUtils.copyFile(screenshotAs, f);
	
		
		
		
	}

}
