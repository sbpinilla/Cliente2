
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Punto8CalcularNomina complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Punto8CalcularNomina"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nominaInDTO" type="{http://paqueteservicio/}nominaInDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Punto8CalcularNomina", propOrder = {
    "nominaInDTO"
})
public class Punto8CalcularNomina {

    protected NominaInDTO nominaInDTO;

    /**
     * Obtiene el valor de la propiedad nominaInDTO.
     * 
     * @return
     *     possible object is
     *     {@link NominaInDTO }
     *     
     */
    public NominaInDTO getNominaInDTO() {
        return nominaInDTO;
    }

    /**
     * Define el valor de la propiedad nominaInDTO.
     * 
     * @param value
     *     allowed object is
     *     {@link NominaInDTO }
     *     
     */
    public void setNominaInDTO(NominaInDTO value) {
        this.nominaInDTO = value;
    }

}
