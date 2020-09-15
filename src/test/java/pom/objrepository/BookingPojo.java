package pom.objrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookingPojo extends LibGlobal {
	public BookingPojo() {
		
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="first_name")
	private WebElement fn;
	
	
	@FindBy(id="last_name")
	private WebElement ln;
	
	@FindBy(id="address")
	private WebElement addr;
	
	@FindBy(id="cc_num")
	private WebElement card;
	
	@FindBy(id="cc_type")
	private WebElement ctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement edate;
	
	@FindBy(id="cc_exp_year")
	private WebElement eyear;
	
	@FindBy(id="cc_cvv")
	private WebElement ccv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	
	
	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getEdate() {
		return edate;
	}

	public WebElement getEyear() {
		return eyear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook() {
		return book;
	}
	
	public void booking(String fname, String lname, String addr, String credit, String typ, String mnth, String yr, String ccnum) {
	    
	    fill(getFn(),fname);
	    fill(getLn(),lname);
		fill(getAddr(),addr);
		fill(getCard(),credit);
		select1(getCtype(),typ);
		select1(getEdate(),mnth);
		select1(getEyear(),yr);
		fill(getCcv(),ccnum);
		btnclk(getBook());
	}
	
	
	
	
	
}
