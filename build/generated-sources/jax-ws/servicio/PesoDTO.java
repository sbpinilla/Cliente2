
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pesoDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pesoDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numB" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numC" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numD" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesoDTO", propOrder = {
    "numA",
    "numB",
    "numC",
    "numD"
})
public class PesoDTO {

    protected int numA;
    protected int numB;
    protected int numC;
    protected int numD;

    /**
     * Obtiene el valor de la propiedad numA.
     * 
     */
    public int getNumA() {
        return numA;
    }

    /**
     * Define el valor de la propiedad numA.
     * 
     */
    public void setNumA(int value) {
        this.numA = value;
    }

    /**
     * Obtiene el valor de la propiedad numB.
     * 
     */
    public int getNumB() {
        return numB;
    }

    /**
     * Define el valor de la propiedad numB.
     * 
     */
    public void setNumB(int value) {
        this.numB = value;
    }

    /**
     * Obtiene el valor de la propiedad numC.
     * 
     */
    public int getNumC() {
        return numC;
    }

    /**
     * Define el valor de la propiedad numC.
     * 
     */
    public void setNumC(int value) {
        this.numC = value;
    }

    /**
     * Obtiene el valor de la propiedad numD.
     * 
     */
    public int getNumD() {
        return numD;
    }

    /**
     * Define el valor de la propiedad numD.
     * 
     */
    public void setNumD(int value) {
        this.numD = value;
    }

}
