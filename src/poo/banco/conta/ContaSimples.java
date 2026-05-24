package poo.banco.conta;

import poo.banco.cliente.Cliente;
import poo.banco.exceptions.SaldoInsuficienteException;

public class ContaSimples extends Conta{

    public ContaSimples(String numero, Cliente titular){
        super(numero, titular);
    }

    @Override
    public String toString(){
        return String.format("Conta Simples %s | Titular: %s | Saldo: R$ %.2f", numero, titular.getNome(), saldo);
    }
}
