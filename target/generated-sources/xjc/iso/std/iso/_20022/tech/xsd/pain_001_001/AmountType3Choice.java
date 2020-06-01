//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 02:41:38 PM IST 
//


package iso.std.iso._20022.tech.xsd.pain_001_001;

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
 * <p>Java class for AmountType3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountType3Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ActiveOrHistoricCurrencyAndAmount"/>
 *           &lt;element name="EqvtAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}EquivalentAmount2"/>
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
@XmlType(name = "AmountType3Choice", propOrder = {
    "eqvtAmt",
    "instdAmt"
})
@Entity(name = "AmountType3Choice")
@Table(name = "AMOUNTTYPE3CHOICE")
@Inheritance(strategy = InheritanceType.JOINED)
public class AmountType3Choice
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "EqvtAmt")
    protected EquivalentAmount2 eqvtAmt;
    @XmlElement(name = "InstdAmt")
    protected ActiveOrHistoricCurrencyAndAmount instdAmt;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the eqvtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EquivalentAmount2 }
     *     
     */
    @ManyToOne(targetEntity = EquivalentAmount2 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EQVTAMT_AMOUNTTYPE3CHOICE_HJ_0")
    public EquivalentAmount2 getEqvtAmt() {
        return eqvtAmt;
    }

    /**
     * Sets the value of the eqvtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquivalentAmount2 }
     *     
     */
    public void setEqvtAmt(EquivalentAmount2 value) {
        this.eqvtAmt = value;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    @ManyToOne(targetEntity = ActiveOrHistoricCurrencyAndAmount.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "INSTDAMT_AMOUNTTYPE3CHOICE_H_0")
    public ActiveOrHistoricCurrencyAndAmount getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setInstdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.instdAmt = value;
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
        if (!(object instanceof AmountType3Choice)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AmountType3Choice that = ((AmountType3Choice) object);
        {
            EquivalentAmount2 lhsEqvtAmt;
            lhsEqvtAmt = this.getEqvtAmt();
            EquivalentAmount2 rhsEqvtAmt;
            rhsEqvtAmt = that.getEqvtAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eqvtAmt", lhsEqvtAmt), LocatorUtils.property(thatLocator, "eqvtAmt", rhsEqvtAmt), lhsEqvtAmt, rhsEqvtAmt)) {
                return false;
            }
        }
        {
            ActiveOrHistoricCurrencyAndAmount lhsInstdAmt;
            lhsInstdAmt = this.getInstdAmt();
            ActiveOrHistoricCurrencyAndAmount rhsInstdAmt;
            rhsInstdAmt = that.getInstdAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instdAmt", lhsInstdAmt), LocatorUtils.property(thatLocator, "instdAmt", rhsInstdAmt), lhsInstdAmt, rhsInstdAmt)) {
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
            EquivalentAmount2 theEqvtAmt;
            theEqvtAmt = this.getEqvtAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eqvtAmt", theEqvtAmt), currentHashCode, theEqvtAmt);
        }
        {
            ActiveOrHistoricCurrencyAndAmount theInstdAmt;
            theInstdAmt = this.getInstdAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instdAmt", theInstdAmt), currentHashCode, theInstdAmt);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
