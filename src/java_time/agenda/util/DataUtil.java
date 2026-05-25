package java_time.agenda.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class DataUtil {
    
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public static LocalDateTime parse(String dataHoraStr){
        try {
            return LocalDateTime.parse(dataHoraStr, FORMATTER);
        } catch (DateTimeParseException ex) {
            System.err.println("FORMATO INVALIDO! Utilize: dd/MM/yyyy HH:mm");
            return null;
        }
    }

    public static String formatar(LocalDateTime dataHora){
        return dataHora.format(FORMATTER);
    }

    public static Period calcularDiasRestantes(LocalDateTime dataFutura){
        LocalDate hoje = LocalDate.now();
        LocalDate dataAlvo = dataFutura.toLocalDate();
        return Period.between(hoje, dataAlvo);
    }
}
