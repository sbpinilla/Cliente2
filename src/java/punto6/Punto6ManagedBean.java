/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;
import org.primefaces.PrimeFaces;
import servicio.PesoDTO;
import servicio.ServicioWeb;
import servicio.ServicioWeb_Service;

/**
 *
 * @author sbpinilla
 */
@ManagedBean(name = "punto6ManagedBean")
@SessionScoped
public class Punto6ManagedBean implements Serializable {

    private List<Integer> listEstudiantes = new ArrayList<>();

    private int numA;
    private int numB;
    private int numC;
    private int numD;

    ServicioWeb port;

    @PostConstruct
    public void init() {

        ServicioWeb_Service web = new ServicioWeb_Service();
        port = web.getServicioWebPort();

        for (int x = 0; x < 50; x++) {
            listEstudiantes.add((int) (Math.random() * 100) + 1);
        }

    }

    /**
     * Creates a new instance of Punto4ManagedBean
     */
    public Punto6ManagedBean() {

    }

    public void calcularNotas() {

        PesoDTO pesoDTO = port.punto6CalcularPeso(listEstudiantes);
        numA = pesoDTO.getNumA();
        numB = pesoDTO.getNumB();
        numC = pesoDTO.getNumC();
        numD = pesoDTO.getNumD();

        PrimeFaces current = PrimeFaces.current();
        current.executeScript("PF('dlg2').show();");

    }

    public Integer obtenerNumero(int index) {
        return listEstudiantes.get(index);
    }

    /* set and get*/
    public List<Integer> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(List<Integer> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public int getNumD() {
        return numD;
    }

    public void setNumD(int numD) {
        this.numD = numD;
    }

}
