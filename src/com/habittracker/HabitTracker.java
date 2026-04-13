package com.habittracker;
import java.util.ArrayList;

public class HabitTracker implements Trackable, Analyzable {
    private ArrayList<HabitItem> habits = new ArrayList<>();
    private ArrayList<String> dailyLogs = new ArrayList<>();

    public void addHabit(HabitItem habit) {
        habits.add(habit);
        System.out.println(habit.getHabitName() + " added successfully!");
    }

    public void showAllHabits() {
        if (habits.isEmpty()) {
            System.out.println("No habits added yet!");
            return;
        }
        System.out.println("\n--- Your Habits ---");
        for (HabitItem habit : habits) {
            System.out.println(habit.getHabitId() + ". " + habit.getHabitName()
                    + " | Target: " + habit.getTargetValue() + " " + habit.getUnit());
        }
    }

    @Override
    public void logEntry(int habitId, double actualValue) {
        for (HabitItem habit : habits) {
            if (habit.getHabitId() == habitId) {
                boolean completed = habit.isCompleted(actualValue);
                String log = "Habit: " + habit.getHabitName()
                        + " | Actual: " + actualValue
                        + " | Completed: " + completed;
                dailyLogs.add(log);
                System.out.println(log);
                if (completed) {
                    System.out.println("Great job! " + habit.getInsight());
                } else {
                    System.out.println("Keep going! Target: "
                            + habit.getTargetValue() + " " + habit.getUnit());
                }
                return;
            }
        }
        System.out.println("Habit not found!");
    }

    @Override
    public int getStreak(int habitId) {
        return 0;
    }

    @Override
    public double getCompletionRate(int habitId) {
        return 0.0;
    }

    @Override
    public double getWeeklyScore() {
        return 0.0;
    }

    @Override
    public String detectPattern() {
        return "Pattern detection coming soon!";
    }

    @Override
    public String getWeakDay() {
        return "Weak day detection coming soon!";
    }
}
