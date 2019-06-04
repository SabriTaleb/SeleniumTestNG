package tuto.eclipse.jal.selenium.pageObjects.passengerInformationsPage;

import static org.junit.Assert.assertEquals;

import tuto.eclipse.jal.selenium.pageObjects.AllPages;

public class PassengerInformationsPage extends AllPages {

	
	private static final Object[] EXPECTED_PAGE_TITLE = null;
	private static final String PASSENGER_INFORMATIONS_PAGE = null;
	private static final String PASSENGER_TITLE_0 = "MR";
	private static final String PASSENGER_TITLE_1 = "MRS";
	private static final String PASSENGER_LASTNAME_0 = "Sabri";
	private static final String PASSENGER_LASTNAME_1 = "Fefe";
	private static final String PASSENGER_FIRSTNAME_0 = "Taleb";
	private static final String PASSENGER_FIRSTNAME_1 = "Taleb";
	private static final String PASSENGER_GENDER_0 = "string:MALE";
	private static final String PASSENGER_GENDER_1 = "string:FEMALE";
	private static final String PASSENGER_BIRTHDAY_DAY_0 = "string:21";
	private static final String PASSENGER_BIRTHDAY_DAY_1 = "string:15";
	private static final String PASSENGER_BIRTHDAY_MONTH_0 = "string:07";
	private static final String PASSENGER_BIRTHDAY_MONTH_1 = "string:02";
	private static final String PASSENGER_BIRTHDAY_YEAR_0 = "string:1987";
	private static final String PASSENGER_BIRTHDAY_YEAR_1 = "string:1988";
	private static final String PASSENGER_NATIONALITY_0 = "string:FR";
	private static final String PASSENGER_NATIONALITY_1 = "string:FR";
	private static final String PASSENGER_PHONE_COUNTRY = "FRA";
	private static final String PASSENGER_PHONE_NUMBER = "635432799";
	private static final String PASSENGER_EMAIL = "toto.tata@me.com";
	private static final String PASSENGER_EMAIL_CONFIRMATION = "toto.tata@me.com";
	

	public PassengerInformationsPage() {
		super();
		System.out.println("A new PAssenger Informations page was created");
	}
	
	public void run() {
		performChecks();
		performActions();
	}

	
	public void performActions() {
		System.out.println("On va faire les actions de la HomePage");
		PassengerInformationsPageActions actions = new PassengerInformationsPageActions();
		actions.setPassenger1Informations(PASSENGER_TITLE_0, PASSENGER_LASTNAME_0, PASSENGER_FIRSTNAME_0, PASSENGER_GENDER_0, PASSENGER_BIRTHDAY_DAY_0, PASSENGER_BIRTHDAY_MONTH_0, PASSENGER_BIRTHDAY_YEAR_0, PASSENGER_NATIONALITY_0);
		actions.setPassenger2Informations(PASSENGER_TITLE_1, PASSENGER_LASTNAME_1, PASSENGER_FIRSTNAME_1, PASSENGER_GENDER_1, PASSENGER_BIRTHDAY_DAY_1, PASSENGER_BIRTHDAY_MONTH_1, PASSENGER_BIRTHDAY_YEAR_1, PASSENGER_NATIONALITY_1);
		actions.setPassengerContact(PASSENGER_PHONE_COUNTRY, PASSENGER_PHONE_NUMBER, PASSENGER_EMAIL, PASSENGER_EMAIL_CONFIRMATION);
		actions.clickContinueButton();
	}
	
	public void performChecks() {
		PassengerInformationsPageChecks check = new PassengerInformationsPageChecks();
		//assertEquals(PASSENGER_INFORMATIONS_PAGE + "The title is not the expected one", EXPECTED_PAGE_TITLE, check.getPageTitle());
		System.out.println("if wrong, we dont see it");
		
	}
}
