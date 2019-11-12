/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import servicio.ServicioWeb;
import servicio.ServicioWeb_Service;

/**
 *
 * @author sbpinilla
 */
@ManagedBean(name = "punto3ManagedBean")
@RequestScoped
public class Punto3ManagedBean {

    private Integer numGb;
    private Integer resultado;

    ServicioWeb port;

    @PostConstruct
    public void init() {

        ServicioWeb_Service web = new ServicioWeb_Service();
        port = web.getServicioWebPort();

    }

    /**
     * Creates a new instance of Punto3ManagedBean
     */
    public Punto3ManagedBean() {
    }

    public void calcularCDS() {

        resultado = port.punto3CalcularCDS(numGb);

    }

    /*Get and set*/
    public Integer getNumGb() {
        return numGb;
    }

    public void setNumGb(Integer numGb) {
        this.numGb = numGb;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

}
