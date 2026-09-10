package FullStack_Project.controller;

import FullStack_Project.entity.Task;
import FullStack_Project.service.TaskService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // GET all tasks
    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    // GET task by ID
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    // CREATE task
    @PostMapping
    public ResponseEntity<Task> createTask(@Valid @RequestBody Task task) {

        Task createdTask = taskService.createTask(task);

        return new ResponseEntity<>(
                createdTask,
                HttpStatus.CREATED
        );
    }

    // UPDATE task
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(
            @PathVariable Long id,
            @Valid @RequestBody Task task) {

        return ResponseEntity.ok(
                taskService.updateTask(id, task)
        );
    }

    // DELETE task
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable Long id) {

        taskService.deleteTask(id);

        return ResponseEntity.ok(
                "Task deleted successfully"
        );
    }
}