package UtilsLayear;

import org.openqa.selenium.WebElement;

public class Utils {

	public static boolean elementStatus(WebElement value) {
		return (value.isDisplayed() && value.isEnabled());
	}

	public static String getText(WebElement value) {
		return value.getText();
	}

}
