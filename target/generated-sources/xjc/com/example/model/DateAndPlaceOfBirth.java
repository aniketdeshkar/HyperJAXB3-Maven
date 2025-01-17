//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 09:30:02 PM IST 
//


package com.example.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XMLGregorianCalendarAsDate;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XmlAdapterUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for DateAndPlaceOfBirth complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndPlaceOfBirth">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BirthDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}ISODate"/>
 *         &lt;element name="PrvcOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="CityOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}Max35Text"/>
 *         &lt;element name="CtryOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}CountryCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndPlaceOfBirth", propOrder = {
    "birthDt",
    "prvcOfBirth",
    "cityOfBirth",
    "ctryOfBirth"
})
@Entity(name = "DateAndPlaceOfBirth")
@Table(name = "DATEANDPLACEOFBIRTH")
@Inheritance(strategy = InheritanceType.JOINED)
public class DateAndPlaceOfBirth
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "BirthDt", required = true)
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "PrvcOfBirth")
    protected String prvcOfBirth;
    @XmlElement(name = "CityOfBirth", required = true)
    protected String cityOfBirth;
    @XmlElement(name = "CtryOfBirth", required = true)
    protected String ctryOfBirth;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the prvcOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PRVCOFBIRTH", length = 35)
    public String getPrvcOfBirth() {
        return prvcOfBirth;
    }

    /**
     * Sets the value of the prvcOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvcOfBirth(String value) {
        this.prvcOfBirth = value;
    }

    /**
     * Gets the value of the cityOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CITYOFBIRTH", length = 35)
    public String getCityOfBirth() {
        return cityOfBirth;
    }

    /**
     * Sets the value of the cityOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOfBirth(String value) {
        this.cityOfBirth = value;
    }

    /**
     * Gets the value of the ctryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CTRYOFBIRTH", length = 255)
    public String getCtryOfBirth() {
        return ctryOfBirth;
    }

    /**
     * Sets the value of the ctryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfBirth(String value) {
        this.ctryOfBirth = value;
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

    @Basic
    @Column(name = "BIRTHDTITEM")
    @Temporal(TemporalType.DATE)
    public Date getBirthDtItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDate.class, this.getBirthDt());
    }

    public void setBirthDtItem(Date target) {
        setBirthDt(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDate.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DateAndPlaceOfBirth)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DateAndPlaceOfBirth that = ((DateAndPlaceOfBirth) object);
        {
            XMLGregorianCalendar lhsBirthDt;
            lhsBirthDt = this.getBirthDt();
            XMLGregorianCalendar rhsBirthDt;
            rhsBirthDt = that.getBirthDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "birthDt", lhsBirthDt), LocatorUtils.property(thatLocator, "birthDt", rhsBirthDt), lhsBirthDt, rhsBirthDt)) {
                return false;
            }
        }
        {
            String lhsPrvcOfBirth;
            lhsPrvcOfBirth = this.getPrvcOfBirth();
            String rhsPrvcOfBirth;
            rhsPrvcOfBirth = that.getPrvcOfBirth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prvcOfBirth", lhsPrvcOfBirth), LocatorUtils.property(thatLocator, "prvcOfBirth", rhsPrvcOfBirth), lhsPrvcOfBirth, rhsPrvcOfBirth)) {
                return false;
            }
        }
        {
            String lhsCityOfBirth;
            lhsCityOfBirth = this.getCityOfBirth();
            String rhsCityOfBirth;
            rhsCityOfBirth = that.getCityOfBirth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cityOfBirth", lhsCityOfBirth), LocatorUtils.property(thatLocator, "cityOfBirth", rhsCityOfBirth), lhsCityOfBirth, rhsCityOfBirth)) {
                return false;
            }
        }
        {
            String lhsCtryOfBirth;
            lhsCtryOfBirth = this.getCtryOfBirth();
            String rhsCtryOfBirth;
            rhsCtryOfBirth = that.getCtryOfBirth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ctryOfBirth", lhsCtryOfBirth), LocatorUtils.property(thatLocator, "ctryOfBirth", rhsCtryOfBirth), lhsCtryOfBirth, rhsCtryOfBirth)) {
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
            XMLGregorianCalendar theBirthDt;
            theBirthDt = this.getBirthDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "birthDt", theBirthDt), currentHashCode, theBirthDt);
        }
        {
            String thePrvcOfBirth;
            thePrvcOfBirth = this.getPrvcOfBirth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prvcOfBirth", thePrvcOfBirth), currentHashCode, thePrvcOfBirth);
        }
        {
            String theCityOfBirth;
            theCityOfBirth = this.getCityOfBirth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cityOfBirth", theCityOfBirth), currentHashCode, theCityOfBirth);
        }
        {
            String theCtryOfBirth;
            theCtryOfBirth = this.getCtryOfBirth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ctryOfBirth", theCtryOfBirth), currentHashCode, theCtryOfBirth);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
