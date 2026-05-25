package java_time.agenda;

import java_time.agenda.evento.Evento;
import java_time.agenda.util.DataUtil;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.time.LocalDateTime;

public class MainAgenda{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Evento> eventos = new ArrayList<>();

        System.out.println("Minha Agenda: ");
    }

    private static void AdicionarEvento(Scanner scanner, List<Evento> eventos){
        System.out.println("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.println("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("Local: ");
        String local = scanner.nextLine();

        System.out.println("Data e Hora (dd/MM/yyyy HH:mm): ");
        String dataHoraString = scanner.nextLine();

        LocalDateTime dataHora = DataUtil.parse(dataHoraString);

        if(dataHora != null){
            Evento novoEvento = new Evento(titulo, descricao, local, dataHora);
            eventos.add(novoEvento);
            System.out.println("Evento adicionado com sucesso!");
        }
    }
}