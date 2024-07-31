package org.example;

import org.apache.commons.lang3.time.DateUtils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatesUtil {

    private DatesUtil() {
    }

    public static void generateDates(String startTime, String endTime) {
        int secondsInterval = 5;
        Date startDateTime = Timestamp.valueOf(startTime);
        Date endDateTime = Timestamp.valueOf(endTime);

        while (startDateTime.getTime() < endDateTime.getTime()) {
            Date endQueryDateTime = DateUtils.addSeconds(startDateTime, secondsInterval);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            System.out.println(sdf.format(startDateTime) + "," + sdf.format(endQueryDateTime));
            startDateTime = endQueryDateTime;
        }
    }
}
