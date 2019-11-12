/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.PrimeFaces;
import servicio.NotasDTO;
import servicio.ServicioWeb;
import servicio.ServicioWeb_Service;

/**
 *
 * @author sbpinilla
 */
@ManagedBean(name = "punto4ManagedBean")
@ViewScoped
public class Punto4ManagedBean implements Serializable {

    private List<Integer> listEstudiantes = new ArrayList<>();

    private int numA;
    private int numB;
    private int numC;
    private int numD;
    private int numF;
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
    public Punto4ManagedBean() {

    }

    public void calcularNotas() {

        NotasDTO  notas  = port.punto4CalcularNotas(listEstudiantes);
        
        numA = notas.getNumA();
        numB = notas.getNumB();
        numC = notas.getNumC();
        numD = notas.getNumD();
        numF = notas.getNumF();
        
        PrimeFaces current = PrimeFaces.current();
        current.executeScript("PF('dlg2').show();");

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

    public int getNumF() {
        return numF;
    }

    public void setNumF(int numF) {
        this.numF = numF;
    }

}
