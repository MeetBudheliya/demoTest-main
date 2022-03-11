/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "demoTbl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DemoTbl.findAll", query = "SELECT d FROM DemoTbl d"),
    @NamedQuery(name = "DemoTbl.findById", query = "SELECT d FROM DemoTbl d WHERE d.id = :id"),
    @NamedQuery(name = "DemoTbl.findByName", query = "SELECT d FROM DemoTbl d WHERE d.name = :name"),
    @NamedQuery(name = "DemoTbl.findByPrice", query = "SELECT d FROM DemoTbl d WHERE d.price = :price")})
public class DemoTbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private int price;

    public DemoTbl() {
    }

    public DemoTbl(Integer id) {
        this.id = id;
    }

    public DemoTbl(Integer id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
        if (!(object instanceof DemoTbl)) {
            return false;
        }
        DemoTbl other = (DemoTbl) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DemoTbl[ id=" + id + " ]";
    }
    
}
