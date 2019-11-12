
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Punto2CalcularPuntaje complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Punto2CalcularPuntaje"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numPreguntasB" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numPreguntasC" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numPreguntasI" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Punto2CalcularPuntaje", propOrder = {
    "numPreguntasB",
    "numPreguntasC",
    "numPreguntasI"
})
public class Punto2CalcularPuntaje {

    protected int numPreguntasB;
    protected int numPreguntasC;
    protected int numPreguntasI;

    /**
     * Obtiene el valor de la propiedad numPreguntasB.
     * 
     */
    public int getNumPreguntasB() {
        return numPreguntasB;
    }

    /**
     * Define el valor de la propiedad numPreguntasB.
     * 
     */
    public void setNumPreguntasB(int value) {
        this.numPreguntasB = value;
    }

    /**
     * Obtiene el valor de la propiedad numPreguntasC.
     * 
     */
    public int getNumPreguntasC() {
        return numPreguntasC;
    }

    /**
     * Define el valor de la propiedad numPreguntasC.
     * 
     */
    public void setNumPreguntasC(int value) {
        this.numPreguntasC = value;
    }

    /**
     * Obtiene el valor de la propiedad numPreguntasI.
     * 
     */
    public int getNumPreguntasI() {
        return numPreguntasI;
    }

    /**
     * Define el valor de la propiedad numPreguntasI.
     * 
     */
    public void setNumPreguntasI(int value) {
        this.numPreguntasI = value;
    }

}
