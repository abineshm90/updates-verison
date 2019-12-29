package com.page;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.LibGlobal;

/**
 * 
 * @author Srilekha D
 * @author Steps for select hotel page
 * @date 29/12/2019
 *
 */

public class SelectHotelPage extends LibGlobal {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private List<WebElement> selecthotel;

	public List<WebElement> getSelecthotel() {
		return selecthotel;
	}

	@FindBy(id = "continue")
	private List<WebElement> conti;

	public List<WebElement> getConti() {
		return conti;
	}

}
