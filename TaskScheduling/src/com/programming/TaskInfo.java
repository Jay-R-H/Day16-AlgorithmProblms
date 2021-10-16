package com.programming;

public class TaskInfo {
    String taskName;
    long deadLine;

    public TaskInfo(String taskName, long deadLine) {
        this.taskName = taskName;
        this.deadLine = deadLine;
    }

    public String getTaskName() {
        return taskName;
    }

    public long getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(long deadLine) {
        this.deadLine = deadLine;
    }
}
