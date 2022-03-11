/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@Entity
@Table(name = "test_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TestTable.findAll", query = "SELECT t FROM TestTable t"),
    @NamedQuery(name = "TestTable.findById", query = "SELECT t FROM TestTable t WHERE t.id = :id"),
    @NamedQuery(name = "TestTable.findByName", query = "SELECT t FROM TestTable t WHERE t.name = :name"),
    @NamedQuery(name = "TestTable.findByPrice", query = "SELECT t FROM TestTable t WHERE t.price = :price"),
    @NamedQuery(name = "TestTable.findByDate", query = "SELECT t FROM TestTable t WHERE t.date = :date")})
public class TestTable implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private int price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;

    public TestTable() {
    }

    public TestTable(Integer id) {
        this.id = id;
    }

    public TestTable(Integer id, String name, int price, Date date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof TestTable)) {
            return false;
        }
        TestTable other = (TestTable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TestTable[ id=" + id + " ]";
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
