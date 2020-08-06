package com.karkabulary.web.countdown;

public class CountdownDisplay {
    private final String label;
    private final long days;
    private final long hours;
    private final long minutes;

    public CountdownDisplay(String label, long days, long hours, long minutes) {
        this.label = label;
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
    }

    public String getLabel() {
        return label;
    }

    public long getDays() {
        return days;
    }

    public long getHours() {
        return hours;
    }

    public long getMinutes() {
        return minutes;
    }
}
