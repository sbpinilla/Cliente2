
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Punto1FormulaCuatro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Punto1FormulaCuatro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemM" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="itemN" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="itemP" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="itemQ" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="itemR" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Punto1FormulaCuatro", propOrder = {
    "itemM",
    "itemN",
    "itemP",
    "itemQ",
    "itemR"
})
public class Punto1FormulaCuatro {

    protected int itemM;
    protected int itemN;
    protected int itemP;
    protected int itemQ;
    protected int itemR;

    /**
     * Obtiene el valor de la propiedad itemM.
     * 
     */
    public int getItemM() {
        return itemM;
    }

    /**
     * Define el valor de la propiedad itemM.
     * 
     */
    public void setItemM(int value) {
        this.itemM = value;
    }

    /**
     * Obtiene el valor de la propiedad itemN.
     * 
     */
    public int getItemN() {
        return itemN;
    }

    /**
     * Define el valor de la propiedad itemN.
     * 
     */
    public void setItemN(int value) {
        this.itemN = value;
    }

    /**
     * Obtiene el valor de la propiedad itemP.
     * 
     */
    public int getItemP() {
        return itemP;
    }

    /**
     * Define el valor de la propiedad itemP.
     * 
     */
    public void setItemP(int value) {
        this.itemP = value;
    }

    /**
     * Obtiene el valor de la propiedad itemQ.
     * 
     */
    public int getItemQ() {
        return itemQ;
    }

    /**
     * Define el valor de la propiedad itemQ.
     * 
     */
    public void setItemQ(int value) {
        this.itemQ = value;
    }

    /**
     * Obtiene el valor de la propiedad itemR.
     * 
     */
    public int getItemR() {
        return itemR;
    }

    /**
     * Define el valor de la propiedad itemR.
     * 
     */
    public void setItemR(int value) {
        this.itemR = value;
    }

}
