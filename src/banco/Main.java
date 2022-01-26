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
public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Michael Jéguerson", 123456789);
        Pessoa p2 = new Pessoa("Rusbé", 987654321);
        Gerente p3 = new Gerente("Billy Jeans", 147258369);
        Agencia ag = new Agencia("Rua Avenida, 123", p3);
        ContaCorrente cc1 = new ContaCorrente(ag, p2, 0, 2000);
        ContaCorrente cc2 = new ContaCorrente(ag, p2, 500, 5000);
        ContaPoupanca cp = new ContaPoupanca(ag, p1, 0);

        cc1.depositar(300);

        System.out.println(cc1);
        System.out.println("============================");
        System.out.println(cc2);
        System.out.println("============================");
        System.out.println(cp);

        if(cc2.transferir(500, cp)){System.out.println("\n*\tTransferencia Realizada\n");}
        else{System.out.println("\n\tSaldo Insuficiente\n");};
        System.out.println("============================");
        System.out.println(cc2);
        System.out.println("============================");
        System.out.println(cp);
    }

}
