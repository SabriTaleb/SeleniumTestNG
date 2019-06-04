package tuto.eclipse.jal.selenium.pageObjects.flightSelectionPage;

import static org.junit.Assert.assertEquals;

import tuto.eclipse.jal.selenium.pageObjects.AllPages;

public class FlightSelectionPage extends AllPages {

	private static final String FLIGHT_SELECTION_PAGE = "> FLIGHTSELECTION_PAGE > Checks > ";
	private static final String EXPECTED_PAGE_TITLE = "JAPAN AIRLINES (JAL) - France Region - Airfare to Japan (Tokyo)";
	
	
	public FlightSelectionPage() {
		super();
		System.out.println("A new flight selection page was created");
	}
	
	public void run() {
		//performChecks();
		performActions();
	}
	
	
	public void performActions() {
		System.out.println("On va faire les actions de la Flight Selection Page");
		FlightSelectionPageActions actions = new FlightSelectionPageActions();
		actions.getDepartureCity();
		actions.getArrivalCity();
		actions.clickShowMoreButton();
		actions.getDepartureDate();
		actions.clickContinueButton();
	}

	public void performChecks() {
		FlightSelectionPageChecks check = new FlightSelectionPageChecks();
		assertEquals(FLIGHT_SELECTION_PAGE + "The title is not the expected one", EXPECTED_PAGE_TITLE, check.getPageTitle());
		System.out.println("if wrong, we dont see it");
	}
	
}
