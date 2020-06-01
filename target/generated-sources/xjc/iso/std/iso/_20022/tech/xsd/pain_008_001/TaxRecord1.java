//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.01 at 02:41:38 PM IST 
//


package iso.std.iso._20022.tech.xsd.pain_008_001;

import java.io.Serializable;
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
 * <p>Java class for TaxRecord1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxRecord1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="Ctgy" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="CtgyDtls" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="DbtrSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="CertId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="FrmsCd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max35Text" minOccurs="0"/>
 *         &lt;element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}TaxPeriod1" minOccurs="0"/>
 *         &lt;element name="TaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}TaxAmount1" minOccurs="0"/>
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max140Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRecord1", propOrder = {
    "tp",
    "ctgy",
    "ctgyDtls",
    "dbtrSts",
    "certId",
    "frmsCd",
    "prd",
    "taxAmt",
    "addtlInf"
})
@Entity(name = "TaxRecord1")
@Table(name = "TAXRECORD1_0")
@Inheritance(strategy = InheritanceType.JOINED)
public class TaxRecord1
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Ctgy")
    protected String ctgy;
    @XmlElement(name = "CtgyDtls")
    protected String ctgyDtls;
    @XmlElement(name = "DbtrSts")
    protected String dbtrSts;
    @XmlElement(name = "CertId")
    protected String certId;
    @XmlElement(name = "FrmsCd")
    protected String frmsCd;
    @XmlElement(name = "Prd")
    protected TaxPeriod1 prd;
    @XmlElement(name = "TaxAmt")
    protected TaxAmount1 taxAmt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
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
     * Gets the value of the ctgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CTGY", length = 35)
    public String getCtgy() {
        return ctgy;
    }

    /**
     * Sets the value of the ctgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgy(String value) {
        this.ctgy = value;
    }

    /**
     * Gets the value of the ctgyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CTGYDTLS", length = 35)
    public String getCtgyDtls() {
        return ctgyDtls;
    }

    /**
     * Sets the value of the ctgyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgyDtls(String value) {
        this.ctgyDtls = value;
    }

    /**
     * Gets the value of the dbtrSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DBTRSTS", length = 35)
    public String getDbtrSts() {
        return dbtrSts;
    }

    /**
     * Sets the value of the dbtrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtrSts(String value) {
        this.dbtrSts = value;
    }

    /**
     * Gets the value of the certId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CERTID", length = 35)
    public String getCertId() {
        return certId;
    }

    /**
     * Sets the value of the certId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertId(String value) {
        this.certId = value;
    }

    /**
     * Gets the value of the frmsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FRMSCD", length = 35)
    public String getFrmsCd() {
        return frmsCd;
    }

    /**
     * Sets the value of the frmsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrmsCd(String value) {
        this.frmsCd = value;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPeriod1 }
     *     
     */
    @ManyToOne(targetEntity = TaxPeriod1 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PRD_TAXRECORD1_0_HJID")
    public TaxPeriod1 getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPeriod1 }
     *     
     */
    public void setPrd(TaxPeriod1 value) {
        this.prd = value;
    }

    /**
     * Gets the value of the taxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmount1 }
     *     
     */
    @ManyToOne(targetEntity = TaxAmount1 .class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TAXAMT_TAXRECORD1_0_HJID")
    public TaxAmount1 getTaxAmt() {
        return taxAmt;
    }

    /**
     * Sets the value of the taxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmount1 }
     *     
     */
    public void setTaxAmt(TaxAmount1 value) {
        this.taxAmt = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ADDTLINF", length = 140)
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
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
        if (!(object instanceof TaxRecord1)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaxRecord1 that = ((TaxRecord1) object);
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
            String lhsCtgy;
            lhsCtgy = this.getCtgy();
            String rhsCtgy;
            rhsCtgy = that.getCtgy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ctgy", lhsCtgy), LocatorUtils.property(thatLocator, "ctgy", rhsCtgy), lhsCtgy, rhsCtgy)) {
                return false;
            }
        }
        {
            String lhsCtgyDtls;
            lhsCtgyDtls = this.getCtgyDtls();
            String rhsCtgyDtls;
            rhsCtgyDtls = that.getCtgyDtls();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ctgyDtls", lhsCtgyDtls), LocatorUtils.property(thatLocator, "ctgyDtls", rhsCtgyDtls), lhsCtgyDtls, rhsCtgyDtls)) {
                return false;
            }
        }
        {
            String lhsDbtrSts;
            lhsDbtrSts = this.getDbtrSts();
            String rhsDbtrSts;
            rhsDbtrSts = that.getDbtrSts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dbtrSts", lhsDbtrSts), LocatorUtils.property(thatLocator, "dbtrSts", rhsDbtrSts), lhsDbtrSts, rhsDbtrSts)) {
                return false;
            }
        }
        {
            String lhsCertId;
            lhsCertId = this.getCertId();
            String rhsCertId;
            rhsCertId = that.getCertId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certId", lhsCertId), LocatorUtils.property(thatLocator, "certId", rhsCertId), lhsCertId, rhsCertId)) {
                return false;
            }
        }
        {
            String lhsFrmsCd;
            lhsFrmsCd = this.getFrmsCd();
            String rhsFrmsCd;
            rhsFrmsCd = that.getFrmsCd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frmsCd", lhsFrmsCd), LocatorUtils.property(thatLocator, "frmsCd", rhsFrmsCd), lhsFrmsCd, rhsFrmsCd)) {
                return false;
            }
        }
        {
            TaxPeriod1 lhsPrd;
            lhsPrd = this.getPrd();
            TaxPeriod1 rhsPrd;
            rhsPrd = that.getPrd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prd", lhsPrd), LocatorUtils.property(thatLocator, "prd", rhsPrd), lhsPrd, rhsPrd)) {
                return false;
            }
        }
        {
            TaxAmount1 lhsTaxAmt;
            lhsTaxAmt = this.getTaxAmt();
            TaxAmount1 rhsTaxAmt;
            rhsTaxAmt = that.getTaxAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxAmt", lhsTaxAmt), LocatorUtils.property(thatLocator, "taxAmt", rhsTaxAmt), lhsTaxAmt, rhsTaxAmt)) {
                return false;
            }
        }
        {
            String lhsAddtlInf;
            lhsAddtlInf = this.getAddtlInf();
            String rhsAddtlInf;
            rhsAddtlInf = that.getAddtlInf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addtlInf", lhsAddtlInf), LocatorUtils.property(thatLocator, "addtlInf", rhsAddtlInf), lhsAddtlInf, rhsAddtlInf)) {
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
            String theCtgy;
            theCtgy = this.getCtgy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ctgy", theCtgy), currentHashCode, theCtgy);
        }
        {
            String theCtgyDtls;
            theCtgyDtls = this.getCtgyDtls();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ctgyDtls", theCtgyDtls), currentHashCode, theCtgyDtls);
        }
        {
            String theDbtrSts;
            theDbtrSts = this.getDbtrSts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dbtrSts", theDbtrSts), currentHashCode, theDbtrSts);
        }
        {
            String theCertId;
            theCertId = this.getCertId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certId", theCertId), currentHashCode, theCertId);
        }
        {
            String theFrmsCd;
            theFrmsCd = this.getFrmsCd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frmsCd", theFrmsCd), currentHashCode, theFrmsCd);
        }
        {
            TaxPeriod1 thePrd;
            thePrd = this.getPrd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prd", thePrd), currentHashCode, thePrd);
        }
        {
            TaxAmount1 theTaxAmt;
            theTaxAmt = this.getTaxAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxAmt", theTaxAmt), currentHashCode, theTaxAmt);
        }
        {
            String theAddtlInf;
            theAddtlInf = this.getAddtlInf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addtlInf", theAddtlInf), currentHashCode, theAddtlInf);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
