/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 12046386671
 */
public class ContaCorrente extends Conta {

    @Override
    public void atualiza(double taxa) {
        double depositar = this.getSaldo() * (taxa * 2);
        this.deposita(depositar);
    }

    @Override
    public void deposita(double valor) { //método
        super.deposita(valor - 1);
    }

}
