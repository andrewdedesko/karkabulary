package com.karkabulary.web;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class CountdownServiceTests {
    @Test
    public void test(){
        final var dateTime = DateTime.parse("2021-01-01T00:00:00");
        assertThat(dateTime.getMonthOfYear()).isEqualTo(1);
        assertThat(dateTime.getDayOfMonth()).isEqualTo(1);
    }
}
