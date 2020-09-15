package pom.objrepository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class CancelBookingPojo extends LibGlobal{
	String text;
	public CancelBookingPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement id;
	
	@FindBy(id="search_hotel_id")
	private WebElement goBtn;
	
	@FindBy(xpath="//input[@name='ids[]']")
	private WebElement selBtn;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement canBtn;

	@FindBy(id="order_no")
	private WebElement order;

	public WebElement getOrder() {
	return order;
}


	public WebElement getId() {
		return id;
	}

	public WebElement getGoBtn() {
		return goBtn;
	}

	public WebElement getSelBtn() {
		return selBtn;
	}

	public WebElement getCanBtn() {
		return canBtn;
	}
	
	public void order() throws InterruptedException {
		sleep();
		sleep();
		sleep();
	
		WebElement order = getOrder();
	   
	   sleep();
	text = order.getAttribute("value");
	System.out.println("Order number generated is :  "+text);
	System.out.println("Done successfully");
	
	}
	public void cancel() {
		fill(getId(),text);
		btnclk(getGoBtn());
	}
	public void cancelCnfrm() {
		btnclk(getSelBtn());
		btnclk(getCanBtn());
			
	}
	public void popupHandle() {
		Alert a = driver.switchTo().alert();
	a.accept();
	System.out.println("Cancellation done successfully");

	}
	}

