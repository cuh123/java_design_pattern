package com.design_pattern.demo.sold.time_reminder;

import com.design_pattern.demo.sold.time_reminder.after.FakeTimeProvider;
import com.design_pattern.demo.sold.time_reminder.after.TimeProvider;
import com.design_pattern.demo.sold.time_reminder.after.TimeReminder;

public class timeApplication {
  public static void main(String[] args) {
    TimeReminder timeReminder = new TimeReminder();
    TimeProvider timeProvider = new FakeTimeProvider();
    timeProvider.setHours(23);
    timeReminder.setTimeProvider(timeProvider);
    timeReminder.reminder();
  }
}
