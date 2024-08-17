package org.example;

import java.io.*;
import java.nio.file.*;
import java.util.*;


public class Main {
    private static final String FILE_PATH = "tasks.json";
    private static List<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        loadTasks();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add a New Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    addNewTask(scanner);
                    break;
                case 2:
                    viewAllTasks();
                    break;
                case 3:
                    saveTasks();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void saveTasks() {
    }

    private static void viewAllTasks() {

    }

    private static void addNewTask(Scanner scanner) {

    }

    private static void loadTasks() {

    }



}