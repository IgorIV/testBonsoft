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
@Table(name = "orgs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orgs.findAll", query = "SELECT o FROM Orgs o"),
    @NamedQuery(name = "Orgs.findById", query = "SELECT o FROM Orgs o WHERE o.id = :id"),
    @NamedQuery(name = "Orgs.findByName", query = "SELECT o FROM Orgs o WHERE o.name = :name"),
    @NamedQuery(name = "Orgs.findByCr", query = "SELECT o FROM Orgs o WHERE o.cr = :cr"),
    @NamedQuery(name = "Orgs.findByLu", query = "SELECT o FROM Orgs o WHERE o.lu = :lu"),
    @NamedQuery(name = "Orgs.findByEn", query = "SELECT o FROM Orgs o WHERE o.en = :en"),
    @NamedQuery(name = "Orgs.findByActiveFrom", query = "SELECT o FROM Orgs o WHERE o.activeFrom = :activeFrom"),
    @NamedQuery(name = "Orgs.findByActiveTill", query = "SELECT o FROM Orgs o WHERE o.activeTill = :activeTill")})
public class Orgs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "cr")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cr;
    @Column(name = "lu")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lu;
    @Column(name = "en")
    @Temporal(TemporalType.TIMESTAMP)
    private Date en;
    @Column(name = "active_from")
    @Temporal(TemporalType.DATE)
    private Date activeFrom;
    @Column(name = "active_till")
    @Temporal(TemporalType.DATE)
    private Date activeTill;
    

    public Orgs() {
    }

    public Orgs(Long id) {
        this.id = id;
    }

    public Orgs(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getActiveFrom() {
        return activeFrom;
    }

    public void setActiveFrom(Date activeFrom) {
        this.activeFrom = activeFrom;
    }

    public Date getActiveTill() {
        return activeTill;
    }

    public void setActiveTill(Date activeTill) {
        this.activeTill = activeTill;
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
        if (!(object instanceof Orgs)) {
            return false;
        }
        Orgs other = (Orgs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
}
