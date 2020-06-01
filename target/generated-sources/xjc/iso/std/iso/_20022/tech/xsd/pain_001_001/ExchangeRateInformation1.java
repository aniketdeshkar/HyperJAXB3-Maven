//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 02:41:38 PM IST 
//


package iso.std.iso._20022.tech.xsd.pain_001_001;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
 * <p>Java class for ExchangeRateInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRateInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BaseOneRate" minOccurs="0"/>
 *         &lt;element name="RateTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ExchangeRateType1Code" minOccurs="0"/>
 *         &lt;element name="CtrctId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateInformation1", propOrder = {
    "xchgRate",
    "rateTp",
    "ctrctId"
})
@Entity(name = "ExchangeRateInformation1")
@Table(name = "EXCHANGERATEINFORMATION1")
@Inheritance(strategy = InheritanceType.JOINED)
public class ExchangeRateInformation1
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "RateTp")
    protected ExchangeRateType1Code rateTp;
    @XmlElement(name = "CtrctId")
    protected String ctrctId;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "XCHGRATE", precision = 11, scale = 10)
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXchgRate(BigDecimal value) {
        this.xchgRate = value;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType1Code }
     *     
     */
    @Basic
    @Column(name = "RATETP", length = 255)
    @Enumerated(EnumType.STRING)
    public ExchangeRateType1Code getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType1Code }
     *     
     */
    public void setRateTp(ExchangeRateType1Code value) {
        this.rateTp = value;
    }

    /**
     * Gets the value of the ctrctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CTRCTID", length = 35)
    public String getCtrctId() {
        return ctrctId;
    }

    /**
     * Sets the value of the ctrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrctId(String value) {
        this.ctrctId = value;
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
        if (!(object instanceof ExchangeRateInformation1)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExchangeRateInformation1 that = ((ExchangeRateInformation1) object);
        {
            BigDecimal lhsXchgRate;
            lhsXchgRate = this.getXchgRate();
            BigDecimal rhsXchgRate;
            rhsXchgRate = that.getXchgRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xchgRate", lhsXchgRate), LocatorUtils.property(thatLocator, "xchgRate", rhsXchgRate), lhsXchgRate, rhsXchgRate)) {
                return false;
            }
        }
        {
            ExchangeRateType1Code lhsRateTp;
            lhsRateTp = this.getRateTp();
            ExchangeRateType1Code rhsRateTp;
            rhsRateTp = that.getRateTp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rateTp", lhsRateTp), LocatorUtils.property(thatLocator, "rateTp", rhsRateTp), lhsRateTp, rhsRateTp)) {
                return false;
            }
        }
        {
            String lhsCtrctId;
            lhsCtrctId = this.getCtrctId();
            String rhsCtrctId;
            rhsCtrctId = that.getCtrctId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ctrctId", lhsCtrctId), LocatorUtils.property(thatLocator, "ctrctId", rhsCtrctId), lhsCtrctId, rhsCtrctId)) {
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
            BigDecimal theXchgRate;
            theXchgRate = this.getXchgRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xchgRate", theXchgRate), currentHashCode, theXchgRate);
        }
        {
            ExchangeRateType1Code theRateTp;
            theRateTp = this.getRateTp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rateTp", theRateTp), currentHashCode, theRateTp);
        }
        {
            String theCtrctId;
            theCtrctId = this.getCtrctId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ctrctId", theCtrctId), currentHashCode, theCtrctId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
