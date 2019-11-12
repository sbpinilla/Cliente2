
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Punto7CalcularMCD complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Punto7CalcularMCD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numUno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numDos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Punto7CalcularMCD", propOrder = {
    "numUno",
    "numDos"
})
public class Punto7CalcularMCD {

    protected int numUno;
    protected int numDos;

    /**
     * Obtiene el valor de la propiedad numUno.
     * 
     */
    public int getNumUno() {
        return numUno;
    }

    /**
     * Define el valor de la propiedad numUno.
     * 
     */
    public void setNumUno(int value) {
        this.numUno = value;
    }

    /**
     * Obtiene el valor de la propiedad numDos.
     * 
     */
    public int getNumDos() {
        return numDos;
    }

    /**
     * Define el valor de la propiedad numDos.
     * 
     */
    public void setNumDos(int value) {
        this.numDos = value;
    }

}
