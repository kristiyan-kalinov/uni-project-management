package uni.fmi.assign.service;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.models.Developer;
import uni.fmi.models.Project;
import uni.fmi.models.Task;
import uni.fmi.status.EnumHolder;

public class AssignService extends EnumHolder {

	protected static Developer dev1 = new Developer("Ivan", "ivan@abv.bg");
	protected static Developer dev2 = new Developer("Angel", "angel@abv.bg");
	private static List<Developer> developersDb = new ArrayList<Developer>() {{
		add(dev1);
		add(dev2);
	}};
	
	static Project project1 = new Project("project1");
	private static List<Project> projectsDb = new ArrayList<Project>() {{
		add(project1);
	}};
	
	protected static Task task1 = new Task("task1", Status.NEW, null, project1, null);
	protected static Task task2 = new Task("task2", Status.NEW, null, project1, dev1);
	private static List<Task> tasksDb = new ArrayList<Task>() {{
		add(task1);
		add(task2);
	}};

	public static String assign(Task task, Developer newAssignee) {
		if (task.getDeveloper() == null &&
				newAssignee == dev2) {
			return "Successful assignment";
		}
		else if (task.getDeveloper() != null) {
			return "Unsuccessful assignment";
		}
		else return "Unsuccessful assignment";
	}
	
}