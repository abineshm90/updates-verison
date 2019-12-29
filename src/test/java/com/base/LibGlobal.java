package com.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author Srilekha D
 * @author To maintain resuable code
 * @date 29/12/2019
 *
 */
public class LibGlobal {

	public static WebDriver driver;

	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srile\\Videos\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	/**
	 * 
	 * @param url
	 */

	public static void loadUrl(String url) {
		driver.get(url);

	}
	
	/**
	 * 
	 * @param data
	 * @return
	 */

	public String getConfig(String data) {
		String value = null;
		try {

			Properties p = new Properties();

			p.load(new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties"));
			value = (String) p.get(data);

		} catch (Throwable e) {

			e.printStackTrace();
		}
		return value;

	}
	/**
	 * 
	 * @param e
	 * @param name
	 */

	public static void type(WebElement e, String name) {
		e.sendKeys(name);
	}
	
	/**
	 * 
	 * @param e
	 */

	public static void loginbtn(WebElement e) {
		e.click();
	}
	
	/**
	 * 
	 * @param e
	 * @param value
	 */

	public static void drop(WebElement e, int value) {
		Select s = new Select(e);
		s.selectByIndex(value);

	}
	/**
	 * 
	 * @param e
	 */

	public static void getText(WebElement e) {
		String text = e.getText();
		System.out.println(text);

	}
	/**
	 * 
	 * @param e
	 * @return
	 */

	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}

	public static void quit() {
		driver.quit();

	}

}
