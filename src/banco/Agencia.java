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
class Agencia {
   private String endereço;
   private Gerente gerente;
   private static int seq = 1;
   private int numero;

    public Agencia(String endereço, Gerente gerente) {
        this.endereço = endereço;
        this.gerente = gerente;
        this.numero = seq++;
    }

    public String getEndereço() {
        return endereço;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public int getNumero() {
        return numero;
    }
}
