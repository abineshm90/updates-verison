package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.base.LibGlobal;
import com.page.PageObjectManager;
import io.cucumber.java.en.*;

/**
 * 
 * @author Srilekha D
 * @author Logic for executing steps
 * @date 29/12/2019
 *
 */

public class StepDefinitionClass extends LibGlobal {

	PageObjectManager page;

	@Given("User is on HomePage")
	public void user_is_on_HomePage() {

	}

	@When("User enters the {string} ,{string} and enters booking page")
	public void user_enters_the_and_enters_booking_page(String name, String password) {

		page = new PageObjectManager();
		WebElement user = page.getLogin().getUser().get(0);
		type(user, name);
		Assert.assertEquals("verifying username", name, getAttribute(user));

		WebElement pass = page.getLogin().getPass().get(0);
		type(pass, password);

		WebElement logbtn = page.getLogin().getLogbtn().get(0);
		loginbtn(logbtn);

	}

	@When("User now in search hotel page")
	public void user_now_in_search_hotel_page() {

		WebElement locate = page.getSearch().getLoc().get(0);
		drop(locate, 1);

		WebElement hot = page.getSearch().getHotels().get(0);
		drop(hot, 4);

		WebElement roomtyp = page.getSearch().getRoomtype().get(0);
		drop(roomtyp, 2);

		WebElement roomn = page.getSearch().getRoomno().get(0);
		drop(roomn, 6);

		WebElement adult = page.getSearch().getAdultroom().get(0);
		drop(adult, 3);

		WebElement child = page.getSearch().getChildroom().get(0);
		drop(child, 2);

		WebElement search = page.getSearch().getSearch().get(0);
		loginbtn(search);

		//Assert.assertEquals("https://adactin.com/HotelApp/SearchHotel.php", driver.getCurrentUrl());

	}

	@When("User is on select hotel page")
	public void user_is_on_select_hotel_page() {

		WebElement select = page.getSelect().getSelecthotel().get(0);
		loginbtn(select);

		WebElement conti = page.getSelect().getConti().get(0);
		loginbtn(conti);

		//Assert.assertEquals("https://adactin.com/HotelApp/SelectHotel.php", driver.getCurrentUrl());

	}

	@When("User is on book ahotel page")
	public void user_is_on_book_ahotel_page() {

		WebElement first = page.getBookaHotel().getFirst().get(0);
		type(first, "abinesh");
		WebElement last = page.getBookaHotel().getLastname().get(0);
		type(last, "murugaiyan");
		WebElement address = page.getBookaHotel().getAddress().get(0);
		type(address, "thittanimuttam, thiruvarur district-613702");
		WebElement creditcard = page.getBookaHotel().getCreditcard().get(0);
		type(creditcard, "1234567891234567");
		WebElement ctype = page.getBookaHotel().getCardtype().get(0);
		drop(ctype, 2);
		WebElement month = page.getBookaHotel().getExpmonth().get(0);
		drop(month, 6);
		WebElement year = page.getBookaHotel().getExpyear().get(0);
		drop(year, 2);
		WebElement cvvno = page.getBookaHotel().getCvv().get(0);
		type(cvvno, "1234");
		WebElement book = page.getBookaHotel().getBook().get(0);
		loginbtn(book);

		//Assert.assertEquals("https://adactin.com/HotelApp/BookHotel.php", driver.getCurrentUrl());

	}

	@When("user is on booking confirmation page")
	public void user_is_on_booking_confirmation_page() throws InterruptedException {

		Thread.sleep(15000);
		WebElement attri = page.getPage().getOrderno().get(0);
		String order = getAttribute(attri);
		System.out.println(order);
		//Assert.assertEquals("https://adactin.com/HotelApp/BookingConfirm.php", driver.getCurrentUrl());
		driver.quit();

	}

	@Given("User in the HomePage")
	public void user_in_the_HomePage() {
		getDriver();
		loadUrl("https://adactin.com/HotelApp/");
	}

	@When("User enters {string} ,{string} and enters the booking page")
	public void user_enters_and_enters_the_booking_page(String name, String password) {
		page = new PageObjectManager();
		WebElement user = page.getLogin().getUser().get(0);
		type(user, name);
		Assert.assertEquals("verifying username", name, getAttribute(user));

		WebElement pass = page.getLogin().getPass().get(0);
		type(pass, password);

		WebElement logbtn = page.getLogin().getLogbtn().get(0);
		loginbtn(logbtn);

	}

	@When("User in the search hotel page")
	public void user_in_the_search_hotel_page() {
		WebElement locate = page.getSearch().getLoc().get(0);
		drop(locate, 1);

		WebElement hot = page.getSearch().getHotels().get(0);
		drop(hot, 4);

		WebElement roomtyp = page.getSearch().getRoomtype().get(0);
		drop(roomtyp, 2);

		WebElement roomn = page.getSearch().getRoomno().get(0);
		drop(roomn, 6);

		WebElement adult = page.getSearch().getAdultroom().get(0);
		drop(adult, 3);

		WebElement child = page.getSearch().getChildroom().get(0);
		drop(child, 2);

		WebElement search = page.getSearch().getSearch().get(0);
		loginbtn(search);

		//Assert.assertEquals("https://adactin.com/HotelApp/SearchHotel.php", driver.getCurrentUrl());

	}

	@When("User in theselect hotel page")
	public void user_in_theselect_hotel_page() {

		WebElement select = page.getSelect().getSelecthotel().get(0);
		loginbtn(select);

		WebElement conti = page.getSelect().getConti().get(0);
		loginbtn(conti);

	}

	@When("User in the book ahotel page")
	public void user_in_the_book_ahotel_page() {
		WebElement first = page.getBookaHotel().getFirst().get(0);
		type(first, "srilekha");
		WebElement last = page.getBookaHotel().getLastname().get(0);
		type(last, "Abinesh");
		WebElement address = page.getBookaHotel().getAddress().get(0);
		type(address, "thittanimuttam, thiruvarur district-613702");
		WebElement creditcard = page.getBookaHotel().getCreditcard().get(0);
		type(creditcard, "1234567891234567");
		WebElement ctype = page.getBookaHotel().getCardtype().get(0);
		drop(ctype, 1);
		WebElement month = page.getBookaHotel().getExpmonth().get(0);
		drop(month, 5);
		WebElement year = page.getBookaHotel().getExpyear().get(0);
		drop(year, 2);
		WebElement cvvno = page.getBookaHotel().getCvv().get(0);
		type(cvvno, "1134");
		WebElement book = page.getBookaHotel().getBook().get(0);
		loginbtn(book);
		//Assert.assertEquals("https://adactin.com/HotelApp/BookHotel.php", driver.getCurrentUrl());

	}

	@When("user in the booking confirmation page")
	public void user_in_the_booking_confirmation_page() throws InterruptedException {
		Thread.sleep(15000);
		WebElement attri = page.getPage().getOrderno().get(0);
		String order = getAttribute(attri);
		System.out.println(order);
		//Assert.assertEquals("https://adactin.com/HotelApp/BookingConfirm.php", driver.getCurrentUrl());

	}

	@Given("User in  HomePage")
	public void user_in_HomePage() {
		getDriver();
		loadUrl("https://adactin.com/HotelApp/");

	}

	@When("User enters {string} ,{string}")
	public void user_enters(String name, String password) {
		page = new PageObjectManager();
		WebElement user = page.getLogin().getUser().get(0);
		type(user, name);
		Assert.assertEquals("verifying username", name, getAttribute(user));

		WebElement pass = page.getLogin().getPass().get(0);
		type(pass, password);

		WebElement logbtn = page.getLogin().getLogbtn().get(0);
		loginbtn(logbtn);

	}

	@When("User in search hotel page")
	public void user_in_search_hotel_page() {
		WebElement locate = page.getSearch().getLoc().get(0);
		drop(locate, 1);

		WebElement hot = page.getSearch().getHotels().get(0);
		drop(hot, 4);

		WebElement roomtyp = page.getSearch().getRoomtype().get(0);
		drop(roomtyp, 2);

		WebElement roomn = page.getSearch().getRoomno().get(0);
		drop(roomn, 6);

		WebElement adult = page.getSearch().getAdultroom().get(0);
		drop(adult, 3);

		WebElement child = page.getSearch().getChildroom().get(0);
		drop(child, 2);

		WebElement search = page.getSearch().getSearch().get(0);
		loginbtn(search);
		//Assert.assertEquals("https://adactin.com/HotelApp/SearchHotel.php", driver.getCurrentUrl());

	}

	@When("User in select hotel page")
	public void user_in_select_hotel_page() {
		WebElement select = page.getSelect().getSelecthotel().get(0);
		loginbtn(select);

		WebElement conti = page.getSelect().getConti().get(0);
		loginbtn(conti);
		//Assert.assertEquals("https://adactin.com/HotelApp/SelectHotel.php", driver.getCurrentUrl());

	}

	@When("User in book ahotel page")
	public void user_in_book_ahotel_page() {
		WebElement first = page.getBookaHotel().getFirst().get(0);
		type(first, "arravind");
		WebElement last = page.getBookaHotel().getLastname().get(0);
		type(last, "murugaiyan");
		WebElement address = page.getBookaHotel().getAddress().get(0);
		type(address, "thiruvarur district-613702");
		WebElement creditcard = page.getBookaHotel().getCreditcard().get(0);
		type(creditcard, "321567891234567");
		WebElement ctype = page.getBookaHotel().getCardtype().get(0);
		drop(ctype, 1);
		WebElement month = page.getBookaHotel().getExpmonth().get(0);
		drop(month, 5);
		WebElement year = page.getBookaHotel().getExpyear().get(0);
		drop(year, 2);
		WebElement cvvno = page.getBookaHotel().getCvv().get(0);
		type(cvvno, "1235");
		WebElement book = page.getBookaHotel().getBook().get(0);
		loginbtn(book);
		//Assert.assertEquals("https://adactin.com/HotelApp/BookHotel.php", driver.getCurrentUrl());

	}

	@When("user in booking confirmation page")
	public void user_in_booking_confirmation_page() throws InterruptedException {
		Thread.sleep(15000);
		WebElement attri = page.getPage().getOrderno().get(0);
		String order = getAttribute(attri);
		System.out.println(order);
		//Assert.assertEquals("https://adactin.com/HotelApp/BookingConfirm.php", driver.getCurrentUrl());
		driver.quit();

	}

}
