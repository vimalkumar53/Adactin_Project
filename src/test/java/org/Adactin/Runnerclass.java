package org.Adactin;

//import java.io.IOException;

//import org.apache.commons.logging.Log;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//	browser_Launch("https://www.amazon.in/");
//	gettitle("https://www.amazon.in/");
//	getcurrenturl("https://www.amazon.in/");
//	navigate("https://www.flipkart.com/");
//	navigateback("https://www.amazon.in/");
//	navigateforward("https://www.flipkart.com/");
//	navigaterefresh("https://www.flipkart.com/");
//	navigateback("https://www.amazon.in/");
//	closeoption("https://www.amazon.in/");
//	quitoption("https://www.amazon.in/");
//	browser_Launch("https://adactinhotelapp.com/");
//	WebElement username = driver.findElement(By.id("username"));
//	pass_Input(username,"hello");
//	WebElement login = driver.findElement(By.id("login"));
//	clickoption(login);
//	browser_Launch("https://www.leafground.com/alert.xhtml;jsessionid=node0wma98zh45j4r1vuf18pqbdvc377576.node0");
//	WebElement alert = driver.findElement(By.xpath("//button[contains(@onclick,'simple a')]"));
//	clickoption(alert);
//	alerts("accept");
//	browser_Launch("https://www.leafground.com/frame.xhtml");	
//	WebElement frame1 = driver.findElement(By.id("click"));
//	clickoption(frame1);		
	//screenshot("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium\\Screenshot\\hi.png");

import org.openqa.selenium.WebDriver;
import org.pom.PomofPom;

public class Runnerclass extends Base_class{
	
	public static WebDriver driver=browser_Launch("https://adactinhotelapp.com/");
	public static void main(String[] args) throws InterruptedException  {
		PomofPom p=new PomofPom(driver);
		pass_Input(p.getL().getUsername(),"Ragul12345678" );
		pass_Input(p.getL().getPassword(), "Ragul@1710");
		click(p.getL().getLogin());
		dropdown(p.getS().getLocation(), "text", "Sydney");
	    dropdown(p.getS().getHotels(), "text", "Hotel Creek");
		dropdown(p.getS().getRoom_type(), "text","Double");
		dropdown(p.getS().getRoom_nos(), "i","2");
	//	dropdown(p.getS().getDatepick_in(), "text", "01/09/2023");
	//	dropdown(p.getS().getDatepick_out(), "text", "02/09/2023");
		dropdown(p.getS().getAdult_room(), "i", "2");
		dropdown(p.getS().getChild_room(), "i", "1");
		click(p.getS().getSubmit());
		click(p.getH().getRadiobutton_0());
	    click(p.getH().getContinue());
	    pass_Input(p.getB().getFirst_name(), "vimal");
	    pass_Input(p.getB().getLast_name(), "kumar");
	    pass_Input(p.getB().getAddress(), "bangalore");
	    pass_Input(p.getB().getCc_num(),"1234567890123456");
	    dropdown(p.getB().getCc_type(), "text", "VISA");
	    dropdown(p.getB().getCc_exp_month(),"text", "March");
	    dropdown(p.getB().getCc_exp_year(), "text","2028");
	    pass_Input(p.getB().getCc_cvv(),"1234");                          
	    click(p.getB().getBook_now());
	    click(p.getB().getLogout());
	    
	}
}
