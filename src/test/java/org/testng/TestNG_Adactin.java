package org.testng;

//import org.testng.AssertJUnit;
import org.Adactin.Base_class;
import org.openqa.selenium.WebDriver;
import org.pom.PomofPom;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Adactin extends Base_class{
	public static WebDriver driver=browser_Launch("https://adactinhotelapp.com/");
	
	@Parameters({"username","password"})
	@Test
	public void adactin(String username, String password) {

	PomofPom p=new PomofPom(driver);
	pass_Input(p.getL().getUsername(),username);
	pass_Input(p.getL().getPassword(),password);
	click(p.getL().getLogin());
	String title="Adactin.com - Search Hotel";
	//Assert.assertEquals(driver.getTitle(), title);
	SoftAssert s=new SoftAssert();
	AssertJUnit.assertEquals(driver.getTitle(), title);
	dropdown(p.getS().getLocation(), "text", "Sydney");
	s.assertAll();
	}
}
