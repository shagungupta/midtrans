package org.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_midtran {
	ChromeDriver driver;
	public login_midtran(ChromeDriver driver) {
		this.driver=driver;
	}
	public void checkout() throws InterruptedException {
	Thread.sleep(4000);
	WebElement buynow=driver.findElement(By.xpath("//a[@class='btn buy']"));
	buynow.click();
	Thread.sleep(4000);
	WebElement checkout=driver.findElement(By.xpath("//div[@class='cart-checkout']"));
	checkout.click();
	driver.switchTo().frame(0);
	Thread.sleep(7000);
	WebElement continu=driver.findElement(By.xpath("//a[@class='button-main-content']"));
	continu.click();
	Thread.sleep(4000);
	WebElement credit=driver.findElement(By.xpath("//div[@class='list-title text-actionable-bold']"));
	credit.click();
}
}