package be.robbevw.controller_to_yaml.models;

import java.time.LocalDateTime;

public class Task {
    private final String title;
    private final LocalDateTime dateCreated;

    public Task(String title) {
        this.title = title;
        dateCreated = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }
}
