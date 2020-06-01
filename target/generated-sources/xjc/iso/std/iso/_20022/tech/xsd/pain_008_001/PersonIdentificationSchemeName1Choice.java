//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 02:41:38 PM IST 
//


package iso.std.iso._20022.tech.xsd.pain_008_001;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for PersonIdentificationSchemeName1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonIdentificationSchemeName1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}ExternalPersonIdentification1Code"/>
 *           &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max35Text"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentificationSchemeName1Choice", propOrder = {
    "prtry",
    "cd"
})
@Entity(name = "PersonIdentificationSchemeName1Choice")
@Table(name = "PERSONIDENTIFICATIONSCHEMENA_2")
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonIdentificationSchemeName1Choice
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "Prtry")
    protected String prtry;
    @XmlElement(name = "Cd")
    protected String cd;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PRTRY", length = 35)
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtry(String value) {
        this.prtry = value;
    }

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CD", length = 4)
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PersonIdentificationSchemeName1Choice)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PersonIdentificationSchemeName1Choice that = ((PersonIdentificationSchemeName1Choice) object);
        {
            String lhsPrtry;
            lhsPrtry = this.getPrtry();
            String rhsPrtry;
            rhsPrtry = that.getPrtry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prtry", lhsPrtry), LocatorUtils.property(thatLocator, "prtry", rhsPrtry), lhsPrtry, rhsPrtry)) {
                return false;
            }
        }
        {
            String lhsCd;
            lhsCd = this.getCd();
            String rhsCd;
            rhsCd = that.getCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cd", lhsCd), LocatorUtils.property(thatLocator, "cd", rhsCd), lhsCd, rhsCd)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String thePrtry;
            thePrtry = this.getPrtry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prtry", thePrtry), currentHashCode, thePrtry);
        }
        {
            String theCd;
            theCd = this.getCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cd", theCd), currentHashCode, theCd);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
