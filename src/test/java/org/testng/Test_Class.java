package org.testng;

import org.testng.annotations.Test;

//import org.testng.annotations.Ignore;


public class Test_Class {

	    @Test(priority = 0, expectedExceptions = Exception.class, groups = "a")
	    private void browserlaunch() {
	    	System.out.println(10/0);
		System.out.println("LAUNCH THE BROWSER");	 

		}
		@Test(dependsOnMethods = "browserlaunch",timeOut = 2000, groups = "b")
	    private void url() {
		System.out.println("ENTER THE URL");	 
		}	
	  //  @Ignore
		@Test(priority = 1, invocationCount = 2, groups = "b")
	    private void maximize() {
		 System.out.println("MAXIMIZE THE WINDOW");
	    }
	    @Test(priority = 3, groups = "a")
	    private void search() {
		System.out.println("SEARCH THE MOBILES");
		}

}
