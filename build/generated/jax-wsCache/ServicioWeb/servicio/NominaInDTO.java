
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nominaInDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nominaInDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaExtDiurna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaExtFestivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaExtNocturna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nominaInDTO", propOrder = {
    "cedula",
    "dias",
    "horaExtDiurna",
    "horaExtFestivo",
    "horaExtNocturna",
    "nombre",
    "salario"
})
public class NominaInDTO {

    protected String cedula;
    protected String dias;
    protected String horaExtDiurna;
    protected String horaExtFestivo;
    protected String horaExtNocturna;
    protected String nombre;
    protected String salario;

    /**
     * Obtiene el valor de la propiedad cedula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Define el valor de la propiedad cedula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedula(String value) {
        this.cedula = value;
    }

    /**
     * Obtiene el valor de la propiedad dias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDias() {
        return dias;
    }

    /**
     * Define el valor de la propiedad dias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDias(String value) {
        this.dias = value;
    }

    /**
     * Obtiene el valor de la propiedad horaExtDiurna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraExtDiurna() {
        return horaExtDiurna;
    }

    /**
     * Define el valor de la propiedad horaExtDiurna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraExtDiurna(String value) {
        this.horaExtDiurna = value;
    }

    /**
     * Obtiene el valor de la propiedad horaExtFestivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraExtFestivo() {
        return horaExtFestivo;
    }

    /**
     * Define el valor de la propiedad horaExtFestivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraExtFestivo(String value) {
        this.horaExtFestivo = value;
    }

    /**
     * Obtiene el valor de la propiedad horaExtNocturna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraExtNocturna() {
        return horaExtNocturna;
    }

    /**
     * Define el valor de la propiedad horaExtNocturna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraExtNocturna(String value) {
        this.horaExtNocturna = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad salario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalario() {
        return salario;
    }

    /**
     * Define el valor de la propiedad salario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalario(String value) {
        this.salario = value;
    }

}
