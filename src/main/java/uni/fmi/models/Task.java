package uni.fmi.models;
import java.util.*;

import uni.fmi.status.EnumHolder;

/**
 * 
 */
public class Task extends EnumHolder {
	
	private String name;
	private Status status;
	private String statusMessage;
	private Project project;
	private Set<Task> subtasks;
	private Task parent;
	private Developer developer;
	
    /**
     * Default constructor
     */
    public Task() {
    }

    

    public Task(String name,Status status, String statusMessage, Project project1, Developer dev1) {
		this.name = name;
		this.status = status;
		this.statusMessage = statusMessage;
		this.project = project1;
		this.developer = dev1;
	}



	/**
     * @return
     */
    public String getName() {
        
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        
        this.name = name;
    }
    
    /**
     * @return
     */
    public Status getStatus() {
        
        return status;
    }
    
    /**
     * @param name 
     * @return
     */
    public void setStatus(Status status) {
        
        this.status = status;
    }
    
    /**
     * @return
     */
    public String getStatusMessage() {
        
        return statusMessage;
    }

    /**
     * @param name 
     * @return
     */
    public void setStatusMessage(String message) {
        
        this.statusMessage = message;
    }

    /**
     * @return
     */
    public Developer getDeveloper() {
        
        return developer;
    }

    /**
     * @param developer 
     * @return
     */
    public void setDeveloper(Developer developer) {
        
        this.developer = developer;
    }

    /**
     * @return
     */
    public Project getProject() {
        
        return project;
    }

    /**
     * @param project 
     * @return
     */
    public void setProject(Project project) {
        
        this.project = project;
    }

    /**
     * @return
     */
    public Task getParent() {
        
        return parent;
    }

    /**
     * @param parent 
     * @return
     */
    public void setParent(Task parent) {
        
        this.parent = parent;
    }

    /**
     * @return
     */
    public Set<Task> getSubtasks() {
        
        return subtasks;
    }

    /**
     * @param subtasks 
     * @return
     */
    public void setSubtasks(Set<Task> subtasks) {
        
        this.subtasks = subtasks;
    }

}