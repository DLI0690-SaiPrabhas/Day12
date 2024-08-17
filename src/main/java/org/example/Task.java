package org.example;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class Task {
    private int id;
    private String description;
    private String DueDate;
    private boolean completed;
    Path path= Paths.get("TaskDetails.json");

    public Task(int id, String description, String dueDate, boolean completed) {
        this.id = id;
        this.description = description;
        DueDate = dueDate;
        this.completed = completed;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return DueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", DueDate='" + DueDate + '\'' +
                ", completed=" + completed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && completed == task.completed && Objects.equals(description, task.description) && Objects.equals(DueDate, task.DueDate) && Objects.equals(path, task.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, DueDate, completed, path);
    }
}
