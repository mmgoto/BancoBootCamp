/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author ma_ma
 */
abstract class Conta {

    private static int seq = 10000;
    private int numero;
    private Agencia agencia;
    private Pessoa cliente;
    private double saldo;
    private double limite;

    public Conta(Agencia agencia, Pessoa cliente, double saldo, double limite) {
        this.numero = seq++;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
    }

    boolean sacar(int valor) {
        if ((saldo + limite) >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    ;

    void depositar(int valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    ;
    
    boolean transferir(int valor, Conta conta) {
        if (this.sacar(valor)) {
            conta.saldo += valor;
            return true;
        }
        return false;
    }

    ;

    public int getNumero() {
        return numero;
    }

    void setNumero(int numero) {
        this.numero = numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    void setLimite(double limite) {
        this.limite = limite;
    }

}
