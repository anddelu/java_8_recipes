package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Ken Kousen on 7/14/16.
 */
public class ConvertDate {
    public LocalDate convertFromDateToLD(Date date) {
        return new java.sql.Date(date.getTime()).toLocalDate();
    }

    public LocalDateTime convertFromDateToLDUsingString(Date date) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return LocalDateTime.parse(df.format(date), DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    public LocalDateTime convertFromDateToLDT(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    public LocalDateTime convertFromCalendar(Calendar cal) {
        return LocalDateTime.ofInstant(cal.toInstant(), ZoneId.systemDefault());
    }

    public LocalDateTime convertFromCalendarUsingGetters(Calendar cal) {
        return LocalDateTime.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),
                cal.get(Calendar.HOUR), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));
    }
}
