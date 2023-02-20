package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyerReg {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myer.com.au/");
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-disableElevation MuiButton-fullWidth']")).click();
		driver.findElement(By.xpath("(//span[@class='css-3v65nm'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.id("email")).sendKeys("ram.m94@gmail.com");
		Thread.sleep(1500);
		 driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		 driver.findElement(By.id("password")).sendKeys("Ganesh");
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ram");
		 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Kumar");
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("0498407");
		 driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("01/03/2025");
		 driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("Sydney");
		 driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		   String text4 = driver.findElement(By.xpath("//span[@id='password-error-text']")).getText();
		   System.out.println("Error message of password: "+text4);
		 String text3 = driver.findElement(By.xpath("//span[@id='mobile-phone-error-text']")).getText();
		 System.out.println("Error message of phone number: "+text3);
		 String text2 = driver.findElement(By.xpath("//span[@id='date-of-birth-error-text']")).getText();
		 System.out.println("Error message of DOB: "+text2);
		 String text = driver.findElement(By.xpath("//span[@id='address-error-text']")).getText();
		 System.out.println("Error message of address: "+text);
		 TakesScreenshot tk= (TakesScreenshot)driver;
		 File pass = tk.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\screenshot2023\\src\\test\\java\\org\\sample\\passscreen.java\\Passtxt");
		FileUtils.copyFile(pass, f);
		

	}

}
