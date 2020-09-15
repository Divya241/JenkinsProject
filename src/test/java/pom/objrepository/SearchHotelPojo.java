package pom.objrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchHotelPojo extends LibGlobal{

	
	public SearchHotelPojo() {
	
		PageFactory.initElements(driver, this);
		}

	@FindBy(id="location")
	private WebElement locn;
	
	@FindBy(id="hotels")
	
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement type;
	
	@FindBy(id="room_nos")
	private WebElement nor;
	
	@FindBy(id="datepick_in")
	private WebElement indate;
	
	@FindBy(id="datepick_out")
	private WebElement outdate;
	
	@FindBy(id="adult_room")
	private WebElement room;
	
	@FindBy(id="child_room")
	private WebElement chldroom;
	@FindBy(id="Submit")
	private WebElement search;
	
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookItinerary;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logOut;
	
	
	public WebElement getBookItinerary() {
		return bookItinerary;
	}
	public WebElement getLogOut() {
		return logOut;
	}
	
	public WebElement getLocn() {
		return locn;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getNor() {
		return nor;
	}
	public WebElement getIndate() {
		return indate;
	}
	public WebElement getOutdate() {
		return outdate;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getChldroom() {
		return chldroom;
	}
	public WebElement getSearch() {
		return search;
	}
	public void searchHotel(String locn, String hotl, String type, String num, String inDate, String outDate, String adult, String child) throws InterruptedException {
	   
	    
	    select1(getLocn(),locn);	
	    select1(getHotel(),hotl);
	    select1(getType(),type);
	    select1(getNor(),num);
	    fill(getIndate(),inDate);
	    fill(getOutdate(),outDate);
	    select1(getRoom(),adult);
	    select1(getChldroom(),child);
	    btnclk(getSearch());
	}
	public void cancelBookingItinerary() {
		btnclk(getBookItinerary());
	}
	public void logout() {
		btnclk(getLogOut());
		}
	}