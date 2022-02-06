package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Developer {

	private String name;
	private String email;
	private Set<Task> tasks;
	private Set<Project> projects;
    
	/**
     * Default constructor
     */
    public Developer() {
    }

    

    public Developer(String name, String email) {
		this.name = name;
		this.email = email;
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
    public String getEmail() {
        
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        
        this.email = email;
    }

    /**
     * @return
     */
    public Set<Project> getProjects() {
        
        return projects;
    }

    /**
     * @param projects 
     * @return
     */
    public void setProjects(Set<Project> projects) {
        
        this.projects = projects;
    }

    /**
     * @return
     */
    public Set<Task> getTasks() {
        
        return tasks;
    }

    /**
     * @param tasks 
     * @return
     */
    public void setTasks(Set<Task> tasks) {
        
        this.tasks = tasks;
    }

}