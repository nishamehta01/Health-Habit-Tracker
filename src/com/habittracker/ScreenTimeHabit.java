package com.habittracker;

public class ScreenTimeHabit extends HabitItem {

    public ScreenTimeHabit(int habitId) {
        super(habitId, "Screen Time", 3, "hours", HabitType.SCREEN_TIME);
    }

    @Override
    public boolean isCompleted(double actual) {
        return actual <= getTargetValue();
    }

    @Override
    public String getInsight() {
        return "Limit screen time to 3 hours for better focus!";
    }
}
