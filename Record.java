package com.javarush.task.task39.task3913;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Record {
    private String ip;
    private String user;
    private Date date;
    private Event event;
    private int task;
    private Status status;

    public Record(String ip, String user, Date date, Event event, int task, Status status) {
        this.ip = ip;
        this.user = user;
        this.date = date;
        this.event = event;
        this.task = task;
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public String getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    public String getStringDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        return format.format(date);
    }

    public Event getEvent() {
        return event;
    }

    public String getStringEvent() {
        return event.toString();
    }

    public int getTask() {
        return task;
    }

    public Status getStatus() {
        return status;
    }

    public String getStringStatus() {
        return status.toString();
    }
}














