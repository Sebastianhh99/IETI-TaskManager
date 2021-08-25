package co.escuelaing.ieti.resttask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.escuelaing.ieti.resttask.data.Task;
import co.escuelaing.ieti.resttask.dto.TaskDto;
import co.escuelaing.ieti.resttask.service.TaskService;

@RestController
@RequestMapping("/v1/task")
public class TaskController {
    
    @Autowired
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> all(){
        return ResponseEntity.ok(taskService.all());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> findById(@PathVariable int id){
        return ResponseEntity.ok(taskService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody TaskDto task){
        return ResponseEntity.ok(taskService.create(task));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@RequestBody TaskDto task,@PathVariable int id){
        return ResponseEntity.ok(taskService.update(task, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteTask(@PathVariable int id){
        taskService.deleteById(id);
        return ResponseEntity.ok(true);
    }

}
