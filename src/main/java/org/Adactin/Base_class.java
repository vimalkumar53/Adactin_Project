package org.Adactin;


import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {
	
	
	public static WebDriver driver;
	
	public static WebDriver browser_Launch(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Adactin\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	return driver;
	}  
   public static void screenshot(String location) throws IOException{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File f=new File(location);
	FileHandler.copy(source, f);		
}
   
   public static void dropdown(WebElement element, String method, String Value) {
	   Select s=new Select(element);
	   if (method.equals("value")) {
		   s.selectByValue(Value);
	}else if (method.equals("text")) {
		s.selectByVisibleText(Value);		
	}else {
		int i = Integer.parseInt(Value);
		s.selectByIndex(i);
	}
}
 
   public static void gettitle(String title) {
	   driver.get(title);
	   System.out.println(title);
}
   public static void getcurrenturl(String getcurrenturl) {
	   driver.get(getcurrenturl);
	   System.out.println(getcurrenturl);
	}  
   
   public static void navigate(String url) {
	   	   driver.navigate().to(url);	
	   	   
}
public static void navigateback(String url) {
	driver.navigate().back();
}

public static void navigateforward(String url) {
driver.navigate().forward();
}

public static void navigaterefresh(String url) {
	driver.navigate().refresh();

}
public static void closeoption(String string) {
 driver.close();

}

public static void quitoption(String string) {
	driver.quit();
	}

public static void alerts(String string) {
	driver.switchTo().alert().accept();;
	}

public static void pass_Input(WebElement element, String input) {
	 element.sendKeys(input);
	 }
  
public static void click(WebElement element) {
  element.click();
}
public static void frameoption(WebElement element) {
	driver.switchTo().frame(element);
}

public static void actions(WebElement element) {
	Actions a=new Actions(driver);
	a.moveToElement(element).perform();
}

public static void robot(int element) throws AWTException {
	Robot r=new Robot();
	r.keyPress(element);
}
public static void waitoption(long time) {
	WebDriverWait w=new WebDriverWait(driver,time);
	w.until(ExpectedConditions.alertIsPresent());
}
public static void RadioButton(WebElement element) {
element.click();
}
public static void getAttribute(String element) {
getAttribute(element);
}
public static void gettext(String element) {
gettext(element);
}

public static void windowhandles(String url) {
driver.switchTo().window(url);	
}

public static void scrollIntoView(String element) {
	scrollIntoView(element);
}
public static void isDisplayed(String element) {
 isDisplayed(element);
}
public static void isEnabled(String element) {
isEnabled(element);
}
public static void isSelected(Object element) {
isSelected(element);
}

}