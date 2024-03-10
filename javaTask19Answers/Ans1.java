package javaTask19Answers;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ans1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.guvi.in/register");
		driver.findElement(By.className("form-control")).sendKeys("testmiller");
		driver.findElement(By.xpath("//div/input[@type='email']")).sendKeys("testmiller04@gmail.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Testuser@123");
		driver.findElement(By.id("mobileNumber")).sendKeys("7824966305");
		WebElement text = driver.findElement(By.tagName("h2"));
		text.getText();
		driver.findElement(By.id("signup-btn")).click();
	}

}
