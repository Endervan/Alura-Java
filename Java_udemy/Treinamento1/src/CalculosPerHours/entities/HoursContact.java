package CalculosPerHours.entities;

import java.util.Date;

public class HoursContact {
    private Date date;
    private Double valuePerHours;
    private Integer hours;

    public HoursContact(Date date, Double valuePerHours, Integer hours) {
        this.date = date;
        this.valuePerHours = valuePerHours;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(Double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return valuePerHours * hours;
    }
}
