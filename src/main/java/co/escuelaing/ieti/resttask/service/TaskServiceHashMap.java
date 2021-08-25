package co.escuelaing.ieti.resttask.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import co.escuelaing.ieti.resttask.data.Task;
import co.escuelaing.ieti.resttask.dto.TaskDto;

@Service
public class TaskServiceHashMap implements TaskService{

    private static HashMap<Integer,Task> tasks = new HashMap<>();

    @Override
    public Task create(TaskDto task) {
        Task newTask = new Task(task,tasks.size()+1);
        tasks.put(newTask.getId(), newTask);
        return newTask;
    }

    @Override
    public Task findById(int id) {
        Task task = tasks.containsKey(id) ? tasks.get(id):null;
        return task;
    }

    @Override
    public List<Task> all() {
        return new ArrayList<Task>(tasks.values());
    }

    @Override
    public void deleteById(int id) {
        tasks.remove(id);
    }

    @Override
    public Task update(TaskDto task, int id) {
        Task newTask = new Task(task,id);
        tasks.put(newTask.getId(), newTask);
        return newTask;
    }
    
}
