/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

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
@ManagedBean(name = "punto2ManagedBean")
@RequestScoped
public class Punto2ManagedBean {

    private Integer numPreguntasB;
    private Integer numPreguntasC;
    private Integer numPreguntasI;
    private Integer result;

    ServicioWeb port;

    @PostConstruct
    public void init() {

        ServicioWeb_Service web = new ServicioWeb_Service();
        port = web.getServicioWebPort();

    }

    /**
     * Creates a new instance of Punto2ManagedBean
     */
    public Punto2ManagedBean() {
    }

    public void calcularPuntaje() {

        result = port.punto2CalcularPuntaje(numPreguntasB, numPreguntasC, numPreguntasI);

    }

    /*SET AN GET*/
    public Integer getNumPreguntasB() {
        return numPreguntasB;
    }

    public void setNumPreguntasB(Integer numPreguntasB) {
        this.numPreguntasB = numPreguntasB;
    }

    public Integer getNumPreguntasC() {
        return numPreguntasC;
    }

    public void setNumPreguntasC(Integer numPreguntasC) {
        this.numPreguntasC = numPreguntasC;
    }

    public Integer getNumPreguntasI() {
        return numPreguntasI;
    }

    public void setNumPreguntasI(Integer numPreguntasI) {
        this.numPreguntasI = numPreguntasI;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

}
