package pom.objrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectHotelPojo extends LibGlobal{
	public SelectHotelPojo() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
		@FindBy(id="radiobutton_0")
		
		private WebElement sel;
	
	
	@FindBy(id="continue")
	private WebElement cntue;


	public WebElement getSel() {
		return sel;
	}


	public WebElement getCntue() {
		return cntue;
	}
	public void selectHotel() {
		
		btnclk(getSel());
		btnclk(getCntue());
	}

	

}