package com.habittracker;

public class WaterHabit extends HabitItem {

    public WaterHabit(int habitId) {
        super(habitId, "Water Intake", 8, "glasses", HabitType.WATER);
    }

    @Override
    public boolean isCompleted(double actual) {
        return actual >= getTargetValue();
    }

    @Override
    public String getInsight() {
        return "Drink 8 glasses of water daily to stay hydrated!";
    }
}
