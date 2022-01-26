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
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Agencia agencia, Pessoa cliente, double saldo) {
        super(agencia, cliente, saldo, 0);
    }

    @Override
    public String toString() {
        return "Conta Poupança: " + this.getNumero()
                + "\nAgencia: " + this.getAgencia().getNumero()
                + "\nSaldo: R$" + this.getSaldo();
    }
}
