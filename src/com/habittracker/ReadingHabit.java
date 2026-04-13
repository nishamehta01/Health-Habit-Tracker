package com.habittracker;

public class ReadingHabit extends HabitItem {

    public ReadingHabit(int habitId) {
        super(habitId, "Reading", 20, "pages", HabitType.READING);
    }

    @Override
    public boolean isCompleted(double actual) {
        return actual >= getTargetValue();
    }

    @Override
    public String getInsight() {
        return "Read 20 pages daily to keep learning!";
    }
}
