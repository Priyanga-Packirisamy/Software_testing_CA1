package com.selenium.Cse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CA1Q2 {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  
	  driver.manage().window().maximize();

	  driver.get("https://www.amazon.in/");
	  
	  Thread.sleep(3000);

	  driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("power bank");
	  
	  driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(Keys.ENTER);
	  
	  String p1 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
	  String p2 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
	  String p3 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
	  String p4 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
	  String p5 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
	  
	  System.out.println(p1);
	  System.out.println(p2);
	  System.out.println(p3);
	  System.out.println(p4);
	  System.out.println(p5);
	  
//	  WebElement str = driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]"));
//	  str.click();
//
//	  Select dropdown = new Select(str);
//	  dropdown.selectByIndex(1);
//	  Thread.sleep(3000);
//	  dropdown.selectByIndex(2);
//	  Thread.sleep(3000);
//	  dropdown.selectByIndex(3);
//	  Thread.sleep(3000);
//	  dropdown.selectByIndex(4);
//	  
//	  System.out.println("success");
  }
}
