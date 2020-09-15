package com.manager;


import com.base.LibGlobal;

import pom.objrepository.BookingPojo;
import pom.objrepository.CancelBookingPojo;
import pom.objrepository.LoginPojo;
import pom.objrepository.OrderPojo;
import pom.objrepository.SearchHotelPojo;
import pom.objrepository.SelectHotelPojo;

public class PageObjectManager extends LibGlobal {
	private static PageObjectManager pageObjectManager;
	private LoginPojo loginPojo;
	private SearchHotelPojo searchHotelPojo;
	private SelectHotelPojo selectHotelPojo;
	private BookingPojo bookingHotelPojo;
	private OrderPojo orderPojo;
	private CancelBookingPojo cancelBookingPojo;
	
	private PageObjectManager() {
		
	}
	public static  PageObjectManager getInstance() {
		return (pageObjectManager==null)?pageObjectManager=new PageObjectManager():pageObjectManager;
	}
	
	public LoginPojo getLoginPojo() {
		
		return (loginPojo==null)?loginPojo=new LoginPojo():loginPojo;
	}
	public SearchHotelPojo getSearchHotelPojo() {
		return (searchHotelPojo==null)?searchHotelPojo=new SearchHotelPojo():searchHotelPojo;
	}
	public SelectHotelPojo getSelectHotelPojo() {
		return (selectHotelPojo==null)?selectHotelPojo=new SelectHotelPojo():selectHotelPojo;
	}
	public BookingPojo getBookingHotelPojo() {
		return (bookingHotelPojo==null)?bookingHotelPojo=new BookingPojo():bookingHotelPojo;
	}
	public OrderPojo getOrderPojo() {
		return (orderPojo==null)?orderPojo=new OrderPojo():orderPojo;
	}
	public CancelBookingPojo getCancelBookingPojo() {
		return (cancelBookingPojo==null)?cancelBookingPojo=new CancelBookingPojo():cancelBookingPojo;
	}
	
	
	
	

}
