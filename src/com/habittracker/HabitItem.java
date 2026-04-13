package com.habittracker;

public abstract class HabitItem {
    private int habitId;
    private String habitName;
    private double targetValue;
    private String unit;
    private HabitType habitType;

    public HabitItem(int habitId, String habitName, double targetValue, String unit, HabitType habitType) {
        this.habitId = habitId;
        this.habitName = habitName;
        this.targetValue = targetValue;
        this.unit = unit;
        this.habitType = habitType;

    }

    public int getHabitId() { return habitId; }
    public String getHabitName() { return habitName; }
    public double getTargetValue() { return targetValue; }
    public String getUnit() { return unit; }
    public HabitType getHabitType() { return habitType; }


    public abstract boolean isCompleted(double actual);
    public abstract String getInsight();
}
