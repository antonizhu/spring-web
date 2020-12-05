package com.example.demo.mappers;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class DateMapper {
    public OffsetDateTime timestampToOffsetDateTime(Timestamp timestamp){
        if (timestamp != null){
            LocalDateTime localDateTime = timestamp.toLocalDateTime();
            return OffsetDateTime.of(localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano(), ZoneOffset.UTC );
        }
        return null;
    }

    public Timestamp offsetDateTimeToTimestamp(OffsetDateTime odt){
        if (odt != null){
            return Timestamp.valueOf(odt.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime());
        }

        return null;
    }
}
