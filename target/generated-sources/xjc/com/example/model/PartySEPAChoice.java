//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 09:30:02 PM IST 
//


package com.example.model;

import java.io.Serializable;
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
 * <p>Java class for PartySEPAChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartySEPAChoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}OrganisationIdentificationSEPAChoice"/>
 *           &lt;element name="PrvtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.002.02}PersonIdentificationSEPA1Choice"/>
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
@XmlType(name = "PartySEPAChoice", propOrder = {
    "prvtId",
    "orgId"
})
@Entity(name = "PartySEPAChoice")
@Table(name = "PARTYSEPACHOICE")
@Inheritance(strategy = InheritanceType.JOINED)
public class PartySEPAChoice
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "PrvtId")
    protected PersonIdentificationSEPA1Choice prvtId;
    @XmlElement(name = "OrgId")
    protected OrganisationIdentificationSEPAChoice orgId;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the prvtId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationSEPA1Choice }
     *     
     */
    @ManyToOne(targetEntity = PersonIdentificationSEPA1Choice.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRVTID_PARTYSEPACHOICE_HJID")
    public PersonIdentificationSEPA1Choice getPrvtId() {
        return prvtId;
    }

    /**
     * Sets the value of the prvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationSEPA1Choice }
     *     
     */
    public void setPrvtId(PersonIdentificationSEPA1Choice value) {
        this.prvtId = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentificationSEPAChoice }
     *     
     */
    @ManyToOne(targetEntity = OrganisationIdentificationSEPAChoice.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORGID_PARTYSEPACHOICE_HJID")
    public OrganisationIdentificationSEPAChoice getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentificationSEPAChoice }
     *     
     */
    public void setOrgId(OrganisationIdentificationSEPAChoice value) {
        this.orgId = value;
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
        if (!(object instanceof PartySEPAChoice)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PartySEPAChoice that = ((PartySEPAChoice) object);
        {
            PersonIdentificationSEPA1Choice lhsPrvtId;
            lhsPrvtId = this.getPrvtId();
            PersonIdentificationSEPA1Choice rhsPrvtId;
            rhsPrvtId = that.getPrvtId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prvtId", lhsPrvtId), LocatorUtils.property(thatLocator, "prvtId", rhsPrvtId), lhsPrvtId, rhsPrvtId)) {
                return false;
            }
        }
        {
            OrganisationIdentificationSEPAChoice lhsOrgId;
            lhsOrgId = this.getOrgId();
            OrganisationIdentificationSEPAChoice rhsOrgId;
            rhsOrgId = that.getOrgId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orgId", lhsOrgId), LocatorUtils.property(thatLocator, "orgId", rhsOrgId), lhsOrgId, rhsOrgId)) {
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
            PersonIdentificationSEPA1Choice thePrvtId;
            thePrvtId = this.getPrvtId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prvtId", thePrvtId), currentHashCode, thePrvtId);
        }
        {
            OrganisationIdentificationSEPAChoice theOrgId;
            theOrgId = this.getOrgId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orgId", theOrgId), currentHashCode, theOrgId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
