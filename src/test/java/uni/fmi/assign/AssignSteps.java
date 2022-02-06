package uni.fmi.assign;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uni.fmi.assign.model.AssignScreenModel;
import uni.fmi.assign.service.AssignService;

public class AssignSteps extends AssignService {

	private AssignScreenModel assignModel;

	@Given("Opens task1 screen")
	public void openTask1Screen() {
	    assignModel = new AssignScreenModel(super.task1);
	}
	@When("Assigns to the task")
	public void assignToTask() {
	    assignModel.setDeveloper(super.dev2);
	}
	@When("Clicks save button")
	public void clickSaveButton() {
	    assignModel.clickSaveButton();
	}
	@Then("Sees message for successful assignment")
	public void checkSuccessMessage() {
		assertEquals("Successful assignment", assignModel.getMessage());
	}

	@Given("Opens task2 screen")
	public void openTask2Screen() {
		assignModel = new AssignScreenModel(super.task2);
	}

	@Then("Sees message for unsuccessful assignment")
	public void checkUnsuccessMessage() {
		assertEquals("Unsuccessful assignment", assignModel.getMessage());
	}

	@When("Assigns to task1")
	public void assignToTask1() {
	    assignModel.setDeveloper(super.dev2);
	}

}
