package pojoproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartLoginPojo {

	FlipkartLoginPojo() {

	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement login;

	//Getters Methods
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
