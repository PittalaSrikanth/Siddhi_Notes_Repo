package StepDefinations;

import io.cucumber.java.en.*;

public class LoginSteps {
	@Given("User is on login page")
	public void user_is_on_login_page() 
	{
		System.out.println("Setp1");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Setp2");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("Setp3");
	}


	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("Setp4");
	}

	@When("user enter admin and admin123")
	public void user_enter_admin_and_admin123() {
		System.out.println("Setp5");
	}
	

}
