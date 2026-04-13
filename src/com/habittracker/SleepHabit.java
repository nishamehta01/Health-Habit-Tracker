package com.habittracker;

public class SleepHabit extends HabitItem {

    public SleepHabit(int habitId) {
        super(habitId, "Sleep", 7, "hours", HabitType.SLEEP);
    }

    @Override
    public boolean isCompleted(double actual) {
        return actual >= getTargetValue();
    }

    @Override
    public String getInsight() {
        return "Sleep 7+ hours daily for better health!";
    }
}
