package com.karkabulary.web.countdown;

import org.joda.time.DateTime;
import org.joda.time.Duration;

import java.util.List;

public class CountdownService {
    public List<CountdownDisplay> getCountdowns(){
        final var now = DateTime.now();
        final var nextBirthday = getNextBirthday(8, 9);
        return List.of(
                createCountdownDisplay("Andrew's getting old", now, nextBirthday)
        );
    }

    private static DateTime getNextBirthday(int month, int day){
        final var now = DateTime.now();

        int year;
        if(now.getMonthOfYear() < month){
            year = now.getYear();
        }else if(now.getMonthOfYear() == month && now.getDayOfMonth() <= day){
            year = now.getYear();
        }else{
            year = now.getYear() + 1;
        }

        return new DateTime(year, month, day, 0, 0);
    }

    private static CountdownDisplay createCountdownDisplay(String label, DateTime currentTime, DateTime eventTime){
        if(eventTime.isBefore(currentTime))
            return new CountdownDisplay(label, 0, 0, 0);

        final var delta = new Duration(currentTime, eventTime);
        final var totalMinutes = delta.getStandardMinutes();
        final var days = (long)Math.floor(totalMinutes / (60 * 24));
        final var hours = (long)Math.floor((totalMinutes % (60 * 24)) / 60);
        final var minutes = totalMinutes % 60;
        return new CountdownDisplay(label, days, hours, minutes);
    }
}
