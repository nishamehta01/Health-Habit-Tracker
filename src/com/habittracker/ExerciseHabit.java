package com.habittracker;

public class ExerciseHabit extends HabitItem  {

    public ExerciseHabit(int habitId) {
        super(habitId, "Exercise", 30, "minutes", HabitType.EXERCISE);
    }

    @Override
    public boolean isCompleted(double actual) {
        return actual >= getTargetValue();
    }

    @Override
    public String getInsight() {
        return "Exercise 30 minutes daily to stay fit!";
    }
}
