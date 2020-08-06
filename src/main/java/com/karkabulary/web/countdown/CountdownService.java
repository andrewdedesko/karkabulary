package com.karkabulary.web.countdown;

import org.joda.time.DateTime;
import org.joda.time.Duration;

import java.util.List;

public class CountdownService {
    public List<CountdownDisplay> getCountdowns(){
        final var now = DateTime.now();
        return List.of(
                createCountdownDisplay("Andrew's awesome b-day party!", now, DateTime.parse("2020-08-08T18:00:00Z")),
                createCountdownDisplay("Andrew's getting old", now, DateTime.parse("2020-08-09T04:00:00Z"))
        );
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
