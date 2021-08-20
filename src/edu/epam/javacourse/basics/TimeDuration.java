package edu.epam.javacourse.basics;

public class TimeDuration {
    public static void main(String[] args) {
        TimeDuration duration = new TimeDuration();
        String result = duration.timeDuration(4220);
        System.out.println(result);
    }

    String timeDuration(int T) {
        validateInputParameters(T);
        String timeMessage;
        int hours;
        int minutes;
        int seconds;
        if (T < 60) {
            timeMessage = String.format("00ч 00мин %02dc.", T);
        } else if (T < 3600) {
            minutes = T / 60;
            seconds = T - minutes * 60;
            timeMessage = String.format("00ч %02dмин %02dc.", minutes, seconds);
        } else {
            hours = T / 3600;
            minutes = (T - hours * 3600) / 60;
            seconds = T - hours * 3600 - minutes * 60;
            timeMessage = String.format("%02dч %02dмин %02dc.", hours, minutes, seconds);
        }
        return timeMessage;
    }

    private static void validateInputParameters(int T) {
        if (T <= 0) {
            throw new IllegalArgumentException("Incorrect input: parameter should be a natural number.");
        }
    }
}
