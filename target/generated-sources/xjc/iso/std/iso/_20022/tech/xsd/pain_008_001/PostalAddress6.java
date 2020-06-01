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
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
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
 * <p>Java class for PostalAddress6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddress6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdrTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}AddressType2Code" minOccurs="0"/>
 *         &lt;element name="Dept" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max70Text" minOccurs="0"/>
 *         &lt;element name="SubDept" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max70Text" minOccurs="0"/>
 *         &lt;element name="StrtNm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max70Text" minOccurs="0"/>
 *         &lt;element name="BldgNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max16Text" minOccurs="0"/>
 *         &lt;element name="PstCd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max16Text" minOccurs="0"/>
 *         &lt;element name="TwnNm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="CtrySubDvsn" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}CountryCode" minOccurs="0"/>
 *         &lt;element name="AdrLine" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max70Text" maxOccurs="7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress6", propOrder = {
    "adrTp",
    "dept",
    "subDept",
    "strtNm",
    "bldgNb",
    "pstCd",
    "twnNm",
    "ctrySubDvsn",
    "ctry",
    "adrLines"
})
@Entity(name = "PostalAddress6")
@Table(name = "POSTALADDRESS6_0")
@Inheritance(strategy = InheritanceType.JOINED)
public class PostalAddress6
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "AdrTp")
    protected AddressType2Code adrTp;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "SubDept")
    protected String subDept;
    @XmlElement(name = "StrtNm")
    protected String strtNm;
    @XmlElement(name = "BldgNb")
    protected String bldgNb;
    @XmlElement(name = "PstCd")
    protected String pstCd;
    @XmlElement(name = "TwnNm")
    protected String twnNm;
    @XmlElement(name = "CtrySubDvsn")
    protected String ctrySubDvsn;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "AdrLine")
    protected List<String> adrLines;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the adrTp property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType2Code }
     *     
     */
    @Basic
    @Column(name = "ADRTP", length = 255)
    @Enumerated(EnumType.STRING)
    public AddressType2Code getAdrTp() {
        return adrTp;
    }

    /**
     * Sets the value of the adrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType2Code }
     *     
     */
    public void setAdrTp(AddressType2Code value) {
        this.adrTp = value;
    }

    /**
     * Gets the value of the dept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DEPT", length = 70)
    public String getDept() {
        return dept;
    }

    /**
     * Sets the value of the dept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

    /**
     * Gets the value of the subDept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SUBDEPT", length = 70)
    public String getSubDept() {
        return subDept;
    }

    /**
     * Sets the value of the subDept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDept(String value) {
        this.subDept = value;
    }

    /**
     * Gets the value of the strtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STRTNM", length = 70)
    public String getStrtNm() {
        return strtNm;
    }

    /**
     * Sets the value of the strtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtNm(String value) {
        this.strtNm = value;
    }

    /**
     * Gets the value of the bldgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "BLDGNB", length = 16)
    public String getBldgNb() {
        return bldgNb;
    }

    /**
     * Sets the value of the bldgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgNb(String value) {
        this.bldgNb = value;
    }

    /**
     * Gets the value of the pstCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PSTCD", length = 16)
    public String getPstCd() {
        return pstCd;
    }

    /**
     * Sets the value of the pstCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstCd(String value) {
        this.pstCd = value;
    }

    /**
     * Gets the value of the twnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TWNNM", length = 35)
    public String getTwnNm() {
        return twnNm;
    }

    /**
     * Sets the value of the twnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwnNm(String value) {
        this.twnNm = value;
    }

    /**
     * Gets the value of the ctrySubDvsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CTRYSUBDVSN", length = 35)
    public String getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    /**
     * Sets the value of the ctrySubDvsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsn(String value) {
        this.ctrySubDvsn = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CTRY", length = 255)
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the adrLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adrLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdrLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @ElementCollection
    @OrderColumn(name = "HJINDEX")
    @Column(name = "HJVALUE", length = 70)
    @CollectionTable(name = "POSTALADDRESS6_0_ADRLINES", joinColumns = {
        @JoinColumn(name = "HJID")
    })
    public List<String> getAdrLines() {
        if (adrLines == null) {
            adrLines = new ArrayList<String>();
        }
        return this.adrLines;
    }

    /**
     * 
     * 
     */
    public void setAdrLines(List<String> adrLines) {
        this.adrLines = adrLines;
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
        if (!(object instanceof PostalAddress6)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PostalAddress6 that = ((PostalAddress6) object);
        {
            AddressType2Code lhsAdrTp;
            lhsAdrTp = this.getAdrTp();
            AddressType2Code rhsAdrTp;
            rhsAdrTp = that.getAdrTp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adrTp", lhsAdrTp), LocatorUtils.property(thatLocator, "adrTp", rhsAdrTp), lhsAdrTp, rhsAdrTp)) {
                return false;
            }
        }
        {
            String lhsDept;
            lhsDept = this.getDept();
            String rhsDept;
            rhsDept = that.getDept();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dept", lhsDept), LocatorUtils.property(thatLocator, "dept", rhsDept), lhsDept, rhsDept)) {
                return false;
            }
        }
        {
            String lhsSubDept;
            lhsSubDept = this.getSubDept();
            String rhsSubDept;
            rhsSubDept = that.getSubDept();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subDept", lhsSubDept), LocatorUtils.property(thatLocator, "subDept", rhsSubDept), lhsSubDept, rhsSubDept)) {
                return false;
            }
        }
        {
            String lhsStrtNm;
            lhsStrtNm = this.getStrtNm();
            String rhsStrtNm;
            rhsStrtNm = that.getStrtNm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strtNm", lhsStrtNm), LocatorUtils.property(thatLocator, "strtNm", rhsStrtNm), lhsStrtNm, rhsStrtNm)) {
                return false;
            }
        }
        {
            String lhsBldgNb;
            lhsBldgNb = this.getBldgNb();
            String rhsBldgNb;
            rhsBldgNb = that.getBldgNb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bldgNb", lhsBldgNb), LocatorUtils.property(thatLocator, "bldgNb", rhsBldgNb), lhsBldgNb, rhsBldgNb)) {
                return false;
            }
        }
        {
            String lhsPstCd;
            lhsPstCd = this.getPstCd();
            String rhsPstCd;
            rhsPstCd = that.getPstCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pstCd", lhsPstCd), LocatorUtils.property(thatLocator, "pstCd", rhsPstCd), lhsPstCd, rhsPstCd)) {
                return false;
            }
        }
        {
            String lhsTwnNm;
            lhsTwnNm = this.getTwnNm();
            String rhsTwnNm;
            rhsTwnNm = that.getTwnNm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "twnNm", lhsTwnNm), LocatorUtils.property(thatLocator, "twnNm", rhsTwnNm), lhsTwnNm, rhsTwnNm)) {
                return false;
            }
        }
        {
            String lhsCtrySubDvsn;
            lhsCtrySubDvsn = this.getCtrySubDvsn();
            String rhsCtrySubDvsn;
            rhsCtrySubDvsn = that.getCtrySubDvsn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ctrySubDvsn", lhsCtrySubDvsn), LocatorUtils.property(thatLocator, "ctrySubDvsn", rhsCtrySubDvsn), lhsCtrySubDvsn, rhsCtrySubDvsn)) {
                return false;
            }
        }
        {
            String lhsCtry;
            lhsCtry = this.getCtry();
            String rhsCtry;
            rhsCtry = that.getCtry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ctry", lhsCtry), LocatorUtils.property(thatLocator, "ctry", rhsCtry), lhsCtry, rhsCtry)) {
                return false;
            }
        }
        {
            List<String> lhsAdrLines;
            lhsAdrLines = (((this.adrLines!= null)&&(!this.adrLines.isEmpty()))?this.getAdrLines():null);
            List<String> rhsAdrLines;
            rhsAdrLines = (((that.adrLines!= null)&&(!that.adrLines.isEmpty()))?that.getAdrLines():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adrLines", lhsAdrLines), LocatorUtils.property(thatLocator, "adrLines", rhsAdrLines), lhsAdrLines, rhsAdrLines)) {
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
            AddressType2Code theAdrTp;
            theAdrTp = this.getAdrTp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adrTp", theAdrTp), currentHashCode, theAdrTp);
        }
        {
            String theDept;
            theDept = this.getDept();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dept", theDept), currentHashCode, theDept);
        }
        {
            String theSubDept;
            theSubDept = this.getSubDept();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subDept", theSubDept), currentHashCode, theSubDept);
        }
        {
            String theStrtNm;
            theStrtNm = this.getStrtNm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strtNm", theStrtNm), currentHashCode, theStrtNm);
        }
        {
            String theBldgNb;
            theBldgNb = this.getBldgNb();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bldgNb", theBldgNb), currentHashCode, theBldgNb);
        }
        {
            String thePstCd;
            thePstCd = this.getPstCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pstCd", thePstCd), currentHashCode, thePstCd);
        }
        {
            String theTwnNm;
            theTwnNm = this.getTwnNm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "twnNm", theTwnNm), currentHashCode, theTwnNm);
        }
        {
            String theCtrySubDvsn;
            theCtrySubDvsn = this.getCtrySubDvsn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ctrySubDvsn", theCtrySubDvsn), currentHashCode, theCtrySubDvsn);
        }
        {
            String theCtry;
            theCtry = this.getCtry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ctry", theCtry), currentHashCode, theCtry);
        }
        {
            List<String> theAdrLines;
            theAdrLines = (((this.adrLines!= null)&&(!this.adrLines.isEmpty()))?this.getAdrLines():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adrLines", theAdrLines), currentHashCode, theAdrLines);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}