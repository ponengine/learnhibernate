package com.pon.engine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pon.engine.hibernate.entity.Student;

public class QueryStudent {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			System.out.println("Create new student object.......");
			Student tempStudent = new Student("Pon","Ssnk","4");
			
			session.beginTransaction();
			
			System.out.println("Saving the student.....");
			session.save(tempStudent);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally{
			factory.close();
		}
	}

}
