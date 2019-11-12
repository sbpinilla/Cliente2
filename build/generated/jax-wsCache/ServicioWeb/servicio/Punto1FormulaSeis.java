
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Punto1FormulaSeis complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Punto1FormulaSeis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemB" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="itemA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="itemC" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Punto1FormulaSeis", propOrder = {
    "itemB",
    "itemA",
    "itemC"
})
public class Punto1FormulaSeis {

    protected int itemB;
    protected int itemA;
    protected int itemC;

    /**
     * Obtiene el valor de la propiedad itemB.
     * 
     */
    public int getItemB() {
        return itemB;
    }

    /**
     * Define el valor de la propiedad itemB.
     * 
     */
    public void setItemB(int value) {
        this.itemB = value;
    }

    /**
     * Obtiene el valor de la propiedad itemA.
     * 
     */
    public int getItemA() {
        return itemA;
    }

    /**
     * Define el valor de la propiedad itemA.
     * 
     */
    public void setItemA(int value) {
        this.itemA = value;
    }

    /**
     * Obtiene el valor de la propiedad itemC.
     * 
     */
    public int getItemC() {
        return itemC;
    }

    /**
     * Define el valor de la propiedad itemC.
     * 
     */
    public void setItemC(int value) {
        this.itemC = value;
    }

}
