package com.page;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.LibGlobal;

/**
 * 
 * @author Srilekha D
 * @author Steps for search hotel page
 * @date 29/12/2019
 *
 */

public class SearchHotelPage extends LibGlobal {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private List<WebElement> Loc;

	public List<WebElement> getLoc() {
		return Loc;
	}

	@FindBy(id = "hotels")
	private List<WebElement> hotels;

	public List<WebElement> getHotels() {
		return hotels;
	}

	public void setHotels(List<WebElement> hotels) {
		this.hotels = hotels;
	}

	public List<WebElement> getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(List<WebElement> roomtype) {
		this.roomtype = roomtype;
	}

	public List<WebElement> getRoomno() {
		return roomno;
	}

	public void setRoomno(List<WebElement> roomno) {
		this.roomno = roomno;
	}

	@FindBy(id = "room_type")
	private List<WebElement> roomtype;

	@FindBy(id = "room_nos")
	private List<WebElement> roomno;

	@FindBy(id = "adult_room")
	private List<WebElement> adultroom;

	@FindBy(id = "child_room")
	private List<WebElement> childroom;

	public List<WebElement> getAdultroom() {
		return adultroom;
	}

	public List<WebElement> getChildroom() {
		return childroom;
	}

	@FindBy(id = "Submit")
	private List<WebElement> search;

	public List<WebElement> getSearch() {
		return search;
	}

}
