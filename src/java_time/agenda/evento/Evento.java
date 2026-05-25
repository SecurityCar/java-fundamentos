package java_time.agenda.evento;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Evento {
    
    private String titulo;
    private String descricao;
    private String local;
    private LocalDateTime dataHora;

    public Evento(String titulo, String descricao, String local, LocalDateTime dataHora){
        this.titulo = titulo;
        this.descricao = descricao;
        this.local = local;
        this.dataHora = dataHora;
    }
}
