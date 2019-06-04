package tuto.eclipse.jal.selenium.pageObjects.flightSelectionPage;

import org.openqa.selenium.By;
import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class FlightSelectionPageActions {

	/*
	 * ACTIONS
	 */

	public void getDepartureCity() {
		String departureCity = MyDriver.driver.findElement(By.id(FlightSelectionPageIDs.DEPARTURE_FROM_CITY_ID)).getText();
		System.out.println("Ville de départ : "+departureCity);
	}

	public void getArrivalCity() {
		String arrivalCity = MyDriver.driver.findElement(By.id(FlightSelectionPageIDs.ARRIVAL_TO_CITY_ID)).getText();
		System.out.println("Ville d'arrivée : "+arrivalCity);
	}

	public void getDepartureDate() {
		String departureDate = MyDriver.driver.findElement(By.id(FlightSelectionPageIDs.DEPARTURE_DATE_ID)).getText();
		System.out.println("Jour : "+departureDate);
	}
	
	protected void clickContinueButton() {
		MyDriver.driver.findElement(By.id(FlightSelectionPageIDs.CONTINUE_BUTTON_ID)).click();
	}

	public void clickShowMoreButton() {
		MyDriver.driver.findElements(By.className(FlightSelectionPageIDs.SHOW_MORE_BUTTON_ID)).get(0).click();
	}

	
}
