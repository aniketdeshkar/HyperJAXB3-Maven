//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 02:41:38 PM IST 
//


package com.example.model;

import java.io.Serializable;
import java.util.Date;
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
 * <p>Java class for MandateRelatedInformationSDD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MandateRelatedInformationSDD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MndtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}RestrictedIdentificationSEPA2"/>
 *         &lt;element name="DtOfSgntr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}ISODate"/>
 *         &lt;element name="AmdmntInd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}TrueFalseIndicator" minOccurs="0"/>
 *         &lt;element name="AmdmntInfDtls" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}AmendmentInformationDetailsSDD" minOccurs="0"/>
 *         &lt;element name="ElctrncSgntr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}Max1025Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateRelatedInformationSDD", propOrder = {
    "mndtId",
    "dtOfSgntr",
    "amdmntInd",
    "amdmntInfDtls",
    "elctrncSgntr"
})
@Entity(name = "MandateRelatedInformationSDD")
@Table(name = "MANDATERELATEDINFORMATIONSDD")
@Inheritance(strategy = InheritanceType.JOINED)
public class MandateRelatedInformationSDD
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "MndtId", required = true)
    protected String mndtId;
    @XmlElement(name = "DtOfSgntr", required = true)
    protected XMLGregorianCalendar dtOfSgntr;
    @XmlElement(name = "AmdmntInd")
    protected Boolean amdmntInd;
    @XmlElement(name = "AmdmntInfDtls")
    protected AmendmentInformationDetailsSDD amdmntInfDtls;
    @XmlElement(name = "ElctrncSgntr")
    protected String elctrncSgntr;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the mndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MNDTID", length = 255)
    public String getMndtId() {
        return mndtId;
    }

    /**
     * Sets the value of the mndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMndtId(String value) {
        this.mndtId = value;
    }

    /**
     * Gets the value of the dtOfSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getDtOfSgntr() {
        return dtOfSgntr;
    }

    /**
     * Sets the value of the dtOfSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtOfSgntr(XMLGregorianCalendar value) {
        this.dtOfSgntr = value;
    }

    /**
     * Gets the value of the amdmntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Basic
    @Column(name = "AMDMNTIND")
    public Boolean isAmdmntInd() {
        return amdmntInd;
    }

    /**
     * Sets the value of the amdmntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAmdmntInd(Boolean value) {
        this.amdmntInd = value;
    }

    /**
     * Gets the value of the amdmntInfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentInformationDetailsSDD }
     *     
     */
    @ManyToOne(targetEntity = AmendmentInformationDetailsSDD.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AMDMNTINFDTLS_MANDATERELATED_0")
    public AmendmentInformationDetailsSDD getAmdmntInfDtls() {
        return amdmntInfDtls;
    }

    /**
     * Sets the value of the amdmntInfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentInformationDetailsSDD }
     *     
     */
    public void setAmdmntInfDtls(AmendmentInformationDetailsSDD value) {
        this.amdmntInfDtls = value;
    }

    /**
     * Gets the value of the elctrncSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ELCTRNCSGNTR", length = 1025)
    public String getElctrncSgntr() {
        return elctrncSgntr;
    }

    /**
     * Sets the value of the elctrncSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElctrncSgntr(String value) {
        this.elctrncSgntr = value;
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
    @Column(name = "DTOFSGNTRITEM")
    @Temporal(TemporalType.DATE)
    public Date getDtOfSgntrItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDate.class, this.getDtOfSgntr());
    }

    public void setDtOfSgntrItem(Date target) {
        setDtOfSgntr(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDate.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MandateRelatedInformationSDD)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MandateRelatedInformationSDD that = ((MandateRelatedInformationSDD) object);
        {
            String lhsMndtId;
            lhsMndtId = this.getMndtId();
            String rhsMndtId;
            rhsMndtId = that.getMndtId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mndtId", lhsMndtId), LocatorUtils.property(thatLocator, "mndtId", rhsMndtId), lhsMndtId, rhsMndtId)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsDtOfSgntr;
            lhsDtOfSgntr = this.getDtOfSgntr();
            XMLGregorianCalendar rhsDtOfSgntr;
            rhsDtOfSgntr = that.getDtOfSgntr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dtOfSgntr", lhsDtOfSgntr), LocatorUtils.property(thatLocator, "dtOfSgntr", rhsDtOfSgntr), lhsDtOfSgntr, rhsDtOfSgntr)) {
                return false;
            }
        }
        {
            Boolean lhsAmdmntInd;
            lhsAmdmntInd = this.isAmdmntInd();
            Boolean rhsAmdmntInd;
            rhsAmdmntInd = that.isAmdmntInd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amdmntInd", lhsAmdmntInd), LocatorUtils.property(thatLocator, "amdmntInd", rhsAmdmntInd), lhsAmdmntInd, rhsAmdmntInd)) {
                return false;
            }
        }
        {
            AmendmentInformationDetailsSDD lhsAmdmntInfDtls;
            lhsAmdmntInfDtls = this.getAmdmntInfDtls();
            AmendmentInformationDetailsSDD rhsAmdmntInfDtls;
            rhsAmdmntInfDtls = that.getAmdmntInfDtls();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amdmntInfDtls", lhsAmdmntInfDtls), LocatorUtils.property(thatLocator, "amdmntInfDtls", rhsAmdmntInfDtls), lhsAmdmntInfDtls, rhsAmdmntInfDtls)) {
                return false;
            }
        }
        {
            String lhsElctrncSgntr;
            lhsElctrncSgntr = this.getElctrncSgntr();
            String rhsElctrncSgntr;
            rhsElctrncSgntr = that.getElctrncSgntr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "elctrncSgntr", lhsElctrncSgntr), LocatorUtils.property(thatLocator, "elctrncSgntr", rhsElctrncSgntr), lhsElctrncSgntr, rhsElctrncSgntr)) {
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
            String theMndtId;
            theMndtId = this.getMndtId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mndtId", theMndtId), currentHashCode, theMndtId);
        }
        {
            XMLGregorianCalendar theDtOfSgntr;
            theDtOfSgntr = this.getDtOfSgntr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dtOfSgntr", theDtOfSgntr), currentHashCode, theDtOfSgntr);
        }
        {
            Boolean theAmdmntInd;
            theAmdmntInd = this.isAmdmntInd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amdmntInd", theAmdmntInd), currentHashCode, theAmdmntInd);
        }
        {
            AmendmentInformationDetailsSDD theAmdmntInfDtls;
            theAmdmntInfDtls = this.getAmdmntInfDtls();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amdmntInfDtls", theAmdmntInfDtls), currentHashCode, theAmdmntInfDtls);
        }
        {
            String theElctrncSgntr;
            theElctrncSgntr = this.getElctrncSgntr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "elctrncSgntr", theElctrncSgntr), currentHashCode, theElctrncSgntr);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}