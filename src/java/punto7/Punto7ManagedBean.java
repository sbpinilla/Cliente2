/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import servicio.ServicioWeb;
import servicio.ServicioWeb_Service;

/**
 *
 * @author sbpinilla
 */
@ManagedBean(name = "punto7ManagedBean")
@ViewScoped
public class Punto7ManagedBean implements Serializable {

    private Integer numUno;
    private Integer numDos;
    private Integer mcd;

    ServicioWeb port;

    @PostConstruct
    public void init() {

        ServicioWeb_Service web = new ServicioWeb_Service();
        port = web.getServicioWebPort();
    }

    /**
     * Creates a new instance of Punto7ManagedBean
     */
    public Punto7ManagedBean() {
    }

    public void calcularMCD() {

        mcd = port.punto7CalcularMCD(numUno, numDos);

    }

    /*Get And Set*/
    public Integer getNumUno() {
        return numUno;
    }

    public void setNumUno(Integer numUno) {
        this.numUno = numUno;
    }

    public Integer getNumDos() {
        return numDos;
    }

    public void setNumDos(Integer numDos) {
        this.numDos = numDos;
    }

    public Integer getMcd() {
        return mcd;
    }

    public void setMcd(Integer mcd) {
        this.mcd = mcd;
    }

}
