package com.pon.engine.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pon.engine.hibernate.entity.Student;

public class ReadStudent {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			session.beginTransaction();
			
			List<Student> std = session.createQuery("from Student").list();
			
			for(Student tempstd :std){
				System.out.println(tempstd);
			}
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally{
			factory.close();
		}

	}

}
