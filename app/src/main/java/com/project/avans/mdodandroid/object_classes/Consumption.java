package com.project.avans.mdodandroid.object_classes;

import java.io.Serializable;
import java.util.Calendar;

public class Consumption implements Serializable{
    private Calendar timestamp;
    private String type;
    private double amount;
    private String description;

    public Consumption(Calendar timestamp, String type, double amount, String description) {
        this.timestamp = timestamp;
        this.type = type;
        this.amount = amount;
        this.description = description;
    }

    public Consumption(Calendar timestamp) {
        this.timestamp = timestamp;
    }

    public Calendar getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
