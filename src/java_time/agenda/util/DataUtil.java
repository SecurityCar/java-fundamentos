package java_time.agenda.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataUtil {
    
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public static LocalDateTime parse(String dataHoraStr){
        try {
            return LocalDateTime.parse(dataHoraStr, FORMATTER);
        } catch (Exception ex) {
            System.err.println("FORMATO INVALIDO! Utilize: dd/MM/yyyy HH:mm");
            return null;
        }
    }

    public static String formatar(LocalDateTime dataHora){
        return dataHora.format(FORMATTER);
    }
}
