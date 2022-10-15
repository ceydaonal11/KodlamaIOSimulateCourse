package dataAccess.Hibernate;

import dataAccess.CourseDao;
import entities.Base;
import entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi ");

    }
}
