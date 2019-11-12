/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import servicio.NominaInDTO;
import servicio.NominaOutDTO;
import servicio.ServicioWeb;
import servicio.ServicioWeb_Service;

/**
 *
 * @author sbpinilla
 */
@ManagedBean(name = "punto8ManagedBean")
@ViewScoped
public class Punto8ManagedBean implements Serializable {

    private Boolean isResultado = false;
    private String cedula = "";
    private String nombre = "";
    private String dias = "";
    private String salario = "";
    private String horaExtDiurna = "";
    private String horaExtNocturna = "";
    private String horaExtFestivo = "";

    private int resSalario;
    private int resHoraExtDiurna;
    private int resHoraExtNocturna;
    private int resHoraExtFestivo;
    private int subTransporte;
    private int subDeducido;

    private int total;

    ServicioWeb port;

    @PostConstruct
    public void init() {

        ServicioWeb_Service web = new ServicioWeb_Service();
        port = web.getServicioWebPort();
    }

    /**
     * Creates a new instance of Punto8ManagedBean
     */
    public Punto8ManagedBean() {
    }

    public void calcularNomina() {

        NominaInDTO nominaInDTO = new NominaInDTO();

        nominaInDTO.setCedula(cedula);
        nominaInDTO.setNombre(nombre);
        nominaInDTO.setDias(dias);
        nominaInDTO.setSalario(salario);
        nominaInDTO.setHoraExtDiurna(horaExtDiurna);
        nominaInDTO.setHoraExtFestivo(horaExtFestivo);
        nominaInDTO.setHoraExtNocturna(horaExtNocturna);

        NominaOutDTO nominaOutDTO = port.punto8CalcularNomina(nominaInDTO);

        resSalario = nominaOutDTO.getResSalario();
        resHoraExtDiurna = nominaOutDTO.getResHoraExtDiurna();
        resHoraExtNocturna = nominaOutDTO.getResHoraExtNocturna();
        resHoraExtFestivo = nominaOutDTO.getResHoraExtFestivo();
        subTransporte = nominaOutDTO.getSubTransporte();
        subDeducido = nominaOutDTO.getSubDeducido();
        total = nominaOutDTO.getTotal();

        isResultado = true;
    }

    /* Set and get */
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getHoraExtDiurna() {
        return horaExtDiurna;
    }

    public void setHoraExtDiurna(String horaExtDiurna) {
        this.horaExtDiurna = horaExtDiurna;
    }

    public String getHoraExtNocturna() {
        return horaExtNocturna;
    }

    public void setHoraExtNocturna(String horaExtNocturna) {
        this.horaExtNocturna = horaExtNocturna;
    }

    public String getHoraExtFestivo() {
        return horaExtFestivo;
    }

    public void setHoraExtFestivo(String horaExtFestivo) {
        this.horaExtFestivo = horaExtFestivo;
    }

    public Boolean getIsResultado() {
        return isResultado;
    }

    public void setIsResultado(Boolean isResultado) {
        this.isResultado = isResultado;
    }

    public int getResSalario() {
        return resSalario;
    }

    public void setResSalario(int resSalario) {
        this.resSalario = resSalario;
    }

    public int getResHoraExtDiurna() {
        return resHoraExtDiurna;
    }

    public void setResHoraExtDiurna(int resHoraExtDiurna) {
        this.resHoraExtDiurna = resHoraExtDiurna;
    }

    public int getResHoraExtNocturna() {
        return resHoraExtNocturna;
    }

    public void setResHoraExtNocturna(int resHoraExtNocturna) {
        this.resHoraExtNocturna = resHoraExtNocturna;
    }

    public int getResHoraExtFestivo() {
        return resHoraExtFestivo;
    }

    public void setResHoraExtFestivo(int resHoraExtFestivo) {
        this.resHoraExtFestivo = resHoraExtFestivo;
    }

    public int getSubTransporte() {
        return subTransporte;
    }

    public void setSubTransporte(int subTransporte) {
        this.subTransporte = subTransporte;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSubDeducido() {
        return subDeducido;
    }

    public void setSubDeducido(int subDeducido) {
        this.subDeducido = subDeducido;
    }

}
