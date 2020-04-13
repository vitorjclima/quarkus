package org.github.vitorjclima.util;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

public abstract class DateUtil {

  public static Date fromLocalDate(LocalDate localDate, ZoneOffset zone) {
    return Date.from(localDate.atStartOfDay().toInstant(zone));
  }
}
