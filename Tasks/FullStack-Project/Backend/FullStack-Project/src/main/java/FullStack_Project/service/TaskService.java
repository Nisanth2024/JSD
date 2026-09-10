package FullStack_Project.service;

import FullStack_Project.entity.Task;
import FullStack_Project.repository.TaskRepository;
import FullStack_Project.exception.TaskNotFoundException;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Get all tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Get task by id
    public Task getTaskById(Long id) {
        return taskRepository.findById(id)
                .orElseThrow(() ->
                        new TaskNotFoundException(
                                "Task not found with id: " + id
                        )
                );
    }

    // Create task
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Update task
    public Task updateTask(Long id, Task newTask) {

        Task existingTask = getTaskById(id);

        existingTask.setName(newTask.getName());
        existingTask.setDescription(newTask.getDescription());
        existingTask.setAssignedTo(newTask.getAssignedTo());
        existingTask.setDueDate(newTask.getDueDate());
        existingTask.setStatus(newTask.getStatus());

        return taskRepository.save(existingTask);
    }

    // Delete task
    public void deleteTask(Long id) {

        Task existingTask = getTaskById(id);

        taskRepository.delete(existingTask);
    }
}