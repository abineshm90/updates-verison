package com.page;

import java.util.List;

/**
 * 
 * @author Srilekha D
 * @author Steps for Login page
 * @date 29/12/2019
 *
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private List<WebElement> user;

	@FindBy(id = "password")
	private List<WebElement> pass;

	@FindBy(id = "login")
	private List<WebElement> logbtn;

	public List<WebElement> getUser() {
		return user;
	}

	public List<WebElement> getPass() {
		return pass;
	}

	public List<WebElement> getLogbtn() {
		return logbtn;
	}

}
