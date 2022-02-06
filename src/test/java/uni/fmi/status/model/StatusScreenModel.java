package uni.fmi.status.model;

import uni.fmi.models.Task;
import uni.fmi.status.EnumHolder;
import uni.fmi.status.service.StatusService;

public class StatusScreenModel extends EnumHolder {

	private Status newStatus;
	private String statusMessage;
	private String message;
	private Task task;

	public StatusScreenModel(Task task) {
		this.task = task;
	}

	public void changeStatus(Status currentStatus, Status newStatus, Boolean hasDeveloper) {
		this.newStatus = newStatus;
	}

	public void enterMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public void clickSaveButton() {
		message = StatusService.status(task, newStatus, statusMessage);
	}

	public String getMessage() {
		return message;
	}

}
