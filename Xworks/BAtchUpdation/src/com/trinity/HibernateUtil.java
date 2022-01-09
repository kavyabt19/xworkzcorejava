package com.trinity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.trinity.model.Person;

public class HibernateUtil {
	private static SessionFactory factory;

	static {
		try {
			// Create StandardServiceRegistry
			Configuration config = new Configuration().configure();
			config.addAnnotatedClass(Person.class);
			factory = config.buildSessionFactory();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Utility method to return SessionFactory
	public static Session getSession() {
		return factory.openSession();
	}
}