package CustomStepsDef;

import PageLayear.PageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CutomDef {

	PageObject obj;

	@Given("all the five lbl_val and txt_val")
	public void all_the_five_lbl_val_and_txt_val() {

	}

	@When("check all five values")
	public void check_all_five_values() {

		PageObject obj = new PageObject();
		obj.PageObjectValaues("value1", "value2", "value3", "value4", "value5", "Balence");
	}

	@Then("Total Balence")
	public void total_balence() {

	}

}
