package com.programming;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskExecution {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<TaskInfo> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        TaskInfo task = null;
        System.out.println("Enter the number of tasks to be completed: ");
        int numberOfTasks = scanner.nextInt();

        for (int i = 0; i < numberOfTasks; i++) {
            System.out.println("Enter the name of the task : ");
            String taskName = scanner.next();

            System.out.println("Enter the deadline for the task : ");
            long deadline = scanner.nextLong();

            task = new TaskInfo(taskName, deadline);
            arrayList.add(task);
        }
        int count = 0;
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println("Enter " + (i + 1) + " to " + arrayList.get(i).taskName);
            }
            System.out.println("Enter " + (numberOfTasks + 1) + " if task is completed");

            int choice = scanner.nextInt();

            if (choice != 0 && choice <= numberOfTasks) {
                if (arrayList.get(choice - 1).getDeadLine() > 0) {
                    System.out.println("Enter the time limit you want to continue the task till : "); // Enter the input in the form of HH:MM:SS
                    long limit = scanner.nextLong();
                    arrayList.get(choice - 1).setDeadLine(arrayList.get(choice - 1).getDeadLine() - limit);
                    System.out.println("Updated deadline for the task " + arrayList.get(choice - 1).getTaskName() + " is : " + arrayList.get(choice - 1).getDeadLine());
                    count++;
                    flag = true;
                } else {
                    System.out.println("The task scheduler got executed for " + count + " time to complete all the tasks ");
                }
            }

        }
    }
}
