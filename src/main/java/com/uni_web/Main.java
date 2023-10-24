package com.uni_web;

import com.uni_web.service.course.Association;
import com.uni_web.moudle.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session =sessionFactory.openSession();
        Transaction tx=session.beginTransaction();

        Course course = new Course(20425,
                                   "Probability and an introduction to statistics for computer science",
                                   "הסתברות ומבוא לסטטיסטיקה למדעי המחשב", 5, 0, 0, 0, true, true, true,
                                   Association.MATH, Association.SCIENCE, null, true,
                                   null
        );

        session.save(course);
        tx.commit();
        System.out.println("saved course "+course.getCourseTitleDisplay());

    }




}
