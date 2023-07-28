package com.ClassAssignmentDay10;

import org.testng.annotations.DataProvider;

public class DataProvider_TN {
	
	@DataProvider(name = "TutorialsNinjaLogin")
    public Object[][] getTNLoginData() {

		Object[][] data = { { "seleniumpanda4567@gmail.com", "Selenium@123" },
				            { "seleniumpanda45678@gmail.com", "Selenium@123" }, 
				            { "seleniumpanda456789@gmail.com", "Selenium@123" },
				            {"adityaupadhyay@gmail.com","Aditya"} };
        return data;
	}
	
	

}
