package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public static Date getDate(String datePattern, String date) throws ParseException {

        return new SimpleDateFormat(datePattern).parse(date);
    }
}
