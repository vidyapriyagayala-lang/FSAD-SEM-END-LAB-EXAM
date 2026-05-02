package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Date;

public class ClientDemo 
{
    public static void main(String[] args) 
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();

        // I. Insert record using persistent object
        Transaction tx1 = session.beginTransaction();

        Payment p = new Payment("Online Shopping", new Date(), "Completed", 2500.75, "UPI");
        session.save(p);

        tx1.commit();
        System.out.println("Payment inserted successfully!");

        // II. Delete record using HQL with named parameter
        Transaction tx2 = session.beginTransaction();

        String hql = "delete from Payment where id = :pid";
        Query query = session.createQuery(hql);
        query.setParameter("pid", 1);

        int result = query.executeUpdate();
        tx2.commit();

        System.out.println(result + " record(s) deleted successfully!");

        session.close();
        sf.close();
    }
}
