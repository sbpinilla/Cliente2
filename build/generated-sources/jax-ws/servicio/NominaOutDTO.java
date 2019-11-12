
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nominaOutDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nominaOutDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resHoraExtDiurna" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="resHoraExtFestivo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="resHoraExtNocturna" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="resSalario" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="subDeducido" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="subTransporte" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nominaOutDTO", propOrder = {
    "resHoraExtDiurna",
    "resHoraExtFestivo",
    "resHoraExtNocturna",
    "resSalario",
    "subDeducido",
    "subTransporte",
    "total"
})
public class NominaOutDTO {

    protected int resHoraExtDiurna;
    protected int resHoraExtFestivo;
    protected int resHoraExtNocturna;
    protected int resSalario;
    protected int subDeducido;
    protected int subTransporte;
    protected int total;

    /**
     * Obtiene el valor de la propiedad resHoraExtDiurna.
     * 
     */
    public int getResHoraExtDiurna() {
        return resHoraExtDiurna;
    }

    /**
     * Define el valor de la propiedad resHoraExtDiurna.
     * 
     */
    public void setResHoraExtDiurna(int value) {
        this.resHoraExtDiurna = value;
    }

    /**
     * Obtiene el valor de la propiedad resHoraExtFestivo.
     * 
     */
    public int getResHoraExtFestivo() {
        return resHoraExtFestivo;
    }

    /**
     * Define el valor de la propiedad resHoraExtFestivo.
     * 
     */
    public void setResHoraExtFestivo(int value) {
        this.resHoraExtFestivo = value;
    }

    /**
     * Obtiene el valor de la propiedad resHoraExtNocturna.
     * 
     */
    public int getResHoraExtNocturna() {
        return resHoraExtNocturna;
    }

    /**
     * Define el valor de la propiedad resHoraExtNocturna.
     * 
     */
    public void setResHoraExtNocturna(int value) {
        this.resHoraExtNocturna = value;
    }

    /**
     * Obtiene el valor de la propiedad resSalario.
     * 
     */
    public int getResSalario() {
        return resSalario;
    }

    /**
     * Define el valor de la propiedad resSalario.
     * 
     */
    public void setResSalario(int value) {
        this.resSalario = value;
    }

    /**
     * Obtiene el valor de la propiedad subDeducido.
     * 
     */
    public int getSubDeducido() {
        return subDeducido;
    }

    /**
     * Define el valor de la propiedad subDeducido.
     * 
     */
    public void setSubDeducido(int value) {
        this.subDeducido = value;
    }

    /**
     * Obtiene el valor de la propiedad subTransporte.
     * 
     */
    public int getSubTransporte() {
        return subTransporte;
    }

    /**
     * Define el valor de la propiedad subTransporte.
     * 
     */
    public void setSubTransporte(int value) {
        this.subTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

}
