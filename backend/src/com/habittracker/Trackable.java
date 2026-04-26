package com.habittracker;

public interface Trackable {
    void logEntry(int habitId, double actualValue);
    int getStreak(int habitId);
    double getCompletionRate(int habitId);
}
