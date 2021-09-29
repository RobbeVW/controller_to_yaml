package be.robbevw.controller_to_yaml.controllers;

import be.robbevw.controller_to_yaml.models.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController {
    @GetMapping("/")
    ResponseEntity<Task> findById(long id) {
        return ResponseEntity.ok(new Task("Title of task"));
    }

    @PostMapping("/")
    ResponseEntity<Task> postTask(@Valid Task task) {
        return ResponseEntity.of(Optional.of(task));
    }
}
