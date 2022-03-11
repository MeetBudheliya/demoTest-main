/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package been;

import entity.DemoTbl;
import entity.TestTable;
import java.util.Collection;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Stateless
public class demoBeen implements demoBeenLocal {
    
    @PersistenceContext(unitName = "demoTestPU")
    EntityManager em;

    @Override
    public Collection<TestTable> getdata() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Collection<TestTable> customers = em.createNamedQuery("TestTable.findAll").getResultList();
        return customers;
    }

    @Override
    public void insert(String name, Integer price, Date date) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        TestTable c = new TestTable();
        c.setName(name);
        c.setPrice(price);
        c.setDate(date);
        em.persist(c);
    }

    @Override
    public void update(Integer id, String name, Integer price, Date date) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        TestTable c = em.find(TestTable.class, id);
        c.setName(name);
        c.setPrice(price);
        c.setDate(date);
        em.merge(c);
    }

    @Override
    public void delete(Integer id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        TestTable c = em.find(TestTable.class, id);
        em.remove(c);
    }

    @Override
    public Collection<DemoTbl> getAlldata() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertData(String name, Integer price) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DemoTbl c = new DemoTbl();
        
        c.setName(name);
        c.setPrice(price);
        em.persist(c);
    }

    @Override
    public void updateData(Integer id, String name, Integer price) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DemoTbl c = em.find(DemoTbl.class, id);
        c.setName(name);
        c.setPrice(price);
        em.merge(c);
    }

    @Override
    public void deleteData(Integer id) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       DemoTbl c = em.find(DemoTbl.class, id);
       em.remove(c);
    }
}
