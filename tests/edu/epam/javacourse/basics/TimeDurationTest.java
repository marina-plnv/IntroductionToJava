package edu.epam.javacourse.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeDurationTest {
    TimeDuration time = new TimeDuration();

    @Test
    void onlySeconds() {
        assertEquals("00ч 00мин 05c.", time.timeDuration(5));
    }

    @Test
    void MinutesSeconds() {
        assertEquals("00ч 01мин 05c.", time.timeDuration(65));
    }

    @Test
    void hoursMinutesSeconds() {
        assertEquals("01ч 10мин 20c.", time.timeDuration(4220));
    }
}