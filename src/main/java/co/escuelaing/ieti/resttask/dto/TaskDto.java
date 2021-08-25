package co.escuelaing.ieti.resttask.dto;

public class TaskDto {
    private String name;
    private String description;
    private String status;
    private int assignedTo;
    private String dueDate;
    private String created;

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

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}
