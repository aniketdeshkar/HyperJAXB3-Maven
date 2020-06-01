//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 02:41:38 PM IST 
//


package iso.std.iso._20022.tech.xsd.pain_008_001;

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
 * <p>Java class for PaymentTypeInformation20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeInformation20">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Priority2Code" minOccurs="0"/>
 *         &lt;element name="SvcLvl" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}ServiceLevel8Choice" minOccurs="0"/>
 *         &lt;element name="LclInstrm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}LocalInstrument2Choice" minOccurs="0"/>
 *         &lt;element name="SeqTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}SequenceType1Code" minOccurs="0"/>
 *         &lt;element name="CtgyPurp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}CategoryPurpose1Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeInformation20", propOrder = {
    "instrPrty",
    "svcLvl",
    "lclInstrm",
    "seqTp",
    "ctgyPurp"
})
@Entity(name = "PaymentTypeInformation20")
@Table(name = "PAYMENTTYPEINFORMATION20")
@Inheritance(strategy = InheritanceType.JOINED)
public class PaymentTypeInformation20
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "InstrPrty")
    protected Priority2Code instrPrty;
    @XmlElement(name = "SvcLvl")
    protected ServiceLevel8Choice svcLvl;
    @XmlElement(name = "LclInstrm")
    protected LocalInstrument2Choice lclInstrm;
    @XmlElement(name = "SeqTp")
    protected SequenceType1Code seqTp;
    @XmlElement(name = "CtgyPurp")
    protected CategoryPurpose1Choice ctgyPurp;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    @Basic
    @Column(name = "INSTRPRTY", length = 255)
    @Enumerated(EnumType.STRING)
    public Priority2Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Sets the value of the instrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public void setInstrPrty(Priority2Code value) {
        this.instrPrty = value;
    }

    /**
     * Gets the value of the svcLvl property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevel8Choice }
     *     
     */
    @ManyToOne(targetEntity = ServiceLevel8Choice.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SVCLVL_PAYMENTTYPEINFORMATIO_2")
    public ServiceLevel8Choice getSvcLvl() {
        return svcLvl;
    }

    /**
     * Sets the value of the svcLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevel8Choice }
     *     
     */
    public void setSvcLvl(ServiceLevel8Choice value) {
        this.svcLvl = value;
    }

    /**
     * Gets the value of the lclInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    @ManyToOne(targetEntity = LocalInstrument2Choice.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LCLINSTRM_PAYMENTTYPEINFORMA_2")
    public LocalInstrument2Choice getLclInstrm() {
        return lclInstrm;
    }

    /**
     * Sets the value of the lclInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public void setLclInstrm(LocalInstrument2Choice value) {
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
     *     {@link CategoryPurpose1Choice }
     *     
     */
    @ManyToOne(targetEntity = CategoryPurpose1Choice.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CTGYPURP_PAYMENTTYPEINFORMAT_2")
    public CategoryPurpose1Choice getCtgyPurp() {
        return ctgyPurp;
    }

    /**
     * Sets the value of the ctgyPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryPurpose1Choice }
     *     
     */
    public void setCtgyPurp(CategoryPurpose1Choice value) {
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
        if (!(object instanceof PaymentTypeInformation20)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PaymentTypeInformation20 that = ((PaymentTypeInformation20) object);
        {
            Priority2Code lhsInstrPrty;
            lhsInstrPrty = this.getInstrPrty();
            Priority2Code rhsInstrPrty;
            rhsInstrPrty = that.getInstrPrty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instrPrty", lhsInstrPrty), LocatorUtils.property(thatLocator, "instrPrty", rhsInstrPrty), lhsInstrPrty, rhsInstrPrty)) {
                return false;
            }
        }
        {
            ServiceLevel8Choice lhsSvcLvl;
            lhsSvcLvl = this.getSvcLvl();
            ServiceLevel8Choice rhsSvcLvl;
            rhsSvcLvl = that.getSvcLvl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "svcLvl", lhsSvcLvl), LocatorUtils.property(thatLocator, "svcLvl", rhsSvcLvl), lhsSvcLvl, rhsSvcLvl)) {
                return false;
            }
        }
        {
            LocalInstrument2Choice lhsLclInstrm;
            lhsLclInstrm = this.getLclInstrm();
            LocalInstrument2Choice rhsLclInstrm;
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
            CategoryPurpose1Choice lhsCtgyPurp;
            lhsCtgyPurp = this.getCtgyPurp();
            CategoryPurpose1Choice rhsCtgyPurp;
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
            Priority2Code theInstrPrty;
            theInstrPrty = this.getInstrPrty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrPrty", theInstrPrty), currentHashCode, theInstrPrty);
        }
        {
            ServiceLevel8Choice theSvcLvl;
            theSvcLvl = this.getSvcLvl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "svcLvl", theSvcLvl), currentHashCode, theSvcLvl);
        }
        {
            LocalInstrument2Choice theLclInstrm;
            theLclInstrm = this.getLclInstrm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lclInstrm", theLclInstrm), currentHashCode, theLclInstrm);
        }
        {
            SequenceType1Code theSeqTp;
            theSeqTp = this.getSeqTp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seqTp", theSeqTp), currentHashCode, theSeqTp);
        }
        {
            CategoryPurpose1Choice theCtgyPurp;
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