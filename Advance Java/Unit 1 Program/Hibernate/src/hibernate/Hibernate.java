
package hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Hibernate {
     
    static Session session;
    public static void insert(Student s){
        SessionFactory factory = NewHibernateUtil.getSessionFactory();
        session = factory.openSession();
        Transaction t = session.beginTransaction();
        session.save(s);
        t.commit();
        System.out.println("Successfully Data Inserted");
        session.close();
    }
 
    public static void main(String[] args) {
        Student d = new  Student(1,"bhautik","veraval");
        insert(d);
    }
    
}
