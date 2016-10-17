/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.calculadora;

import javax.ejb.Local;

/**
 *
 * @author ajp
 */
@Local
public interface CalculadoraRemote {

    public double soma(double va, double vb);

    public double subtracao(double va, double vb);

    public double multiplicacao(double va, double vb);

    public double divisao(double va, double vb);

}
