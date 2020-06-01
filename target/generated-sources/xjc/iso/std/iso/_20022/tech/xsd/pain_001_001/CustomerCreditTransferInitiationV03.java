//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 02:41:38 PM IST 
//


package iso.std.iso._20022.tech.xsd.pain_001_001;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for CustomerCreditTransferInitiationV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerCreditTransferInitiationV03">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}GroupHeader32"/>
 *         &lt;element name="PmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PaymentInstructionInformation3" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCreditTransferInitiationV03", propOrder = {
    "grpHdr",
    "pmtInves"
})
@Entity(name = "CustomerCreditTransferInitiationV03")
@Table(name = "CUSTOMERCREDITTRANSFERINITIA_0")
@Inheritance(strategy = InheritanceType.JOINED)
public class CustomerCreditTransferInitiationV03
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader32 grpHdr;
    @XmlElement(name = "PmtInf", required = true)
    protected List<PaymentInstructionInformation3> pmtInves;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader32 }
     *     
     */
    @ManyToOne(targetEntity = GroupHeader32 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "GRPHDR_CUSTOMERCREDITTRANSFE_0")
    public GroupHeader32 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader32 }
     *     
     */
    public void setGrpHdr(GroupHeader32 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the pmtInves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtInves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstructionInformation3 }
     * 
     * 
     */
    @OneToMany(targetEntity = PaymentInstructionInformation3 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PMTINVES_CUSTOMERCREDITTRANS_0")
    public List<PaymentInstructionInformation3> getPmtInves() {
        if (pmtInves == null) {
            pmtInves = new ArrayList<PaymentInstructionInformation3>();
        }
        return this.pmtInves;
    }

    /**
     * 
     * 
     */
    public void setPmtInves(List<PaymentInstructionInformation3> pmtInves) {
        this.pmtInves = pmtInves;
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
        if (!(object instanceof CustomerCreditTransferInitiationV03)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CustomerCreditTransferInitiationV03 that = ((CustomerCreditTransferInitiationV03) object);
        {
            GroupHeader32 lhsGrpHdr;
            lhsGrpHdr = this.getGrpHdr();
            GroupHeader32 rhsGrpHdr;
            rhsGrpHdr = that.getGrpHdr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grpHdr", lhsGrpHdr), LocatorUtils.property(thatLocator, "grpHdr", rhsGrpHdr), lhsGrpHdr, rhsGrpHdr)) {
                return false;
            }
        }
        {
            List<PaymentInstructionInformation3> lhsPmtInves;
            lhsPmtInves = (((this.pmtInves!= null)&&(!this.pmtInves.isEmpty()))?this.getPmtInves():null);
            List<PaymentInstructionInformation3> rhsPmtInves;
            rhsPmtInves = (((that.pmtInves!= null)&&(!that.pmtInves.isEmpty()))?that.getPmtInves():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pmtInves", lhsPmtInves), LocatorUtils.property(thatLocator, "pmtInves", rhsPmtInves), lhsPmtInves, rhsPmtInves)) {
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
            GroupHeader32 theGrpHdr;
            theGrpHdr = this.getGrpHdr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grpHdr", theGrpHdr), currentHashCode, theGrpHdr);
        }
        {
            List<PaymentInstructionInformation3> thePmtInves;
            thePmtInves = (((this.pmtInves!= null)&&(!this.pmtInves.isEmpty()))?this.getPmtInves():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtInves", thePmtInves), currentHashCode, thePmtInves);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}