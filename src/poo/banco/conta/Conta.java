package poo.banco.conta;

import poo.banco.cliente.Cliente;
import poo.banco.exceptions.SaldoInsuficienteException;

public class Conta {
    protected String numero;
    protected double saldo;
    protected Cliente titular;

    public Conta(String numero, double saldo, Cliente titular){
        this.numero = numero;
        this.saldo = 0.0;
        this.titular = titular; 
    }

    
}
