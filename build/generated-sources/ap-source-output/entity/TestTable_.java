package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-02-08T12:12:34")
@StaticMetamodel(TestTable.class)
public class TestTable_ { 

    public static volatile SingularAttribute<TestTable, Date> date;
    public static volatile SingularAttribute<TestTable, Integer> price;
    public static volatile SingularAttribute<TestTable, String> name;
    public static volatile SingularAttribute<TestTable, Integer> id;

}