package org.pom;

import org.openqa.selenium.WebDriver;

public class PomofPom {
	
	
	public WebDriver driver;
	private login l;
	
	private Searchhotels s;
	
	private selecthotel h;
	
	private bookhotel b;

	public PomofPom(WebDriver driver2) {
		this.driver=driver2;
	}
public login getL() {
	l=new login(driver);
	return l;
}

public Searchhotels getS() {
	s=new Searchhotels(driver);
	return s;
}

public selecthotel getH() {
	h=new selecthotel(driver);
	return h;
}

public bookhotel getB() {
	b=new bookhotel(driver);
	return b;
	
}
} 

