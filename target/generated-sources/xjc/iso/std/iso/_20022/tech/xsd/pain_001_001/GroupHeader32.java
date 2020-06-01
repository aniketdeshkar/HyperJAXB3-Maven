//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 02:41:38 PM IST 
//


package iso.std.iso._20022.tech.xsd.pain_001_001;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XMLGregorianCalendarAsDateTime;
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
 * <p>Java class for GroupHeader32 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupHeader32">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max35Text"/>
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}ISODateTime"/>
 *         &lt;element name="Authstn" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Authorisation1Choice" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="NbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}Max15NumericText"/>
 *         &lt;element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}DecimalNumber" minOccurs="0"/>
 *         &lt;element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}PartyIdentification32"/>
 *         &lt;element name="FwdgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.001.03}BranchAndFinancialInstitutionIdentification4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader32", propOrder = {
    "msgId",
    "creDtTm",
    "authstns",
    "nbOfTxs",
    "ctrlSum",
    "initgPty",
    "fwdgAgt"
})
@Entity(name = "GroupHeader32")
@Table(name = "GROUPHEADER32")
@Inheritance(strategy = InheritanceType.JOINED)
public class GroupHeader32
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true)
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "Authstn")
    protected List<Authorisation1Choice> authstns;
    @XmlElement(name = "NbOfTxs", required = true)
    protected String nbOfTxs;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "InitgPty", required = true)
    protected PartyIdentification32 initgPty;
    @XmlElement(name = "FwdgAgt")
    protected BranchAndFinancialInstitutionIdentification4 fwdgAgt;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MSGID", length = 35)
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the authstns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authstns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthstns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Authorisation1Choice }
     * 
     * 
     */
    @OneToMany(targetEntity = Authorisation1Choice.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AUTHSTNS_GROUPHEADER32_HJID")
    public List<Authorisation1Choice> getAuthstns() {
        if (authstns == null) {
            authstns = new ArrayList<Authorisation1Choice>();
        }
        return this.authstns;
    }

    /**
     * 
     * 
     */
    public void setAuthstns(List<Authorisation1Choice> authstns) {
        this.authstns = authstns;
    }

    /**
     * Gets the value of the nbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NBOFTXS", length = 255)
    public String getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfTxs(String value) {
        this.nbOfTxs = value;
    }

    /**
     * Gets the value of the ctrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "CTRLSUM", precision = 18, scale = 17)
    public BigDecimal getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Sets the value of the ctrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32 }
     *     
     */
    @ManyToOne(targetEntity = PartyIdentification32 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "INITGPTY_GROUPHEADER32_HJID")
    public PartyIdentification32 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32 }
     *     
     */
    public void setInitgPty(PartyIdentification32 value) {
        this.initgPty = value;
    }

    /**
     * Gets the value of the fwdgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    @ManyToOne(targetEntity = BranchAndFinancialInstitutionIdentification4 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "FWDGAGT_GROUPHEADER32_HJID")
    public BranchAndFinancialInstitutionIdentification4 getFwdgAgt() {
        return fwdgAgt;
    }

    /**
     * Sets the value of the fwdgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public void setFwdgAgt(BranchAndFinancialInstitutionIdentification4 value) {
        this.fwdgAgt = value;
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
    @Column(name = "CREDTTMITEM")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreDtTmItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDateTime.class, this.getCreDtTm());
    }

    public void setCreDtTmItem(Date target) {
        setCreDtTm(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDateTime.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GroupHeader32)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GroupHeader32 that = ((GroupHeader32) object);
        {
            String lhsMsgId;
            lhsMsgId = this.getMsgId();
            String rhsMsgId;
            rhsMsgId = that.getMsgId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "msgId", lhsMsgId), LocatorUtils.property(thatLocator, "msgId", rhsMsgId), lhsMsgId, rhsMsgId)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsCreDtTm;
            lhsCreDtTm = this.getCreDtTm();
            XMLGregorianCalendar rhsCreDtTm;
            rhsCreDtTm = that.getCreDtTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creDtTm", lhsCreDtTm), LocatorUtils.property(thatLocator, "creDtTm", rhsCreDtTm), lhsCreDtTm, rhsCreDtTm)) {
                return false;
            }
        }
        {
            List<Authorisation1Choice> lhsAuthstns;
            lhsAuthstns = (((this.authstns!= null)&&(!this.authstns.isEmpty()))?this.getAuthstns():null);
            List<Authorisation1Choice> rhsAuthstns;
            rhsAuthstns = (((that.authstns!= null)&&(!that.authstns.isEmpty()))?that.getAuthstns():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authstns", lhsAuthstns), LocatorUtils.property(thatLocator, "authstns", rhsAuthstns), lhsAuthstns, rhsAuthstns)) {
                return false;
            }
        }
        {
            String lhsNbOfTxs;
            lhsNbOfTxs = this.getNbOfTxs();
            String rhsNbOfTxs;
            rhsNbOfTxs = that.getNbOfTxs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nbOfTxs", lhsNbOfTxs), LocatorUtils.property(thatLocator, "nbOfTxs", rhsNbOfTxs), lhsNbOfTxs, rhsNbOfTxs)) {
                return false;
            }
        }
        {
            BigDecimal lhsCtrlSum;
            lhsCtrlSum = this.getCtrlSum();
            BigDecimal rhsCtrlSum;
            rhsCtrlSum = that.getCtrlSum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ctrlSum", lhsCtrlSum), LocatorUtils.property(thatLocator, "ctrlSum", rhsCtrlSum), lhsCtrlSum, rhsCtrlSum)) {
                return false;
            }
        }
        {
            PartyIdentification32 lhsInitgPty;
            lhsInitgPty = this.getInitgPty();
            PartyIdentification32 rhsInitgPty;
            rhsInitgPty = that.getInitgPty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "initgPty", lhsInitgPty), LocatorUtils.property(thatLocator, "initgPty", rhsInitgPty), lhsInitgPty, rhsInitgPty)) {
                return false;
            }
        }
        {
            BranchAndFinancialInstitutionIdentification4 lhsFwdgAgt;
            lhsFwdgAgt = this.getFwdgAgt();
            BranchAndFinancialInstitutionIdentification4 rhsFwdgAgt;
            rhsFwdgAgt = that.getFwdgAgt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fwdgAgt", lhsFwdgAgt), LocatorUtils.property(thatLocator, "fwdgAgt", rhsFwdgAgt), lhsFwdgAgt, rhsFwdgAgt)) {
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
            String theMsgId;
            theMsgId = this.getMsgId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "msgId", theMsgId), currentHashCode, theMsgId);
        }
        {
            XMLGregorianCalendar theCreDtTm;
            theCreDtTm = this.getCreDtTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creDtTm", theCreDtTm), currentHashCode, theCreDtTm);
        }
        {
            List<Authorisation1Choice> theAuthstns;
            theAuthstns = (((this.authstns!= null)&&(!this.authstns.isEmpty()))?this.getAuthstns():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authstns", theAuthstns), currentHashCode, theAuthstns);
        }
        {
            String theNbOfTxs;
            theNbOfTxs = this.getNbOfTxs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nbOfTxs", theNbOfTxs), currentHashCode, theNbOfTxs);
        }
        {
            BigDecimal theCtrlSum;
            theCtrlSum = this.getCtrlSum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ctrlSum", theCtrlSum), currentHashCode, theCtrlSum);
        }
        {
            PartyIdentification32 theInitgPty;
            theInitgPty = this.getInitgPty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "initgPty", theInitgPty), currentHashCode, theInitgPty);
        }
        {
            BranchAndFinancialInstitutionIdentification4 theFwdgAgt;
            theFwdgAgt = this.getFwdgAgt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fwdgAgt", theFwdgAgt), currentHashCode, theFwdgAgt);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}