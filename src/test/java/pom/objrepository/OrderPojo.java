package pom.objrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class OrderPojo extends LibGlobal{
	public OrderPojo() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="order_no")
		private WebElement order;
	public WebElement getOrder() {
		return order;
	}
	public void order() throws InterruptedException {
		sleep();
		sleep();
		sleep();
	
		WebElement order = getOrder();
	   
	   sleep();
	String text = order.getAttribute("value");
	System.out.println("Order number generated is :  "+text);
	System.out.println("Done successfully");
	
	}
	
	
}
