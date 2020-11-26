package net.purgepots.shared.system.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author - Freddie (FreddieJLH#0001)
 * @date - Created on 26/11/2020
 */
public class Logger {

    public static void log(String logMessage, boolean showTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println((showTime ? "[" + dateTimeFormatter.format(LocalDateTime.now()) + "]" : "") + " " + logMessage);
    }
}
