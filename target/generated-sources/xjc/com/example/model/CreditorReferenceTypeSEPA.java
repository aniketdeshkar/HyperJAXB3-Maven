//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 09:30:02 PM IST 
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
 * <p>Java class for CreditorReferenceTypeSEPA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditorReferenceTypeSEPA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CdOrPrtry" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}CreditorReferenceTypeCodeSEPA"/>
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorReferenceTypeSEPA", propOrder = {
    "cdOrPrtry",
    "issr"
})
@Entity(name = "CreditorReferenceTypeSEPA")
@Table(name = "CREDITORREFERENCETYPESEPA")
@Inheritance(strategy = InheritanceType.JOINED)
public class CreditorReferenceTypeSEPA
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "CdOrPrtry", required = true)
    protected CreditorReferenceTypeCodeSEPA cdOrPrtry;
    @XmlElement(name = "Issr")
    protected String issr;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the cdOrPrtry property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceTypeCodeSEPA }
     *     
     */
    @ManyToOne(targetEntity = CreditorReferenceTypeCodeSEPA.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CDORPRTRY_CREDITORREFERENCET_0")
    public CreditorReferenceTypeCodeSEPA getCdOrPrtry() {
        return cdOrPrtry;
    }

    /**
     * Sets the value of the cdOrPrtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceTypeCodeSEPA }
     *     
     */
    public void setCdOrPrtry(CreditorReferenceTypeCodeSEPA value) {
        this.cdOrPrtry = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ISSR", length = 35)
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssr(String value) {
        this.issr = value;
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
        if (!(object instanceof CreditorReferenceTypeSEPA)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreditorReferenceTypeSEPA that = ((CreditorReferenceTypeSEPA) object);
        {
            CreditorReferenceTypeCodeSEPA lhsCdOrPrtry;
            lhsCdOrPrtry = this.getCdOrPrtry();
            CreditorReferenceTypeCodeSEPA rhsCdOrPrtry;
            rhsCdOrPrtry = that.getCdOrPrtry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cdOrPrtry", lhsCdOrPrtry), LocatorUtils.property(thatLocator, "cdOrPrtry", rhsCdOrPrtry), lhsCdOrPrtry, rhsCdOrPrtry)) {
                return false;
            }
        }
        {
            String lhsIssr;
            lhsIssr = this.getIssr();
            String rhsIssr;
            rhsIssr = that.getIssr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issr", lhsIssr), LocatorUtils.property(thatLocator, "issr", rhsIssr), lhsIssr, rhsIssr)) {
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
            CreditorReferenceTypeCodeSEPA theCdOrPrtry;
            theCdOrPrtry = this.getCdOrPrtry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cdOrPrtry", theCdOrPrtry), currentHashCode, theCdOrPrtry);
        }
        {
            String theIssr;
            theIssr = this.getIssr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issr", theIssr), currentHashCode, theIssr);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
