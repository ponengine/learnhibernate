package com.pon.engine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pon.engine.hibernate.entity.Student;

public class Primarykey {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try{
			System.out.println("Create 3 student object.......");
			Student tempStudent1 = new Student("Da","Mnr","4");
			Student tempStudent2 = new Student("Dew","Nyd","4");
			Student tempStudent3 = new Student("Ice","Mns","4");
			
			
			session.beginTransaction();
			
			System.out.println("Saving the student.....");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally{
			factory.close();
		}

	}

}
