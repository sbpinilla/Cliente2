/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import servicio.ProductoDTO;
import servicio.ServicioWeb;
import servicio.ServicioWeb_Service;

/**
 *
 * @author sbpinilla
 */
@ManagedBean(name = "punto9ManagedBean")
@ViewScoped
public class Punto9ManagedBean implements Serializable{

    
    private String nombreProducto;
    private int valorProducto;
    private int cantidadProducto;
    
    private List<ProductoDTO> listProductos = new ArrayList<>();
    
     ServicioWeb port;

    @PostConstruct
    public void init() {

        ServicioWeb_Service web = new ServicioWeb_Service();
        port = web.getServicioWebPort();
    }

    
    
    /**
     * Creates a new instance of Punto9ManagedBean
     */
    public Punto9ManagedBean() {
    }
    
    public  void agregarProducto(){
        
        ProductoDTO producto = new ProductoDTO();
        
        producto.setNombreProducto(nombreProducto);
        producto.setValorProducto(valorProducto);
        producto.setCantidad(cantidadProducto);
        
        producto = port.punto9CalcularTotalProducto(producto);
               
        listProductos.add(producto);
        nombreProducto = "";
        valorProducto = 0;
        cantidadProducto = 0;
        
    }
    
    
    
    /* set and get */

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(int valorProducto) {
        this.valorProducto = valorProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public List<ProductoDTO> getListProductos() {
        return listProductos;
    }

    public void setListProductos(List<ProductoDTO> listProductos) {
        this.listProductos = listProductos;
    }
    
    
    
    
}
