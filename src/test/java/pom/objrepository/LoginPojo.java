package pom.objrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPojo extends LibGlobal{
	public LoginPojo() {
		
		PageFactory.initElements(driver, this);
		}
			

		@FindBy(id="username")
		private WebElement user;
	
		@FindBy(id="password")
		private WebElement pass;
	
		
		@FindBy(id="login")
		private WebElement btnLogin;


		public WebElement getUser() {
			return user;
		}


		public WebElement getPass() {
			return pass;
		}


		public WebElement getBtnLogin() {
			return btnLogin;
		}
		
		public void login(String user, String pass) {
			
			fill(getUser(), user);
			fill(getPass(),pass);
			btnclk(getBtnLogin());
		}
	
	

}
