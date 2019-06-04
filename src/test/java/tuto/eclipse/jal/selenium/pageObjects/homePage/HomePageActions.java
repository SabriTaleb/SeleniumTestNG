package tuto.eclipse.jal.selenium.pageObjects.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class HomePageActions {

	/*
	 * ACTIONS
	 */
	protected void clickSearchButton() {
		MyDriver.driver.findElement(By.id(HomePageIDs.SEARCH_BUTTON_ID)).click();
	}

	public void closeModal() {
		MyDriver.driver.findElements(By.cssSelector(HomePageIDs.MODAL_CLOSE_BUTTON_CSS)).get(1).click();
	}

	public void setDepartureCity(String departureCity) {
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_FROM_CITY_ID)));
		s.selectByValue(departureCity);
	}

	public void setArrivalCity(String arrivalCity) {
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.ARRIVAL_TO_CITY_ID)));
		s.selectByValue(arrivalCity);
	}

	public void setDepartureDate(String departureDateMonth, String departureDateDay) {
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_1_MONTH)));
		s.selectByValue(departureDateMonth);
		s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_1_DAY)));
		s.selectByValue(departureDateDay);
	}

	public void setArrivalDate(String arrivalDateMonth, String arrivalDateDay) {
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_2_MONTH)));
		s.selectByValue(arrivalDateMonth);
		s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_2_DAY)));
		s.selectByValue(arrivalDateDay);		
	}

}
