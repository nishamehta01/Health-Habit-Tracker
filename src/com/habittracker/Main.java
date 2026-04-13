package com.habittracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HabitTracker tracker = new HabitTracker();
        Scanner scanner = new Scanner(System.in);

        tracker.addHabit(new WaterHabit(1));
        tracker.addHabit(new SleepHabit(2));
        tracker.addHabit(new ExerciseHabit(3));
        tracker.addHabit(new ScreenTimeHabit(4));
        tracker.addHabit(new ReadingHabit(5));

        while (true) {
            System.out.println("\n ======> Health Habit Tracker :");
            System.out.println("1. View all habits");
            System.out.println("2. Log today's entry");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tracker.showAllHabits();
                    break;

                case 2:
                    tracker.showAllHabits();
                    System.out.print("Enter Habit ID to log: ");
                    int habitId = scanner.nextInt();
                    System.out.print("Enter actual value: ");
                    double actualValue = scanner.nextDouble();
                    tracker.logEntry(habitId, actualValue);
                    break;

                case 3:
                    System.out.println("Goodbye! Stay healthy!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
