
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Punto3CalcularCDS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Punto3CalcularCDS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numGb" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Punto3CalcularCDS", propOrder = {
    "numGb"
})
public class Punto3CalcularCDS {

    protected int numGb;

    /**
     * Obtiene el valor de la propiedad numGb.
     * 
     */
    public int getNumGb() {
        return numGb;
    }

    /**
     * Define el valor de la propiedad numGb.
     * 
     */
    public void setNumGb(int value) {
        this.numGb = value;
    }

}
