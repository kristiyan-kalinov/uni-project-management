package uni.fmi.assign.model;

import uni.fmi.assign.service.AssignService;
import uni.fmi.models.Developer;
import uni.fmi.models.Task;
import uni.fmi.status.EnumHolder;

public class AssignScreenModel extends EnumHolder {
	
	private Task task;
	private Developer newAssignee;
	private String message;

	public AssignScreenModel(Task task) {
		this.task = task;
	}

	public void setDeveloper(Developer developer) {
		newAssignee = developer;
	}

	public void clickSaveButton() {
		message = AssignService.assign(task, newAssignee);
	}

	public String getMessage() {
		return message;
	}

}
