package com.bmk.infoweeb.dto;

import java.sql.Timestamp;
import java.util.Date;

public class TaskDTO {

    private String taskName;
    private String taskDetails;
    private String taskCategory;
    private int minuteSpent;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails;
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
    }

    public int getMinuteSpent() {
        return minuteSpent;
    }

    public void setMinuteSpent(int minuteSpent) {
        this.minuteSpent = minuteSpent;
    }

}
