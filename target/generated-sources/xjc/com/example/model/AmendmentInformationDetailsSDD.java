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
 * <p>Java class for AmendmentInformationDetailsSDD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendmentInformationDetailsSDD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgnlMndtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}RestrictedIdentificationSEPA2" minOccurs="0"/>
 *         &lt;element name="OrgnlCdtrSchmeId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}PartyIdentificationSEPA4" minOccurs="0"/>
 *         &lt;element name="OrgnlDbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}CashAccountSEPA2" minOccurs="0"/>
 *         &lt;element name="OrgnlDbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}BranchAndFinancialInstitutionIdentificationSEPA2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendmentInformationDetailsSDD", propOrder = {
    "orgnlMndtId",
    "orgnlCdtrSchmeId",
    "orgnlDbtrAcct",
    "orgnlDbtrAgt"
})
@Entity(name = "AmendmentInformationDetailsSDD")
@Table(name = "AMENDMENTINFORMATIONDETAILSS_0")
@Inheritance(strategy = InheritanceType.JOINED)
public class AmendmentInformationDetailsSDD
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "OrgnlMndtId")
    protected String orgnlMndtId;
    @XmlElement(name = "OrgnlCdtrSchmeId")
    protected PartyIdentificationSEPA4 orgnlCdtrSchmeId;
    @XmlElement(name = "OrgnlDbtrAcct")
    protected CashAccountSEPA2 orgnlDbtrAcct;
    @XmlElement(name = "OrgnlDbtrAgt")
    protected BranchAndFinancialInstitutionIdentificationSEPA2 orgnlDbtrAgt;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the orgnlMndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ORGNLMNDTID", length = 255)
    public String getOrgnlMndtId() {
        return orgnlMndtId;
    }

    /**
     * Sets the value of the orgnlMndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlMndtId(String value) {
        this.orgnlMndtId = value;
    }

    /**
     * Gets the value of the orgnlCdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA4 }
     *     
     */
    @ManyToOne(targetEntity = PartyIdentificationSEPA4 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORGNLCDTRSCHMEID_AMENDMENTIN_0")
    public PartyIdentificationSEPA4 getOrgnlCdtrSchmeId() {
        return orgnlCdtrSchmeId;
    }

    /**
     * Sets the value of the orgnlCdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA4 }
     *     
     */
    public void setOrgnlCdtrSchmeId(PartyIdentificationSEPA4 value) {
        this.orgnlCdtrSchmeId = value;
    }

    /**
     * Gets the value of the orgnlDbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountSEPA2 }
     *     
     */
    @ManyToOne(targetEntity = CashAccountSEPA2 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORGNLDBTRACCT_AMENDMENTINFOR_0")
    public CashAccountSEPA2 getOrgnlDbtrAcct() {
        return orgnlDbtrAcct;
    }

    /**
     * Sets the value of the orgnlDbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountSEPA2 }
     *     
     */
    public void setOrgnlDbtrAcct(CashAccountSEPA2 value) {
        this.orgnlDbtrAcct = value;
    }

    /**
     * Gets the value of the orgnlDbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA2 }
     *     
     */
    @ManyToOne(targetEntity = BranchAndFinancialInstitutionIdentificationSEPA2 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORGNLDBTRAGT_AMENDMENTINFORM_0")
    public BranchAndFinancialInstitutionIdentificationSEPA2 getOrgnlDbtrAgt() {
        return orgnlDbtrAgt;
    }

    /**
     * Sets the value of the orgnlDbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentificationSEPA2 }
     *     
     */
    public void setOrgnlDbtrAgt(BranchAndFinancialInstitutionIdentificationSEPA2 value) {
        this.orgnlDbtrAgt = value;
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
        if (!(object instanceof AmendmentInformationDetailsSDD)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AmendmentInformationDetailsSDD that = ((AmendmentInformationDetailsSDD) object);
        {
            String lhsOrgnlMndtId;
            lhsOrgnlMndtId = this.getOrgnlMndtId();
            String rhsOrgnlMndtId;
            rhsOrgnlMndtId = that.getOrgnlMndtId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgnlMndtId", lhsOrgnlMndtId), LocatorUtils.property(thatLocator, "orgnlMndtId", rhsOrgnlMndtId), lhsOrgnlMndtId, rhsOrgnlMndtId)) {
                return false;
            }
        }
        {
            PartyIdentificationSEPA4 lhsOrgnlCdtrSchmeId;
            lhsOrgnlCdtrSchmeId = this.getOrgnlCdtrSchmeId();
            PartyIdentificationSEPA4 rhsOrgnlCdtrSchmeId;
            rhsOrgnlCdtrSchmeId = that.getOrgnlCdtrSchmeId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgnlCdtrSchmeId", lhsOrgnlCdtrSchmeId), LocatorUtils.property(thatLocator, "orgnlCdtrSchmeId", rhsOrgnlCdtrSchmeId), lhsOrgnlCdtrSchmeId, rhsOrgnlCdtrSchmeId)) {
                return false;
            }
        }
        {
            CashAccountSEPA2 lhsOrgnlDbtrAcct;
            lhsOrgnlDbtrAcct = this.getOrgnlDbtrAcct();
            CashAccountSEPA2 rhsOrgnlDbtrAcct;
            rhsOrgnlDbtrAcct = that.getOrgnlDbtrAcct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgnlDbtrAcct", lhsOrgnlDbtrAcct), LocatorUtils.property(thatLocator, "orgnlDbtrAcct", rhsOrgnlDbtrAcct), lhsOrgnlDbtrAcct, rhsOrgnlDbtrAcct)) {
                return false;
            }
        }
        {
            BranchAndFinancialInstitutionIdentificationSEPA2 lhsOrgnlDbtrAgt;
            lhsOrgnlDbtrAgt = this.getOrgnlDbtrAgt();
            BranchAndFinancialInstitutionIdentificationSEPA2 rhsOrgnlDbtrAgt;
            rhsOrgnlDbtrAgt = that.getOrgnlDbtrAgt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgnlDbtrAgt", lhsOrgnlDbtrAgt), LocatorUtils.property(thatLocator, "orgnlDbtrAgt", rhsOrgnlDbtrAgt), lhsOrgnlDbtrAgt, rhsOrgnlDbtrAgt)) {
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
            String theOrgnlMndtId;
            theOrgnlMndtId = this.getOrgnlMndtId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgnlMndtId", theOrgnlMndtId), currentHashCode, theOrgnlMndtId);
        }
        {
            PartyIdentificationSEPA4 theOrgnlCdtrSchmeId;
            theOrgnlCdtrSchmeId = this.getOrgnlCdtrSchmeId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgnlCdtrSchmeId", theOrgnlCdtrSchmeId), currentHashCode, theOrgnlCdtrSchmeId);
        }
        {
            CashAccountSEPA2 theOrgnlDbtrAcct;
            theOrgnlDbtrAcct = this.getOrgnlDbtrAcct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgnlDbtrAcct", theOrgnlDbtrAcct), currentHashCode, theOrgnlDbtrAcct);
        }
        {
            BranchAndFinancialInstitutionIdentificationSEPA2 theOrgnlDbtrAgt;
            theOrgnlDbtrAgt = this.getOrgnlDbtrAgt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgnlDbtrAgt", theOrgnlDbtrAgt), currentHashCode, theOrgnlDbtrAgt);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}