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
 * <p>Java class for BranchAndFinancialInstitutionIdentification4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchAndFinancialInstitutionIdentification4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}FinancialInstitutionIdentification7"/>
 *         &lt;element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BranchData2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification4", propOrder = {
    "finInstnId",
    "brnchId"
})
@Entity(name = "BranchAndFinancialInstitutionIdentification4")
@Table(name = "BRANCHANDFINANCIALINSTITUTIO_0")
@Inheritance(strategy = InheritanceType.JOINED)
public class BranchAndFinancialInstitutionIdentification4
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "FinInstnId", required = true)
    protected FinancialInstitutionIdentification7 finInstnId;
    @XmlElement(name = "BrnchId")
    protected BranchData2 brnchId;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the finInstnId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification7 }
     *     
     */
    @ManyToOne(targetEntity = FinancialInstitutionIdentification7 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "FININSTNID_BRANCHANDFINANCIA_0")
    public FinancialInstitutionIdentification7 getFinInstnId() {
        return finInstnId;
    }

    /**
     * Sets the value of the finInstnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification7 }
     *     
     */
    public void setFinInstnId(FinancialInstitutionIdentification7 value) {
        this.finInstnId = value;
    }

    /**
     * Gets the value of the brnchId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData2 }
     *     
     */
    @ManyToOne(targetEntity = BranchData2 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "BRNCHID_BRANCHANDFINANCIALIN_0")
    public BranchData2 getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData2 }
     *     
     */
    public void setBrnchId(BranchData2 value) {
        this.brnchId = value;
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
        if (!(object instanceof BranchAndFinancialInstitutionIdentification4)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BranchAndFinancialInstitutionIdentification4 that = ((BranchAndFinancialInstitutionIdentification4) object);
        {
            FinancialInstitutionIdentification7 lhsFinInstnId;
            lhsFinInstnId = this.getFinInstnId();
            FinancialInstitutionIdentification7 rhsFinInstnId;
            rhsFinInstnId = that.getFinInstnId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finInstnId", lhsFinInstnId), LocatorUtils.property(thatLocator, "finInstnId", rhsFinInstnId), lhsFinInstnId, rhsFinInstnId)) {
                return false;
            }
        }
        {
            BranchData2 lhsBrnchId;
            lhsBrnchId = this.getBrnchId();
            BranchData2 rhsBrnchId;
            rhsBrnchId = that.getBrnchId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brnchId", lhsBrnchId), LocatorUtils.property(thatLocator, "brnchId", rhsBrnchId), lhsBrnchId, rhsBrnchId)) {
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
            FinancialInstitutionIdentification7 theFinInstnId;
            theFinInstnId = this.getFinInstnId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finInstnId", theFinInstnId), currentHashCode, theFinInstnId);
        }
        {
            BranchData2 theBrnchId;
            theBrnchId = this.getBrnchId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brnchId", theBrnchId), currentHashCode, theBrnchId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
