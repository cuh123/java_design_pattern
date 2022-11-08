package com.design_pattern.demo.sold.time_reminder.before;

import com.design_pattern.demo.sold.time_reminder.MP3;

import java.util.Calendar;

public class TimeReminder {
  private MP3 m;

  public void reminder() {
    Calendar cal = Calendar.getInstance();
    m = new MP3();
    int hour = cal.get(Calendar.HOUR_OF_DAY);

    if (hour >= 12) {
      m.playSong();
    } else {
      System.out.println("플레이 타임이 아닙니다.");
    }
  }
}
