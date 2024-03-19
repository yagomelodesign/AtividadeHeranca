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
public class ContaPoupanca extends Conta {

    @Override
    public void atualiza(double taxa) {
        double depositar = this.getSaldo() * (taxa * 3);
        this.deposita(depositar);
    }

}
