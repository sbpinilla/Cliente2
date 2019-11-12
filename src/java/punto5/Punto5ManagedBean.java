/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import servicio.ServicioWeb;
import servicio.ServicioWeb_Service;

/**
 *
 * @author sbpinilla
 */
@ManagedBean(name = "punto5ManagedBean")
@ViewScoped
public class Punto5ManagedBean implements Serializable {

    private Integer numKilometros;
    private Integer numDias;
    private Integer resultado;

    ServicioWeb port;

    @PostConstruct
    public void init() {

        ServicioWeb_Service web = new ServicioWeb_Service();
        port = web.getServicioWebPort();
    }

    /**
     * Creates a new instance of Punto5ManagedBean
     */
    public Punto5ManagedBean() {
    }

    public void calcularPrecioBillete() {

        resultado = port.punto5CalcularPrecioBillete(numKilometros, numDias);

    }

    /*Get and set*/
    public Integer getNumKilometros() {
        return numKilometros;
    }

    public void setNumKilometros(Integer numKilometros) {
        this.numKilometros = numKilometros;
    }

    public Integer getNumDias() {
        return numDias;
    }

    public void setNumDias(Integer numDias) {
        this.numDias = numDias;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

}
