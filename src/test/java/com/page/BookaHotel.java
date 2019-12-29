package com.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

/**
 * 
 * @author Srilekha D
 * @author Steps for Booking hotel
 * @date 29/12/2019
 *
 */
public class BookaHotel extends LibGlobal {

	public BookaHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private List<WebElement> first;

	@FindBy(id = "last_name")
	private List<WebElement> lastname;

	@FindBy(id = "address")
	private List<WebElement> address;

	@FindBy(id = "cc_num")
	private List<WebElement> creditcard;

	@FindBy(id = "cc_type")
	private List<WebElement> cardtype;

	@FindBy(id = "cc_exp_month")
	private List<WebElement> expmonth;

	@FindBy(id = "cc_exp_year")
	private List<WebElement> expyear;

	@FindBy(id = "cc_cvv")
	private List<WebElement> cvv;

	@FindBy(id = "book_now")
	private List<WebElement> book;

	public List<WebElement> getFirst() {
		return first;
	}

	public List<WebElement> getLastname() {
		return lastname;
	}

	public List<WebElement> getAddress() {
		return address;
	}

	public List<WebElement> getCreditcard() {
		return creditcard;
	}

	public List<WebElement> getCardtype() {
		return cardtype;
	}

	public List<WebElement> getExpmonth() {
		return expmonth;
	}

	public List<WebElement> getExpyear() {
		return expyear;
	}

	public List<WebElement> getCvv() {
		return cvv;
	}

	public List<WebElement> getBook() {
		return book;
	}

}
