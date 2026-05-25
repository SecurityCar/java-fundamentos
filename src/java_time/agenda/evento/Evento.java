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

    public String getTitulo(){
        return titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public String getLocal(){
        return local;
    }

    public LocalDateTime getDataHora(){
        return dataHora;
    }

    public boolean estaAtrasado(){
        return LocalDateTime.now().isAfter(dataHora);
    }

    public boolean vaiAcontecerHoje(){
        //Transforma a dataHora em um formato e compara com o LocalDateTime.now(), também transformado
        return dataHora.toLocalDate().equals(LocalDateTime.now().toLocalDate());
    }
}
