package com.stepdef;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import com.base.LibGlobal;
import com.manager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.objrepository.BookingPojo;
import pom.objrepository.LoginPojo;
import pom.objrepository.OrderPojo;
import pom.objrepository.SearchHotelPojo;
import pom.objrepository.SelectHotelPojo;

public class AdactinSteps extends LibGlobal {
	PageObjectManager pageObjectManager;
	 LoginPojo loginPojo;
	 SearchHotelPojo searchHotelPojo;
	 SelectHotelPojo selectHotelPojo;
	 BookingPojo bookingHotelPojo;
	 OrderPojo orderPojo;

@Given("User should launch adactin page in browser")
public void user_should_launch_adactin_page_in_browser() throws MalformedURLException {
	getDriverCloud();
	maxWindow();
	loadUrl("http://adactinhotelapp.com/");
	
   }

@When("User should enter the {string} and {string}")
public void user_should_enter_the_and(String user, String pass) {
	pageObjectManager= PageObjectManager.getInstance();
	loginPojo = pageObjectManager.getLoginPojo();
	
	fill(loginPojo.getUser(), user);
	fill(loginPojo.getPass(),pass);
	
   }

@Then("User should click the login button")
public void user_should_click_the_login_button() {
	btnclk(loginPojo.getBtnLogin());
}

@Then("User should select {string},{string},{string},{string},{string},{string},{string},{string}")
public void user_should_select(String locn, String hotel, String roomtype, String numofroom, String indate, String outdate, String adult, String child) {
	searchHotelPojo = pageObjectManager.getSearchHotelPojo();    
	 select1(searchHotelPojo.getLocn(),locn);	
	 select1(searchHotelPojo.getHotel(),hotel);
	 select1(searchHotelPojo.getType(),roomtype);
	 select1(searchHotelPojo.getNor(),numofroom);

		fill(searchHotelPojo.getIndate(),indate);
	    fill(searchHotelPojo.getOutdate(),outdate);

		select1(searchHotelPojo.getRoom(),adult);
		select1(searchHotelPojo.getChldroom(),child);
}

@Then("User should click search button")
public void user_should_click_search_button() {
	btnclk(searchHotelPojo.getSearch());
    }

@Then("user should click select button")
public void user_should_click_select_button() {
	selectHotelPojo = pageObjectManager.getSelectHotelPojo();
	btnclk(selectHotelPojo.getSel());

   }

@Then("user should click continue button")
public void user_should_click_continue_button() {
	btnclk(selectHotelPojo.getCntue());	
    }

@Then("user should enter {string},{string},{string},{string},{string},{string},{string},{string}")
public void user_should_enter(String fn, String ln, String addr, String cnum, String ctype, String emon, String eyr, String cvv) {
	bookingHotelPojo = pageObjectManager.getBookingHotelPojo();
    fill( bookingHotelPojo.getFn(),fn);
    fill( bookingHotelPojo.getLn(),ln);
	fill( bookingHotelPojo.getAddr(),addr);
	fill( bookingHotelPojo.getCard(),cnum);
	select1( bookingHotelPojo.getCtype(),ctype);
	select1( bookingHotelPojo.getEdate(),emon);
	select1( bookingHotelPojo.getEyear(),eyr);
	fill( bookingHotelPojo.getCcv(),cvv);

}

@Then("user should click booknow button")
public void user_should_click_booknow_button() {
	btnclk(bookingHotelPojo.getBook());   
}

@Then("user should get the order id")
public void user_should_get_the_order_id() throws InterruptedException {
	sleep();
	sleep();
	sleep();
	orderPojo = pageObjectManager.getOrderPojo();
	WebElement order = orderPojo.getOrder();
  
	sleep();
String text = order.getAttribute("value");
System.out.println("Order number generated is :  "+text);
System.out.println("Done successfully");

    }

}
