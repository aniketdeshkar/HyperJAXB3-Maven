//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 02:41:38 PM IST 
//


package iso.std.iso._20022.tech.xsd.pain_001_001;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
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
 * <p>Java class for StructuredRegulatoryReporting3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredRegulatoryReporting3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" minOccurs="0"/>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ISODate" minOccurs="0"/>
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}CountryCode" minOccurs="0"/>
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max10Text" minOccurs="0"/>
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="Inf" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRegulatoryReporting3", propOrder = {
    "tp",
    "dt",
    "ctry",
    "cd",
    "amt",
    "inves"
})
@Entity(name = "StructuredRegulatoryReporting3")
@Table(name = "STRUCTUREDREGULATORYREPORTIN_0")
@Inheritance(strategy = InheritanceType.JOINED)
public class StructuredRegulatoryReporting3
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Dt")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "Inf")
    protected List<String> inves;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TP", length = 35)
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
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
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CD", length = 10)
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    @ManyToOne(targetEntity = ActiveOrHistoricCurrencyAndAmount.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AMT_STRUCTUREDREGULATORYREPO_0")
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the inves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInves().add(newItem);
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
    @Column(name = "HJVALUE", length = 35)
    @CollectionTable(name = "STRUCTUREDREGULATORYREPORTIN_1", joinColumns = {
        @JoinColumn(name = "HJID")
    })
    public List<String> getInves() {
        if (inves == null) {
            inves = new ArrayList<String>();
        }
        return this.inves;
    }

    /**
     * 
     * 
     */
    public void setInves(List<String> inves) {
        this.inves = inves;
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
    @Column(name = "DTITEM")
    @Temporal(TemporalType.DATE)
    public Date getDtItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDate.class, this.getDt());
    }

    public void setDtItem(Date target) {
        setDt(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDate.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StructuredRegulatoryReporting3)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StructuredRegulatoryReporting3 that = ((StructuredRegulatoryReporting3) object);
        {
            String lhsTp;
            lhsTp = this.getTp();
            String rhsTp;
            rhsTp = that.getTp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tp", lhsTp), LocatorUtils.property(thatLocator, "tp", rhsTp), lhsTp, rhsTp)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsDt;
            lhsDt = this.getDt();
            XMLGregorianCalendar rhsDt;
            rhsDt = that.getDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dt", lhsDt), LocatorUtils.property(thatLocator, "dt", rhsDt), lhsDt, rhsDt)) {
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
            String lhsCd;
            lhsCd = this.getCd();
            String rhsCd;
            rhsCd = that.getCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cd", lhsCd), LocatorUtils.property(thatLocator, "cd", rhsCd), lhsCd, rhsCd)) {
                return false;
            }
        }
        {
            ActiveOrHistoricCurrencyAndAmount lhsAmt;
            lhsAmt = this.getAmt();
            ActiveOrHistoricCurrencyAndAmount rhsAmt;
            rhsAmt = that.getAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amt", lhsAmt), LocatorUtils.property(thatLocator, "amt", rhsAmt), lhsAmt, rhsAmt)) {
                return false;
            }
        }
        {
            List<String> lhsInves;
            lhsInves = (((this.inves!= null)&&(!this.inves.isEmpty()))?this.getInves():null);
            List<String> rhsInves;
            rhsInves = (((that.inves!= null)&&(!that.inves.isEmpty()))?that.getInves():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inves", lhsInves), LocatorUtils.property(thatLocator, "inves", rhsInves), lhsInves, rhsInves)) {
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
            String theTp;
            theTp = this.getTp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tp", theTp), currentHashCode, theTp);
        }
        {
            XMLGregorianCalendar theDt;
            theDt = this.getDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dt", theDt), currentHashCode, theDt);
        }
        {
            String theCtry;
            theCtry = this.getCtry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ctry", theCtry), currentHashCode, theCtry);
        }
        {
            String theCd;
            theCd = this.getCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cd", theCd), currentHashCode, theCd);
        }
        {
            ActiveOrHistoricCurrencyAndAmount theAmt;
            theAmt = this.getAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amt", theAmt), currentHashCode, theAmt);
        }
        {
            List<String> theInves;
            theInves = (((this.inves!= null)&&(!this.inves.isEmpty()))?this.getInves():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inves", theInves), currentHashCode, theInves);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}