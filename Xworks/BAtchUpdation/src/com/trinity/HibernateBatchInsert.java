package com.trinity;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.trinity.model.Person;

public class HibernateBatchInsert {

	public static void main(String[] args) {
		Transaction tx = null;
		int batchSize = 25;
		try (Session session = HibernateUtil.getSession()) {
			tx = session.beginTransaction();
			for (int i = 1; i <= 10; i++) {
				Person person = new Person();
				person.setFirstName("kavya_" + i);
				person.setLastName("bt" + i);
				session.persist(person);
				if (i > 0 && i % batchSize == 0) {
					System.out.println("flush and clear the session");

					session.flush();
					session.clear();
				}
			}
			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.isActive())
				tx.rollback();
			throw e;
		}
	}
}