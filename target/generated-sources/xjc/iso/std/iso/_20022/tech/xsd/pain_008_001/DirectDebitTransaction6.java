//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 02:41:38 PM IST 
//


package iso.std.iso._20022.tech.xsd.pain_008_001;

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
 * <p>Java class for DirectDebitTransaction6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectDebitTransaction6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MndtRltdInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}MandateRelatedInformation6" minOccurs="0"/>
 *         &lt;element name="CdtrSchmeId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}PartyIdentification32" minOccurs="0"/>
 *         &lt;element name="PreNtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="PreNtfctnDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}ISODate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitTransaction6", propOrder = {
    "mndtRltdInf",
    "cdtrSchmeId",
    "preNtfctnId",
    "preNtfctnDt"
})
@Entity(name = "DirectDebitTransaction6")
@Table(name = "DIRECTDEBITTRANSACTION6")
@Inheritance(strategy = InheritanceType.JOINED)
public class DirectDebitTransaction6
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "MndtRltdInf")
    protected MandateRelatedInformation6 mndtRltdInf;
    @XmlElement(name = "CdtrSchmeId")
    protected PartyIdentification32 cdtrSchmeId;
    @XmlElement(name = "PreNtfctnId")
    protected String preNtfctnId;
    @XmlElement(name = "PreNtfctnDt")
    protected XMLGregorianCalendar preNtfctnDt;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the mndtRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link MandateRelatedInformation6 }
     *     
     */
    @ManyToOne(targetEntity = MandateRelatedInformation6 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MNDTRLTDINF_DIRECTDEBITTRANS_1")
    public MandateRelatedInformation6 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * Sets the value of the mndtRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformation6 }
     *     
     */
    public void setMndtRltdInf(MandateRelatedInformation6 value) {
        this.mndtRltdInf = value;
    }

    /**
     * Gets the value of the cdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    @ManyToOne(targetEntity = PartyIdentification32 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CDTRSCHMEID_DIRECTDEBITTRANS_1")
    public PartyIdentification32 getCdtrSchmeId() {
        return cdtrSchmeId;
    }

    /**
     * Sets the value of the cdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public void setCdtrSchmeId(PartyIdentification32 value) {
        this.cdtrSchmeId = value;
    }

    /**
     * Gets the value of the preNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PRENTFCTNID", length = 35)
    public String getPreNtfctnId() {
        return preNtfctnId;
    }

    /**
     * Sets the value of the preNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreNtfctnId(String value) {
        this.preNtfctnId = value;
    }

    /**
     * Gets the value of the preNtfctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getPreNtfctnDt() {
        return preNtfctnDt;
    }

    /**
     * Sets the value of the preNtfctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreNtfctnDt(XMLGregorianCalendar value) {
        this.preNtfctnDt = value;
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
    @Column(name = "PRENTFCTNDTITEM")
    @Temporal(TemporalType.DATE)
    public Date getPreNtfctnDtItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDate.class, this.getPreNtfctnDt());
    }

    public void setPreNtfctnDtItem(Date target) {
        setPreNtfctnDt(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDate.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DirectDebitTransaction6)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DirectDebitTransaction6 that = ((DirectDebitTransaction6) object);
        {
            MandateRelatedInformation6 lhsMndtRltdInf;
            lhsMndtRltdInf = this.getMndtRltdInf();
            MandateRelatedInformation6 rhsMndtRltdInf;
            rhsMndtRltdInf = that.getMndtRltdInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mndtRltdInf", lhsMndtRltdInf), LocatorUtils.property(thatLocator, "mndtRltdInf", rhsMndtRltdInf), lhsMndtRltdInf, rhsMndtRltdInf)) {
                return false;
            }
        }
        {
            PartyIdentification32 lhsCdtrSchmeId;
            lhsCdtrSchmeId = this.getCdtrSchmeId();
            PartyIdentification32 rhsCdtrSchmeId;
            rhsCdtrSchmeId = that.getCdtrSchmeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cdtrSchmeId", lhsCdtrSchmeId), LocatorUtils.property(thatLocator, "cdtrSchmeId", rhsCdtrSchmeId), lhsCdtrSchmeId, rhsCdtrSchmeId)) {
                return false;
            }
        }
        {
            String lhsPreNtfctnId;
            lhsPreNtfctnId = this.getPreNtfctnId();
            String rhsPreNtfctnId;
            rhsPreNtfctnId = that.getPreNtfctnId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preNtfctnId", lhsPreNtfctnId), LocatorUtils.property(thatLocator, "preNtfctnId", rhsPreNtfctnId), lhsPreNtfctnId, rhsPreNtfctnId)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsPreNtfctnDt;
            lhsPreNtfctnDt = this.getPreNtfctnDt();
            XMLGregorianCalendar rhsPreNtfctnDt;
            rhsPreNtfctnDt = that.getPreNtfctnDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preNtfctnDt", lhsPreNtfctnDt), LocatorUtils.property(thatLocator, "preNtfctnDt", rhsPreNtfctnDt), lhsPreNtfctnDt, rhsPreNtfctnDt)) {
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
            MandateRelatedInformation6 theMndtRltdInf;
            theMndtRltdInf = this.getMndtRltdInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mndtRltdInf", theMndtRltdInf), currentHashCode, theMndtRltdInf);
        }
        {
            PartyIdentification32 theCdtrSchmeId;
            theCdtrSchmeId = this.getCdtrSchmeId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cdtrSchmeId", theCdtrSchmeId), currentHashCode, theCdtrSchmeId);
        }
        {
            String thePreNtfctnId;
            thePreNtfctnId = this.getPreNtfctnId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preNtfctnId", thePreNtfctnId), currentHashCode, thePreNtfctnId);
        }
        {
            XMLGregorianCalendar thePreNtfctnDt;
            thePreNtfctnDt = this.getPreNtfctnDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preNtfctnDt", thePreNtfctnDt), currentHashCode, thePreNtfctnDt);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}