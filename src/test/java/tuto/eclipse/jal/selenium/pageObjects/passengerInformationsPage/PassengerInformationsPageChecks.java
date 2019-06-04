package tuto.eclipse.jal.selenium.pageObjects.passengerInformationsPage;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class PassengerInformationsPageChecks {

	public PassengerInformationsPageChecks() {
		
	}
	
	/*
	 * CHECKS
	 */
	
	protected String getPageTitle() {
		return MyDriver.driver.getTitle();
	}

}
