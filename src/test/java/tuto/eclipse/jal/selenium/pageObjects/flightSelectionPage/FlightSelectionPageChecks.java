package tuto.eclipse.jal.selenium.pageObjects.flightSelectionPage;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class FlightSelectionPageChecks {
	
	public FlightSelectionPageChecks() {
		
	}
	
	/*
	 * CHECKS
	 */
	
	protected String getPageTitle() {
		return MyDriver.driver.getTitle();
	}

}
