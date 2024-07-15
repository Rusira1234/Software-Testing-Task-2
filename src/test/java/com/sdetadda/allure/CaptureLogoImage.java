package com.sdetadda.allure;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class CaptureLogoImage {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\123\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://10.14.86.94:51802/index.html#");
		
		//WebElement logoImageElement =  driver.findElement(By.id("content"));
		
		//Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver,logoImageElement);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Screenshot logoImageScreenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(1000))
                .takeScreenshot(driver);
		
		ImageIO.write(logoImageScreenshot.getImage(), "png", new File("C:\\HP Backup\\Software Testing and Analysis\\Allure Report Generation\\AllureReportJ2HTML\\Screenshots\\theShot.png"));
		
		File f = new File("C:\\HP Backup\\Software Testing and Analysis\\Allure Report Generation\\AllureReportJ2HTML\\Screenshots\\theShot.png");
		
		if(f.exists()) {
			System.out.println("The allure report was captured");
			driver.quit();
		}else {
			System.out.println("The image was not captured");
			driver.quit();
		}
	}

}
