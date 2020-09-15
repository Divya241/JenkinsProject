package pom.objrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchPojo extends LibGlobal{
	public SearchPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="q")
	private WebElement searchProduct;
	
	@FindBy(className="_2BhAHa")
	private WebElement btnSearch;

	public WebElement getSearchProduct() {
		return searchProduct;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	

	
	
}
