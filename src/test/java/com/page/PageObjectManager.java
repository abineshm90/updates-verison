package com.page;

/**
 * 
 * @author Srilekha D
 * @author For storing all objects
 * @date 29/12/2019
 *
 */

public class PageObjectManager {

	private LoginPage loginPage;
	private SearchHotelPage search;
	private SelectHotelPage select;;
	private BookaHotel bookaHotel;
	private BookingConfirmation page;

	public LoginPage getLogin() {

		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public SearchHotelPage getSearch() {
		return (search == null) ? search = new SearchHotelPage() : search;
	}

	public SelectHotelPage getSelect() {
		return (select == null) ? select = new SelectHotelPage() : select;
	}

	public BookaHotel getBookaHotel() {
		return (bookaHotel == null) ? bookaHotel = new BookaHotel() : bookaHotel;
	}

	public BookingConfirmation getPage() {
		return (page == null) ? page = new BookingConfirmation() : page;
	}

}
