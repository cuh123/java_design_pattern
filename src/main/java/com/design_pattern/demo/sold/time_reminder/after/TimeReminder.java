package com.design_pattern.demo.sold.time_reminder.after;

import com.design_pattern.demo.sold.time_reminder.MP3;

public class TimeReminder {
  TimeProvider tProv;
  MP3 m = new MP3();

  public void setTimeProvider(TimeProvider tProv) {
    this.tProv = tProv;
  }

  public void reminder() {
    int hours = tProv.getTime();
    if (hours >= 22) {
      m.playSong();
    }
  }
}
