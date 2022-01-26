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
public class ContaCorrente extends Conta {

    public ContaCorrente(Agencia agencia, Pessoa cliente, double saldo, double limite) {
        super(agencia, cliente, saldo, limite);
    }

    @Override
    public String toString() {
        return "Conta Corrente: " + this.getNumero()
                + "\nAgencia: " + this.getAgencia().getNumero()
                + "\nSaldo: R$" + this.getSaldo()
                + "\nLimite Aprovado: R$" + this.getLimite();
    }
}
