package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass {
	WebDriver driver;


@Given("User is on Sign up page")
public void user_is_on_Sign_up_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srile\\Videos\\Cucumber\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}

@When("User enters the {string} ,{string},{string},{string}and {string}")
public void user_enters_the_and(String s1, String s2, String s3, String s4, String s5) {
	 WebElement first = driver.findElement(By.xpath("//input[@name='firstname']"));
	   first.sendKeys(s1);
	   
	   WebElement last = driver.findElement(By.xpath("//input[@name='lastname']"));
	   last.sendKeys(s2);
	   
	   WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	   email.sendKeys(s3);
	   
	   WebElement reenter = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	   reenter.sendKeys(s4);
	   
	   WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	   pass.sendKeys(s5);
			 
}
  
@When("User need to choose date and choose gender")
public void user_need_to_choose_date_and_choose_gender() throws AWTException {
    
	Robot r = new Robot();

	WebElement day = driver.findElement(By.id("day"));
	day.click();
	
	r.keyPress(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_UP);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	WebElement month = driver.findElement(By.id("month"));
	month.click();
	r.keyPress(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_UP);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
		
	WebElement year = driver.findElement(By.id("year"));
	year.click();
	
	r.keyPress(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_UP);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	gender.click();
	
}

@Then("click sign up button")
public void click_sign_up_button() throws InterruptedException {
	Thread.sleep(3000);
	
	WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	signup.click();

}


}
