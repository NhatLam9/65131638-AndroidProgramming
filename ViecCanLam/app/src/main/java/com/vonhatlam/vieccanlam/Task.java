package com.vonhatlam.vieccanlam;

import java.io.Serializable;
import java.util.HashMap;

public class Task implements Serializable {
    String name;
    String date;
    String message;
    String priority;

    public Task() {
    }

    public Task(String message, String name, String date, String priority) {
        this.message = message;
        this.name = name;
        this.date = date;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public HashMap<String, String> toFireBaseObject() {
        HashMap<String, String> taskObject = new HashMap<String, String>();
        taskObject.put("name", name);
        taskObject.put("date", date);
        taskObject.put("message", message);
        taskObject.put("priority", priority);
        return taskObject;

    }
}
