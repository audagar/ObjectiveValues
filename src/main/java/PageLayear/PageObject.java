package PageLayear;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilsLayear.Utils;
import UtilsLayear.Utils.*;

public class PageObject {

	@FindBy(className = ("lbl_val1"))
	WebElement value1;

	@FindBy(className = ("lbl_val2"))
	WebElement value2;

	@FindBy(className = ("lbl_val3"))
	WebElement value3;

	@FindBy(className = ("lbl_val4"))
	WebElement value4;

	@FindBy(className = ("lbl_val5"))
	WebElement value5;

	@FindBy(className = ("lbl_tts_val"))
	WebElement Balence;

	public PageObject() {

		PageFactory.initElements(value2, this);

	}

	public void PageObjectValaues(String Value1, String Value2, String Value3, String Value4, String Value5,
			String balence) {

		Utils.getText(value1);
		Utils.elementStatus(value1);

		Utils.getText(value2);
		Utils.elementStatus(value2);

		Utils.getText(value3);
		Utils.elementStatus(value3);

		Utils.getText(value4);
		Utils.elementStatus(value4);

		Utils.getText(value5);
		Utils.elementStatus(value5);

		Utils.getText(Balence);
		Utils.elementStatus(Balence);
	}

}
