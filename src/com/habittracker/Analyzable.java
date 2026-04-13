package com.habittracker;

public interface Analyzable {
    double getWeeklyScore();
    String detectPattern();
    String getWeakDay();
}
