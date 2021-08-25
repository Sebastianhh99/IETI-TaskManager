package co.escuelaing.ieti.resttask.data;

import co.escuelaing.ieti.resttask.dto.TaskDto;

public class Task {
    private int id;
    private String name;
    private String description;
    private String status;
    private int assignedTo;
    private String dueDate;
    private String created;

    public Task(TaskDto task,int id){
        this.id=id;
        this.name=task.getName();
        this.description=task.getDescription();
        this.status=task.getStatus();
        this.assignedTo=task.getAssignedTo();
        this.dueDate=task.getDueDate();
        this.created=task.getCreated();
    }

    public void setAssignedTo(int assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public int getAssignedTo() {
        return assignedTo;
    }

    public String getCreated() {
        return created;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String getStatus() {
        return status;
    }

}
