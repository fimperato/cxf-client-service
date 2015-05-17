
package companyinfo.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="tickerSymbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "getCompanyInfo")
public class GetCompanyInfo {

    @XmlElement(required = true)
    protected String tickerSymbol;

    /**
     * Recupera il valore della proprietà tickerSymbol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTickerSymbol() {
        return tickerSymbol;
    }

    /**
     * Imposta il valore della proprietà tickerSymbol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTickerSymbol(String value) {
        this.tickerSymbol = value;
    }

}
