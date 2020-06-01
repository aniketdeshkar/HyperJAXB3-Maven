//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 02:41:38 PM IST 
//


package com.example.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * <p>Java class for PartyIdentificationSEPA2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentificationSEPA2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}Max70Text"/>
 *         &lt;element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}PostalAddressSEPA" minOccurs="0"/>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}PartySEPAChoice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationSEPA2", propOrder = {
    "nm",
    "pstlAdr",
    "id"
})
@Entity(name = "PartyIdentificationSEPA2")
@Table(name = "PARTYIDENTIFICATIONSEPA2")
@Inheritance(strategy = InheritanceType.JOINED)
public class PartyIdentificationSEPA2
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "PstlAdr")
    protected PostalAddressSEPA pstlAdr;
    @XmlElement(name = "Id")
    protected PartySEPAChoice id;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NM", length = 70)
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressSEPA }
     *     
     */
    @ManyToOne(targetEntity = PostalAddressSEPA.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PSTLADR_PARTYIDENTIFICATIONS_0")
    public PostalAddressSEPA getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressSEPA }
     *     
     */
    public void setPstlAdr(PostalAddressSEPA value) {
        this.pstlAdr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartySEPAChoice }
     *     
     */
    @ManyToOne(targetEntity = PartySEPAChoice.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ID_PARTYIDENTIFICATIONSEPA2__0")
    public PartySEPAChoice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartySEPAChoice }
     *     
     */
    public void setId(PartySEPAChoice value) {
        this.id = value;
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
        if (!(object instanceof PartyIdentificationSEPA2)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PartyIdentificationSEPA2 that = ((PartyIdentificationSEPA2) object);
        {
            String lhsNm;
            lhsNm = this.getNm();
            String rhsNm;
            rhsNm = that.getNm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nm", lhsNm), LocatorUtils.property(thatLocator, "nm", rhsNm), lhsNm, rhsNm)) {
                return false;
            }
        }
        {
            PostalAddressSEPA lhsPstlAdr;
            lhsPstlAdr = this.getPstlAdr();
            PostalAddressSEPA rhsPstlAdr;
            rhsPstlAdr = that.getPstlAdr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pstlAdr", lhsPstlAdr), LocatorUtils.property(thatLocator, "pstlAdr", rhsPstlAdr), lhsPstlAdr, rhsPstlAdr)) {
                return false;
            }
        }
        {
            PartySEPAChoice lhsId;
            lhsId = this.getId();
            PartySEPAChoice rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
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
            String theNm;
            theNm = this.getNm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nm", theNm), currentHashCode, theNm);
        }
        {
            PostalAddressSEPA thePstlAdr;
            thePstlAdr = this.getPstlAdr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pstlAdr", thePstlAdr), currentHashCode, thePstlAdr);
        }
        {
            PartySEPAChoice theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}