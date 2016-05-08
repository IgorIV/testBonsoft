/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonsoft.test;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author igor
 */
@Entity
@Table(name = "stores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stores.findAll", query = "SELECT s FROM Stores s"),
    @NamedQuery(name = "Stores.findById", query = "SELECT s FROM Stores s WHERE s.id = :id"),
    @NamedQuery(name = "Stores.findByStoreNumber", query = "SELECT s FROM Stores s WHERE s.storeNumber = :storeNumber"),
    @NamedQuery(name = "Stores.findByDescr", query = "SELECT s FROM Stores s WHERE s.descr = :descr"),
    @NamedQuery(name = "Stores.findByAddress", query = "SELECT s FROM Stores s WHERE s.address = :address"),
    @NamedQuery(name = "Stores.findByCheckoutsQty", query = "SELECT s FROM Stores s WHERE s.checkoutsQty = :checkoutsQty"),
    @NamedQuery(name = "Stores.findByTotalSq", query = "SELECT s FROM Stores s WHERE s.totalSq = :totalSq"),
    @NamedQuery(name = "Stores.findByTradeSq", query = "SELECT s FROM Stores s WHERE s.tradeSq = :tradeSq"),
    @NamedQuery(name = "Stores.findByNightRecPossible", query = "SELECT s FROM Stores s WHERE s.nightRecPossible = :nightRecPossible"),
    @NamedQuery(name = "Stores.findByWrkMonStart", query = "SELECT s FROM Stores s WHERE s.wrkMonStart = :wrkMonStart"),
    @NamedQuery(name = "Stores.findByWrkMonEnd", query = "SELECT s FROM Stores s WHERE s.wrkMonEnd = :wrkMonEnd"),
    @NamedQuery(name = "Stores.findByWrkTueStart", query = "SELECT s FROM Stores s WHERE s.wrkTueStart = :wrkTueStart"),
    @NamedQuery(name = "Stores.findByWrkTueEnd", query = "SELECT s FROM Stores s WHERE s.wrkTueEnd = :wrkTueEnd"),
    @NamedQuery(name = "Stores.findByWrkWedStart", query = "SELECT s FROM Stores s WHERE s.wrkWedStart = :wrkWedStart"),
    @NamedQuery(name = "Stores.findByWrkWedEnd", query = "SELECT s FROM Stores s WHERE s.wrkWedEnd = :wrkWedEnd"),
    @NamedQuery(name = "Stores.findByWrkThuStart", query = "SELECT s FROM Stores s WHERE s.wrkThuStart = :wrkThuStart"),
    @NamedQuery(name = "Stores.findByWrkThuEnd", query = "SELECT s FROM Stores s WHERE s.wrkThuEnd = :wrkThuEnd"),
    @NamedQuery(name = "Stores.findByWrkFriStart", query = "SELECT s FROM Stores s WHERE s.wrkFriStart = :wrkFriStart"),
    @NamedQuery(name = "Stores.findByWrkFriEnd", query = "SELECT s FROM Stores s WHERE s.wrkFriEnd = :wrkFriEnd"),
    @NamedQuery(name = "Stores.findByWrkSatStart", query = "SELECT s FROM Stores s WHERE s.wrkSatStart = :wrkSatStart"),
    @NamedQuery(name = "Stores.findByWrkSatEnd", query = "SELECT s FROM Stores s WHERE s.wrkSatEnd = :wrkSatEnd"),
    @NamedQuery(name = "Stores.findByWrkSunStart", query = "SELECT s FROM Stores s WHERE s.wrkSunStart = :wrkSunStart"),
    @NamedQuery(name = "Stores.findByWrkSunEnd", query = "SELECT s FROM Stores s WHERE s.wrkSunEnd = :wrkSunEnd"),
    @NamedQuery(name = "Stores.findByCr", query = "SELECT s FROM Stores s WHERE s.cr = :cr"),
    @NamedQuery(name = "Stores.findByLu", query = "SELECT s FROM Stores s WHERE s.lu = :lu"),
    @NamedQuery(name = "Stores.findByEn", query = "SELECT s FROM Stores s WHERE s.en = :en")})
public class Stores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "store_number")
    private String storeNumber;
    @Column(name = "descr")
    private String descr;
    @Column(name = "address")
    private String address;
    @Column(name = "checkouts_qty")
    private Integer checkoutsQty;
    @Column(name = "total_sq")
    private Integer totalSq;
    @Column(name = "trade_sq")
    private Integer tradeSq;
    @Column(name = "night_rec_possible")
    private Boolean nightRecPossible;
    @Column(name = "wrk_mon_start")
    @Temporal(TemporalType.TIME)
    private Date wrkMonStart;
    @Column(name = "wrk_mon_end")
    @Temporal(TemporalType.TIME)
    private Date wrkMonEnd;
    @Column(name = "wrk_tue_start")
    @Temporal(TemporalType.TIME)
    private Date wrkTueStart;
    @Column(name = "wrk_tue_end")
    @Temporal(TemporalType.TIME)
    private Date wrkTueEnd;
    @Column(name = "wrk_wed_start")
    @Temporal(TemporalType.TIME)
    private Date wrkWedStart;
    @Column(name = "wrk_wed_end")
    @Temporal(TemporalType.TIME)
    private Date wrkWedEnd;
    @Column(name = "wrk_thu_start")
    @Temporal(TemporalType.TIME)
    private Date wrkThuStart;
    @Column(name = "wrk_thu_end")
    @Temporal(TemporalType.TIME)
    private Date wrkThuEnd;
    @Column(name = "wrk_fri_start")
    @Temporal(TemporalType.TIME)
    private Date wrkFriStart;
    @Column(name = "wrk_fri_end")
    @Temporal(TemporalType.TIME)
    private Date wrkFriEnd;
    @Column(name = "wrk_sat_start")
    @Temporal(TemporalType.TIME)
    private Date wrkSatStart;
    @Column(name = "wrk_sat_end")
    @Temporal(TemporalType.TIME)
    private Date wrkSatEnd;
    @Column(name = "wrk_sun_start")
    @Temporal(TemporalType.TIME)
    private Date wrkSunStart;
    @Column(name = "wrk_sun_end")
    @Temporal(TemporalType.TIME)
    private Date wrkSunEnd;
    @Basic(optional = false)
    @Column(name = "cr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cr;
    @Basic(optional = false)
    @Column(name = "lu")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lu;
    @Column(name = "en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date en;
    @JoinColumn(name = "format_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Orgs orgId;


    public Stores() {
    }

    public Stores(Long id) {
        this.id = id;
    }

    public Stores(Long id, Date cr, Date lu) {
        this.id = id;
        this.cr = cr;
        this.lu = lu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCheckoutsQty() {
        return checkoutsQty;
    }

    public void setCheckoutsQty(Integer checkoutsQty) {
        this.checkoutsQty = checkoutsQty;
    }

    public Integer getTotalSq() {
        return totalSq;
    }

    public void setTotalSq(Integer totalSq) {
        this.totalSq = totalSq;
    }

    public Integer getTradeSq() {
        return tradeSq;
    }

    public void setTradeSq(Integer tradeSq) {
        this.tradeSq = tradeSq;
    }

    public Boolean getNightRecPossible() {
        return nightRecPossible;
    }

    public void setNightRecPossible(Boolean nightRecPossible) {
        this.nightRecPossible = nightRecPossible;
    }

    public Date getWrkMonStart() {
        return wrkMonStart;
    }

    public void setWrkMonStart(Date wrkMonStart) {
        this.wrkMonStart = wrkMonStart;
    }

    public Date getWrkMonEnd() {
        return wrkMonEnd;
    }

    public void setWrkMonEnd(Date wrkMonEnd) {
        this.wrkMonEnd = wrkMonEnd;
    }

    public Date getWrkTueStart() {
        return wrkTueStart;
    }

    public void setWrkTueStart(Date wrkTueStart) {
        this.wrkTueStart = wrkTueStart;
    }

    public Date getWrkTueEnd() {
        return wrkTueEnd;
    }

    public void setWrkTueEnd(Date wrkTueEnd) {
        this.wrkTueEnd = wrkTueEnd;
    }

    public Date getWrkWedStart() {
        return wrkWedStart;
    }

    public void setWrkWedStart(Date wrkWedStart) {
        this.wrkWedStart = wrkWedStart;
    }

    public Date getWrkWedEnd() {
        return wrkWedEnd;
    }

    public void setWrkWedEnd(Date wrkWedEnd) {
        this.wrkWedEnd = wrkWedEnd;
    }

    public Date getWrkThuStart() {
        return wrkThuStart;
    }

    public void setWrkThuStart(Date wrkThuStart) {
        this.wrkThuStart = wrkThuStart;
    }

    public Date getWrkThuEnd() {
        return wrkThuEnd;
    }

    public void setWrkThuEnd(Date wrkThuEnd) {
        this.wrkThuEnd = wrkThuEnd;
    }

    public Date getWrkFriStart() {
        return wrkFriStart;
    }

    public void setWrkFriStart(Date wrkFriStart) {
        this.wrkFriStart = wrkFriStart;
    }

    public Date getWrkFriEnd() {
        return wrkFriEnd;
    }

    public void setWrkFriEnd(Date wrkFriEnd) {
        this.wrkFriEnd = wrkFriEnd;
    }

    public Date getWrkSatStart() {
        return wrkSatStart;
    }

    public void setWrkSatStart(Date wrkSatStart) {
        this.wrkSatStart = wrkSatStart;
    }

    public Date getWrkSatEnd() {
        return wrkSatEnd;
    }

    public void setWrkSatEnd(Date wrkSatEnd) {
        this.wrkSatEnd = wrkSatEnd;
    }

    public Date getWrkSunStart() {
        return wrkSunStart;
    }

    public void setWrkSunStart(Date wrkSunStart) {
        this.wrkSunStart = wrkSunStart;
    }

    public Date getWrkSunEnd() {
        return wrkSunEnd;
    }

    public void setWrkSunEnd(Date wrkSunEnd) {
        this.wrkSunEnd = wrkSunEnd;
    }

    public Date getCr() {
        return cr;
    }

    public void setCr(Date cr) {
        this.cr = cr;
    }

    public Date getLu() {
        return lu;
    }

    public void setLu(Date lu) {
        this.lu = lu;
    }

    public Date getEn() {
        return en;
    }

    public void setEn(Date en) {
        this.en = en;
    }

   
    public Orgs getOrgId() {
        return orgId;
    }

    public void setOrgId(Orgs orgId) {
        this.orgId = orgId;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stores)) {
            return false;
        }
        Stores other = (Stores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getDescr();
    }
    
}
