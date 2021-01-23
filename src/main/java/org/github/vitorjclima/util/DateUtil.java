package org.github.vitorjclima.util;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

import static java.util.Date.from;

public abstract class DateUtil {

    public static Date fromLocalDate(LocalDate localDate, ZoneOffset zone) {
        return from(localDate.atStartOfDay().toInstant(zone));
    }
}
