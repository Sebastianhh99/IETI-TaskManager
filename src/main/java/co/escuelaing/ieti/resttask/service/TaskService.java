package co.escuelaing.ieti.resttask.service;

import java.util.List;

import co.escuelaing.ieti.resttask.data.Task;
import co.escuelaing.ieti.resttask.dto.TaskDto;

public interface TaskService {
    Task create(TaskDto task);
    Task findById(int id);
    List<Task> all();
    void deleteById(int id);
    Task update(TaskDto task,int id);
}
