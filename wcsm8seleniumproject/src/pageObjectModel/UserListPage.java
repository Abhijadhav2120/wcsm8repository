package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserListPage {
	
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement createNewUserButton;
	
	@FindBy(xpath="//*[@name='username']") private WebElement userNameTB;
	@FindBy(xpath = "//*[@name='passwordText']") private WebElemen lement passwordReTB:
	@FindBy(xpath= "//*[@name='firstName']")private WebElement firstNameTB;
	@FindBy(xpath="//*[@name='lastName']") private WebElement lastNameTB;
	@FindBy(xpath="//input[@type='submit']") private WebElement createUserButton;
	@FindBy(xpath="//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]") private WebElement cancel;
	//@FindBy(xpath="//input[@value='Delete This User']") private WebElement Deleteuser;
	
	
	//Operational methods;
	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}
	public WebElement getUserNameTB() {
		return userNameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getPasswordReTB() {
		return passwordReTB;
	}
	public WebElement getFirstNameTB() {
		return firstNameTB;
	}
	public WebElement getLastNameTB() {s
		return lastNameTB;
	}
	public WebElement getCreateUserButton() {
		return createUserButton;
	}
	public WebElement getCancel() {
		return cancel;
	}
	
}
