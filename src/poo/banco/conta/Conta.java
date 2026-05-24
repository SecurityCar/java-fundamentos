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

    public void depositar(double valor) throws SaldoInsuficienteException {
        if(valor <= 0){
            throw new IllegalArgumentException("O valor a ser depositado deve ser maior do que 0.");
        }
        saldo += valor;
        System.out.printf("O depósito no valor de R$ %.2f foi realizado na conta %s%n", valor, numero);
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor <= 0){
            throw new IllegalArgumentException("O valor a ser sacado deve ser maior do que 0.");
        }
        if(valor > saldo){
            throw new SaldoInsuficienteException("Você não possui saldo suficiente.");
        }
        saldo -= valor;
        System.out.printf("O saque no valor de R$ %.2f foi realizado na conta %s%n", valor, numero);
    }
}
