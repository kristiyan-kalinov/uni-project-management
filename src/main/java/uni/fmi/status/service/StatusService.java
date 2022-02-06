package uni.fmi.status.service;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.models.Developer;
import uni.fmi.models.Project;
import uni.fmi.models.Task;
import uni.fmi.status.EnumHolder;

public class StatusService extends EnumHolder {

	static Developer dev1 = new Developer("Ivan", "ivan@abv.bg");
	static Developer dev2 = new Developer("Angel", "angel@abv.bg");
	private static List<Developer> developersDb = new ArrayList<Developer>() {{
		add(dev1);
		add(dev2);
	}};
	
	static Project project1 = new Project("project1");
	private static List<Project> projectsDb = new ArrayList<Project>() {{
		add(project1);
	}};
	
	protected static Task task1 = new Task("task1", Status.NEW, null, project1, dev1);
	protected static Task task2 = new Task("task2", Status.DONE, null, project1, dev1);
	protected static Task task3 = new Task("task3", Status.NEW, null, project1, null);
	private static List<Task> tasksDb = new ArrayList<Task>() {{
		add(task1);
		add(task2);
		add(task3);
	}};
	
	public static String status(Task task, Status newStatus, String statusMessage) {
		
		if (newStatus == Status.IN_PROGRESS &&
				statusMessage == "Task started" &&
				task.getDeveloper() == dev1 &&
				task.getStatus() != Status.DONE) {
			return "Successful change";
		}
		else if (newStatus == Status.IN_PROGRESS &&
				statusMessage == "Task started" &&
				task.getStatus() == Status.DONE) {
			return "Unsuccessful change";
		}
		else if (newStatus == Status.IN_PROGRESS &&
				statusMessage == "Task started" &&
				task.getDeveloper() == null) {
			return "Unsuccessful change";
		}
		else if (newStatus == Status.IN_PROGRESS &&
				statusMessage != "Task Started") {
			return "Unsuccessful change";
		}
		else return "Unsuccessful change";
	}

}
