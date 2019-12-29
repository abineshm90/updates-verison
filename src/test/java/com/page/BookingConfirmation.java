package com.page;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.LibGlobal;

/**
 * 
 * @author Srilekha D
 * @author Steps for Booking confirmation
 * @date 29/12/2019
 *
 */

public class BookingConfirmation extends LibGlobal {

	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private List<WebElement> orderno;

	public List<WebElement> getOrderno() {
		return orderno;
	}

	@FindBy(xpath = "(//td[@align='right'])[17]")
	private List<WebElement> printorder;

	public List<WebElement> getPrintorder() {
		return printorder;
	}

}
