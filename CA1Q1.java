package com.selenium.Cse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CA1Q1 {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  
	  driver.manage().window().maximize();
	  
	  Thread.sleep(3000);
		
	  driver.get("https://www.amazon.in/");
	  
	  driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("peanut butter");
	  
	  driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
	  
	  //driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/span/a/div/img")).click();
	  
	  driver.navigate().to("https://www.amazon.in/Saffola-Jaggery-Refined-Crunchy-Protein/dp/B09V35XFTM/ref=sr_1_1_sspa?keywords=peanut+butter&qid=1683193234&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1") ;

	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();

	  Thread.sleep(3000);
	  
	  //driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
	  
	  //driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
      
	  //driver.findElement(By.xpath("//*[@id=\"sc-active-ca30997a-dcba-4e6e-86a9-cd36faf40629\"]/div[4]/div/div[2]/div[1]/span[2]/span/input")).click();
	  
	  System.out.println("Success");
  }
}
