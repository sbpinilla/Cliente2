/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import servicio.ServicioWeb;
import servicio.ServicioWeb_Service;

/**
 *
 * @author sbpinilla
 */
@ManagedBean(name = "punto1ManagedBean")
@RequestScoped
public class Punto1ManagedBean {

    private Boolean showResult = false;

    private int itemM;
    private int itemN;
    private int itemP;
    private int itemQ;
    private int itemR;
    private int itemB;
    private int itemA;
    private int itemC;

    private int resultado1;
    private int resultado2;
    private int resultado3;
    private int resultado4;
    private int resultado5;
    private double resultado6;

    ServicioWeb port;

    @PostConstruct
    public void init() {

        ServicioWeb_Service web = new ServicioWeb_Service();
        port = web.getServicioWebPort();

    }

    /**
     * Creates a new instance of Punto1ManagedBean
     */
    public Punto1ManagedBean() {
    }

    public void calcularFormulas() {

        resultado1 = port.punto1FormulaUno(itemM, itemN, itemP);
        resultado2 = port.punto1FormulaDos(itemM, itemN, itemP, itemQ);
        resultado3 = port.punto1FormulaTres(itemM, itemN, itemP, itemQ);
        resultado4 = port.punto1FormulaCuatro(itemM, itemN, itemP, itemQ, itemR);
        resultado5 = port.punto1FormulaCinco(itemM, itemN, itemP, itemQ);
        resultado6 = port.punto1FormulaSeis(itemB, itemA, itemC);
        
        showResult = true;

    }

    /* Set and Get */
    public Boolean getShowResult() {
        return showResult;
    }

    public void setShowResult(Boolean showResult) {
        this.showResult = showResult;
    }

    public int getItemM() {
        return itemM;
    }

    public void setItemM(int itemM) {
        this.itemM = itemM;
    }

    public int getItemN() {
        return itemN;
    }

    public void setItemN(int itemN) {
        this.itemN = itemN;
    }

    public int getItemP() {
        return itemP;
    }

    public void setItemP(int itemP) {
        this.itemP = itemP;
    }

    public int getItemQ() {
        return itemQ;
    }

    public void setItemQ(int itemQ) {
        this.itemQ = itemQ;
    }

    public int getItemR() {
        return itemR;
    }

    public void setItemR(int itemR) {
        this.itemR = itemR;
    }

    public int getItemB() {
        return itemB;
    }

    public void setItemB(int itemB) {
        this.itemB = itemB;
    }

    public int getItemA() {
        return itemA;
    }

    public void setItemA(int itemA) {
        this.itemA = itemA;
    }

    public int getItemC() {
        return itemC;
    }

    public void setItemC(int itemC) {
        this.itemC = itemC;
    }

    public int getResultado1() {
        return resultado1;
    }

    public void setResultado1(int resultado1) {
        this.resultado1 = resultado1;
    }

    public int getResultado2() {
        return resultado2;
    }

    public void setResultado2(int resultado2) {
        this.resultado2 = resultado2;
    }

    public int getResultado3() {
        return resultado3;
    }

    public void setResultado3(int resultado3) {
        this.resultado3 = resultado3;
    }

    public int getResultado4() {
        return resultado4;
    }

    public void setResultado4(int resultado4) {
        this.resultado4 = resultado4;
    }

    public int getResultado5() {
        return resultado5;
    }

    public void setResultado5(int resultado5) {
        this.resultado5 = resultado5;
    }

    public double getResultado6() {
        return resultado6;
    }

    public void setResultado6(double resultado6) {
        this.resultado6 = resultado6;
    }

}
