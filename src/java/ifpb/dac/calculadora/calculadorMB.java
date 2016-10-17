/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.calculadora;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author ajp
 */
@ManagedBean
public class calculadorMB {

    private double va;
    private double vb;
    @EJB
    CalculadoraRemote cr;
    private double resultado;

    public void soma() {
//      FacesMessage fm = new FacesMessage("Igual: "+cr.soma(va, vb));
//      FacesContext.getCurrentInstance().addMessage("msg", fm);
        this.resultado = cr.soma(va, vb);
    }

    public void subtracao() {
        this.resultado = cr.subtracao(va, vb);
    }

    public void multiplicacao() {
        this.resultado = cr.multiplicacao(va, vb);
    }

    public void divisao() {
        this.resultado = cr.divisao(va, vb);
    }
    public void limpar(){
        this.va=0.0;
        this.vb=0.0;
        this.resultado=0.0;
    }

    public double getVa() {
        return va;
    }

    public void setVa(double va) {
        this.va = va;
    }

    public double getVb() {
        return vb;
    }

    public void setVb(double vb) {
        this.vb = vb;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public CalculadoraRemote getCr() {
        return cr;
    }

    public void setCr(CalculadoraRemote cr) {
        this.cr = cr;
    }

}
