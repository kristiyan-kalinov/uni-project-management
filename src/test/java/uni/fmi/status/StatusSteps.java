package uni.fmi.status;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uni.fmi.status.model.StatusScreenModel;
import uni.fmi.status.service.StatusService;

public class StatusSteps extends StatusService {
	
	private StatusScreenModel statusModel;

	@Given("Developer opens the screen of task1")
	public void openTask1Screen() {
		statusModel = new StatusScreenModel(super.task1);
	}

	@Given("Developer opens the screen of task2")
	public void openTask2Screen() {
		statusModel = new StatusScreenModel(super.task2);
	}

	@Given("Developer opens the screen of task3")
	public void openTask3Screen() {
		statusModel = new StatusScreenModel(super.task3);
	}

	@When("^Changes the status of the task from new to in progress$")
	public void changeStatusFromNToIP() throws Throwable {
	    statusModel.changeStatus(Status.NEW, Status.IN_PROGRESS, true);
	}

	@When("^Enters a status change message$")
	public void enterStatusMessage() throws Throwable {
	    statusModel.enterMessage("Task started");
	}

	@When("^Clicks save button$")
	public void clickSaveButton() throws Throwable {
	    statusModel.clickSaveButton();
	}

	@Then("^Sees successful change message$")
	public void seeSuccessfulMessage() throws Throwable {
	    assertEquals("Successful change", statusModel.getMessage());
	}

	@When("^Changes the status of the task from finished to in progress$")
	public void changeStatusFromFToIP() throws Throwable {
	    statusModel.changeStatus(Status.DONE, Status.IN_PROGRESS, true);
	}

	@Then("^Sees unsuccessful change message$")
	public void seeUnsuccessfulMessage() throws Throwable {
	    assertEquals("Unsuccessful change", statusModel.getMessage());
	}

	@When("^Changes the status of the task from new to in progress with no assignee$")
	public void changeStatusNoA() throws Throwable {
	    statusModel.changeStatus(Status.NEW, Status.IN_PROGRESS, false);
	}
}
