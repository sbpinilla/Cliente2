
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Punto5CalcularPrecioBillete complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Punto5CalcularPrecioBillete"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numKilometros" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numDiasF" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Punto5CalcularPrecioBillete", propOrder = {
    "numKilometros",
    "numDiasF"
})
public class Punto5CalcularPrecioBillete {

    protected int numKilometros;
    protected int numDiasF;

    /**
     * Obtiene el valor de la propiedad numKilometros.
     * 
     */
    public int getNumKilometros() {
        return numKilometros;
    }

    /**
     * Define el valor de la propiedad numKilometros.
     * 
     */
    public void setNumKilometros(int value) {
        this.numKilometros = value;
    }

    /**
     * Obtiene el valor de la propiedad numDiasF.
     * 
     */
    public int getNumDiasF() {
        return numDiasF;
    }

    /**
     * Define el valor de la propiedad numDiasF.
     * 
     */
    public void setNumDiasF(int value) {
        this.numDiasF = value;
    }

}
