//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 02:41:38 PM IST 
//


package iso.std.iso._20022.tech.xsd.pain_008_001;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
import javax.persistence.OneToMany;
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
 * <p>Java class for RegulatoryReporting3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulatoryReporting3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DbtCdtRptgInd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}RegulatoryReportingType1Code" minOccurs="0"/>
 *         &lt;element name="Authrty" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}RegulatoryAuthority2" minOccurs="0"/>
 *         &lt;element name="Dtls" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}StructuredRegulatoryReporting3" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryReporting3", propOrder = {
    "dbtCdtRptgInd",
    "authrty",
    "dtls"
})
@Entity(name = "RegulatoryReporting3")
@Table(name = "REGULATORYREPORTING3_0")
@Inheritance(strategy = InheritanceType.JOINED)
public class RegulatoryReporting3
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "DbtCdtRptgInd")
    protected RegulatoryReportingType1Code dbtCdtRptgInd;
    @XmlElement(name = "Authrty")
    protected RegulatoryAuthority2 authrty;
    @XmlElement(name = "Dtls")
    protected List<StructuredRegulatoryReporting3> dtls;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the dbtCdtRptgInd property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryReportingType1Code }
     *     
     */
    @Basic
    @Column(name = "DBTCDTRPTGIND", length = 255)
    @Enumerated(EnumType.STRING)
    public RegulatoryReportingType1Code getDbtCdtRptgInd() {
        return dbtCdtRptgInd;
    }

    /**
     * Sets the value of the dbtCdtRptgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryReportingType1Code }
     *     
     */
    public void setDbtCdtRptgInd(RegulatoryReportingType1Code value) {
        this.dbtCdtRptgInd = value;
    }

    /**
     * Gets the value of the authrty property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryAuthority2 }
     *     
     */
    @ManyToOne(targetEntity = RegulatoryAuthority2 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AUTHRTY_REGULATORYREPORTING3_1")
    public RegulatoryAuthority2 getAuthrty() {
        return authrty;
    }

    /**
     * Sets the value of the authrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryAuthority2 }
     *     
     */
    public void setAuthrty(RegulatoryAuthority2 value) {
        this.authrty = value;
    }

    /**
     * Gets the value of the dtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredRegulatoryReporting3 }
     * 
     * 
     */
    @OneToMany(targetEntity = StructuredRegulatoryReporting3 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DTLS_REGULATORYREPORTING3_0__0")
    public List<StructuredRegulatoryReporting3> getDtls() {
        if (dtls == null) {
            dtls = new ArrayList<StructuredRegulatoryReporting3>();
        }
        return this.dtls;
    }

    /**
     * 
     * 
     */
    public void setDtls(List<StructuredRegulatoryReporting3> dtls) {
        this.dtls = dtls;
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
        if (!(object instanceof RegulatoryReporting3)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RegulatoryReporting3 that = ((RegulatoryReporting3) object);
        {
            RegulatoryReportingType1Code lhsDbtCdtRptgInd;
            lhsDbtCdtRptgInd = this.getDbtCdtRptgInd();
            RegulatoryReportingType1Code rhsDbtCdtRptgInd;
            rhsDbtCdtRptgInd = that.getDbtCdtRptgInd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dbtCdtRptgInd", lhsDbtCdtRptgInd), LocatorUtils.property(thatLocator, "dbtCdtRptgInd", rhsDbtCdtRptgInd), lhsDbtCdtRptgInd, rhsDbtCdtRptgInd)) {
                return false;
            }
        }
        {
            RegulatoryAuthority2 lhsAuthrty;
            lhsAuthrty = this.getAuthrty();
            RegulatoryAuthority2 rhsAuthrty;
            rhsAuthrty = that.getAuthrty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authrty", lhsAuthrty), LocatorUtils.property(thatLocator, "authrty", rhsAuthrty), lhsAuthrty, rhsAuthrty)) {
                return false;
            }
        }
        {
            List<StructuredRegulatoryReporting3> lhsDtls;
            lhsDtls = (((this.dtls!= null)&&(!this.dtls.isEmpty()))?this.getDtls():null);
            List<StructuredRegulatoryReporting3> rhsDtls;
            rhsDtls = (((that.dtls!= null)&&(!that.dtls.isEmpty()))?that.getDtls():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dtls", lhsDtls), LocatorUtils.property(thatLocator, "dtls", rhsDtls), lhsDtls, rhsDtls)) {
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
            RegulatoryReportingType1Code theDbtCdtRptgInd;
            theDbtCdtRptgInd = this.getDbtCdtRptgInd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dbtCdtRptgInd", theDbtCdtRptgInd), currentHashCode, theDbtCdtRptgInd);
        }
        {
            RegulatoryAuthority2 theAuthrty;
            theAuthrty = this.getAuthrty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authrty", theAuthrty), currentHashCode, theAuthrty);
        }
        {
            List<StructuredRegulatoryReporting3> theDtls;
            theDtls = (((this.dtls!= null)&&(!this.dtls.isEmpty()))?this.getDtls():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dtls", theDtls), currentHashCode, theDtls);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
