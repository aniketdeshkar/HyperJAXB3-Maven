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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
 * <p>Java class for PaymentTypeInformationSDD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeInformationSDD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SvcLvl" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}ServiceLevelSEPA"/>
 *         &lt;element name="LclInstrm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}LocalInstrumentSEPA"/>
 *         &lt;element name="SeqTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}SequenceType1Code"/>
 *         &lt;element name="CtgyPurp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}CategoryPurposeSEPA" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeInformationSDD", propOrder = {
    "svcLvl",
    "lclInstrm",
    "seqTp",
    "ctgyPurp"
})
@Entity(name = "PaymentTypeInformationSDD")
@Table(name = "PAYMENTTYPEINFORMATIONSDD")
@Inheritance(strategy = InheritanceType.JOINED)
public class PaymentTypeInformationSDD
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "SvcLvl", required = true)
    protected ServiceLevelSEPA svcLvl;
    @XmlElement(name = "LclInstrm", required = true)
    protected LocalInstrumentSEPA lclInstrm;
    @XmlElement(name = "SeqTp", required = true)
    protected SequenceType1Code seqTp;
    @XmlElement(name = "CtgyPurp")
    protected CategoryPurposeSEPA ctgyPurp;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the svcLvl property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevelSEPA }
     *     
     */
    @ManyToOne(targetEntity = ServiceLevelSEPA.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SVCLVL_PAYMENTTYPEINFORMATIO_1")
    public ServiceLevelSEPA getSvcLvl() {
        return svcLvl;
    }

    /**
     * Sets the value of the svcLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevelSEPA }
     *     
     */
    public void setSvcLvl(ServiceLevelSEPA value) {
        this.svcLvl = value;
    }

    /**
     * Gets the value of the lclInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link LocalInstrumentSEPA }
     *     
     */
    @ManyToOne(targetEntity = LocalInstrumentSEPA.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LCLINSTRM_PAYMENTTYPEINFORMA_1")
    public LocalInstrumentSEPA getLclInstrm() {
        return lclInstrm;
    }

    /**
     * Sets the value of the lclInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalInstrumentSEPA }
     *     
     */
    public void setLclInstrm(LocalInstrumentSEPA value) {
        this.lclInstrm = value;
    }

    /**
     * Gets the value of the seqTp property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceType1Code }
     *     
     */
    @Basic
    @Column(name = "SEQTP", length = 255)
    @Enumerated(EnumType.STRING)
    public SequenceType1Code getSeqTp() {
        return seqTp;
    }

    /**
     * Sets the value of the seqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType1Code }
     *     
     */
    public void setSeqTp(SequenceType1Code value) {
        this.seqTp = value;
    }

    /**
     * Gets the value of the ctgyPurp property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryPurposeSEPA }
     *     
     */
    @ManyToOne(targetEntity = CategoryPurposeSEPA.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CTGYPURP_PAYMENTTYPEINFORMAT_1")
    public CategoryPurposeSEPA getCtgyPurp() {
        return ctgyPurp;
    }

    /**
     * Sets the value of the ctgyPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryPurposeSEPA }
     *     
     */
    public void setCtgyPurp(CategoryPurposeSEPA value) {
        this.ctgyPurp = value;
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
        if (!(object instanceof PaymentTypeInformationSDD)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PaymentTypeInformationSDD that = ((PaymentTypeInformationSDD) object);
        {
            ServiceLevelSEPA lhsSvcLvl;
            lhsSvcLvl = this.getSvcLvl();
            ServiceLevelSEPA rhsSvcLvl;
            rhsSvcLvl = that.getSvcLvl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "svcLvl", lhsSvcLvl), LocatorUtils.property(thatLocator, "svcLvl", rhsSvcLvl), lhsSvcLvl, rhsSvcLvl)) {
                return false;
            }
        }
        {
            LocalInstrumentSEPA lhsLclInstrm;
            lhsLclInstrm = this.getLclInstrm();
            LocalInstrumentSEPA rhsLclInstrm;
            rhsLclInstrm = that.getLclInstrm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lclInstrm", lhsLclInstrm), LocatorUtils.property(thatLocator, "lclInstrm", rhsLclInstrm), lhsLclInstrm, rhsLclInstrm)) {
                return false;
            }
        }
        {
            SequenceType1Code lhsSeqTp;
            lhsSeqTp = this.getSeqTp();
            SequenceType1Code rhsSeqTp;
            rhsSeqTp = that.getSeqTp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seqTp", lhsSeqTp), LocatorUtils.property(thatLocator, "seqTp", rhsSeqTp), lhsSeqTp, rhsSeqTp)) {
                return false;
            }
        }
        {
            CategoryPurposeSEPA lhsCtgyPurp;
            lhsCtgyPurp = this.getCtgyPurp();
            CategoryPurposeSEPA rhsCtgyPurp;
            rhsCtgyPurp = that.getCtgyPurp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ctgyPurp", lhsCtgyPurp), LocatorUtils.property(thatLocator, "ctgyPurp", rhsCtgyPurp), lhsCtgyPurp, rhsCtgyPurp)) {
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
            ServiceLevelSEPA theSvcLvl;
            theSvcLvl = this.getSvcLvl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "svcLvl", theSvcLvl), currentHashCode, theSvcLvl);
        }
        {
            LocalInstrumentSEPA theLclInstrm;
            theLclInstrm = this.getLclInstrm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lclInstrm", theLclInstrm), currentHashCode, theLclInstrm);
        }
        {
            SequenceType1Code theSeqTp;
            theSeqTp = this.getSeqTp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seqTp", theSeqTp), currentHashCode, theSeqTp);
        }
        {
            CategoryPurposeSEPA theCtgyPurp;
            theCtgyPurp = this.getCtgyPurp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ctgyPurp", theCtgyPurp), currentHashCode, theCtgyPurp);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
