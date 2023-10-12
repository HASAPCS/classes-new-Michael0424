package com.example;

public class Clock {
    private int hours;
    private int minutes;

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public void addMinutes(int minutes) {
        this.minutes += minutes;
        this.hours += this.minutes /60 ;
        this.minutes %= 60;
        // TODO: Add the value of the minutes parameter to the current minutes. 
        // Adjust the hours and minutes accordingly to represent a valid time.
    }

    public String getTime() {
        if(this.hours>12){
            this.hours%=12;
            if (this.hours>10){
                return this.hours+":"+this.minutes;
            } else {
                return "0"+this.hours+":"+this.minutes;
            }
        }
        // TODO: Return the time in the format "HH:MM"
        return "";  // Change this default return statement
    }
}


