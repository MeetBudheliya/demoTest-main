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
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface demoBeenLocal {
    
    public Collection<TestTable> getdata();
    public void insert(String name,Integer price,Date date);
    public void update(Integer id,String name,Integer price,Date date);
    public void delete(Integer id);
    
    public Collection<DemoTbl> getAlldata();
    public void insertData(String name,Integer price);
    public void updateData(Integer id,String name,Integer price);
    public void deleteData(Integer id);
    
}
