package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG_Class {
	@BeforeSuite
	private void browserlaunch() {
	System.out.println("LAUNCH THE BROWSER");	 

	}
	@BeforeTest
    private void url() {
	System.out.println("ENTER THE URL");	 
	}	
    @BeforeClass
    private void maximize() {
	 System.out.println("MAXIMIZE THE WINDOW");
    }
    @BeforeMethod
    private void search() {
	System.out.println("SEARCH THE MOBILES");
	}
    @Test
    private void productpage() {
	System.out.println("VERIFY THE PRODCUTS");

	}
    @Test
    private void Trending() {
		System.out.println("WHEN DOUBLE CLICK IT SHOULD NAVIGATE");

	}
    @AfterMethod
    private void deletecookies() {
		System.out.println("DELETE ALL THE COOKIES");
	}
    
    @AfterClass
    private void back() {
		System.out.println("NAVIGATE TO BACKPAGE");

	}
    @AfterTest
    private void logout() {
	 System.out.println("LOGOUT THE PAGE");
	}
    
    @AfterSuite
    private void quit() {
	System.out.println("QUIT THE PAGE");	
	}
    
}
