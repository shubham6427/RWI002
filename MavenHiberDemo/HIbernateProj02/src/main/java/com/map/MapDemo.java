package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.out.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// Question 1............

		Question q1 = new Question();
		q1.setQuestionId(123);
		q1.setQuestion("What is java");

		Answer ans1 = new Answer();
		ans1.setAnswerId(12);
		ans1.setAnswer("Java is a Programming language");
		q1.setAnswer(ans1);

		// Second Question......

		Question q2 = new Question();
		q2.setQuestionId(124);
		q2.setQuestion("What is HTML");

		Answer ans2 = new Answer();
		ans2.setAnswerId(13);
		ans2.setAnswer("HTML is Hyper Text Markup Language");
		q2.setAnswer(ans2);

		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		s.save(q1);
		s.save(q2);

		s.save(ans1);
		s.save(ans2);

		tx.commit();
		s.close();
		factory.close();

	}

}
