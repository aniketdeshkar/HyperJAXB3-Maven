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
 * <p>Java class for OrganisationIdentification4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationIdentification4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BICOrBEI" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}AnyBICIdentifier" minOccurs="0"/>
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}GenericOrganisationIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationIdentification4", propOrder = {
    "bicOrBEI",
    "othrs"
})
@Entity(name = "OrganisationIdentification4")
@Table(name = "ORGANISATIONIDENTIFICATION4")
@Inheritance(strategy = InheritanceType.JOINED)
public class OrganisationIdentification4
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "BICOrBEI")
    protected String bicOrBEI;
    @XmlElement(name = "Othr")
    protected List<GenericOrganisationIdentification1> othrs;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the bicOrBEI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "BICORBEI", length = 255)
    public String getBICOrBEI() {
        return bicOrBEI;
    }

    /**
     * Sets the value of the bicOrBEI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICOrBEI(String value) {
        this.bicOrBEI = value;
    }

    /**
     * Gets the value of the othrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericOrganisationIdentification1 }
     * 
     * 
     */
    @OneToMany(targetEntity = GenericOrganisationIdentification1 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "OTHRS_ORGANISATIONIDENTIFICA_0")
    public List<GenericOrganisationIdentification1> getOthrs() {
        if (othrs == null) {
            othrs = new ArrayList<GenericOrganisationIdentification1>();
        }
        return this.othrs;
    }

    /**
     * 
     * 
     */
    public void setOthrs(List<GenericOrganisationIdentification1> othrs) {
        this.othrs = othrs;
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
        if (!(object instanceof OrganisationIdentification4)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OrganisationIdentification4 that = ((OrganisationIdentification4) object);
        {
            String lhsBICOrBEI;
            lhsBICOrBEI = this.getBICOrBEI();
            String rhsBICOrBEI;
            rhsBICOrBEI = that.getBICOrBEI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bicOrBEI", lhsBICOrBEI), LocatorUtils.property(thatLocator, "bicOrBEI", rhsBICOrBEI), lhsBICOrBEI, rhsBICOrBEI)) {
                return false;
            }
        }
        {
            List<GenericOrganisationIdentification1> lhsOthrs;
            lhsOthrs = (((this.othrs!= null)&&(!this.othrs.isEmpty()))?this.getOthrs():null);
            List<GenericOrganisationIdentification1> rhsOthrs;
            rhsOthrs = (((that.othrs!= null)&&(!that.othrs.isEmpty()))?that.getOthrs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "othrs", lhsOthrs), LocatorUtils.property(thatLocator, "othrs", rhsOthrs), lhsOthrs, rhsOthrs)) {
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
            String theBICOrBEI;
            theBICOrBEI = this.getBICOrBEI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bicOrBEI", theBICOrBEI), currentHashCode, theBICOrBEI);
        }
        {
            List<GenericOrganisationIdentification1> theOthrs;
            theOthrs = (((this.othrs!= null)&&(!this.othrs.isEmpty()))?this.getOthrs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "othrs", theOthrs), currentHashCode, theOthrs);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
