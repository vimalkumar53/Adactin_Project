package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selecthotel {
	
	public WebDriver driver;
	
	 @FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	 @FindBy(id="continue")
	private WebElement Continue;


	public WebDriver getDriver() {
		return driver;
	}
	
	public selecthotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public void setRadiobutton_0(WebElement radiobutton_0) {
		this.radiobutton_0 = radiobutton_0;
	}

	public void setContinue(WebElement continue1) {
		Continue = continue1;
	}	
	
	//   	public WebElement getCancel() {
//		return cancel;
//	}
}
