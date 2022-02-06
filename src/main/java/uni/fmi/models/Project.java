package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Project {

	private String name;
	private Set<Task> tasks;
	private Set<Project> subprojects;
	private Project parent;
	private Set<Developer> developers;
	private Leader leader;
	
    /**
     * Default constructor
     */
    public Project() {
    }

    

    public Project(String name) {
		this.name = name;
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
    public Leader getLeader() {
        
        return leader;
    }

    /**
     * @param leader 
     * @return
     */
    public void setLeader(Leader leader) {
        
        this.leader = leader;
    }

    /**
     * @return
     */
    public Set<Developer> getDevelopers() {
        
        return developers;
    }

    /**
     * @param leader 
     * @return
     */
    public void setDevelopers(Set<Developer> developers) {
        
        this.developers = developers;
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

    /**
     * @return
     */
    public Project getParent() {
        
        return parent;
    }

    /**
     * @param parent 
     * @return
     */
    public void setParent(Project parent) {
        
        this.parent = parent;
    }

    /**
     * @return
     */
    public Set<Project> getSubprojects() {
        
        return subprojects;
    }

    /**
     * @param subprojects 
     * @return
     */
    public void setSubprojects(Set<Project> subprojects) {
        
        this.subprojects = subprojects;
    }

}