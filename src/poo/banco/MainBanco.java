package poo.banco;

import java.util.ArrayList;
import java.util.List;

import poo.banco.cliente.Cliente;
import poo.banco.conta.Conta;
import poo.banco.conta.ContaSimples;
import poo.banco.exceptions.SaldoInsuficienteException;



public class MainBanco {
    
    public static void main(String[] args) throws SaldoInsuficienteException {
        System.out.println("Banco Digital || Demonstração dos 4 pilares da POO");

        Cliente vitor = new Cliente("Vitor Carvalho", "12345678901", "vitor@email.com");
        Cliente ana = new Cliente("Ana Silva", "09876543210", "ana@email.com");

        System.out.println("Clientes criados (encapsulamento)");
        System.out.println(vitor);
        System.out.println(ana);
        System.out.println("---------");


        List<Conta> contas = new ArrayList<>();
        Conta conta1 = new ContaSimples("CS001", vitor);
        Conta conta2 = new ContaSimples("CS002", ana);

        contas.add(conta1);
        contas.add(conta2);

        conta1.depositar(1000.0);
        conta2.depositar(1700);

        System.out.println("Realizando saques:");
        try {
            conta1.sacar(1001);
            conta2.sacar(1650);
        } catch (SaldoInsuficienteException e) {
            System.err.println("ERRO: " + e.getMessage());
        }

        System.out.println("Saldo atual das contas: ");
        for(Conta conta : contas){
            System.out.println(conta);
        }

        
    }
}
