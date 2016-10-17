/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.calculadora;

import javax.ejb.Stateless;

/**
 *
 * @author ajp
 */
@Stateless
public class CalculadoraImp implements CalculadoraRemote {

    @Override
    public double soma(double va, double vb) {
        return va + vb;
    }

    @Override
    public double subtracao(double va, double vb) {
        return va - vb;
    }

    @Override
    public double multiplicacao(double va, double vb) {
        return va * vb;
    }

    @Override
    public double divisao(double va, double vb) {
        return va / vb;
    }

}
