/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.xml.ws.WebServiceRef;
import servicio.ServicioWeb;
import servicio.ServicioWeb_Service;


/**
 *
 * @author sbpinilla
 */
@ManagedBean(name = "clienteManagedBean")
@RequestScoped
public class ClienteManagedBean {

    
    String resultado = "DATOS";
    

    /**
     * Creates a new instance of ClienteManagedBean
     */
    public ClienteManagedBean() {

        
      
    }
    
    
        public void calcularFormulas() {

   resultado = suma(2, 4).toString();

    }

    private Integer suma(int numero1, int numero2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        
        ServicioWeb_Service web = new ServicioWeb_Service();
        ServicioWeb port = web.getServicioWebPort();
        
        return port.suma(numero1, numero2);
    }

    
    
    /* Get and Set */
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }  
    
}
