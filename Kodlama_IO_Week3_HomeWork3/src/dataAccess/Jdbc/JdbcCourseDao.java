package dataAccess.Jdbc;

import dataAccess.CourseDao;
import entities.Base;
import entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile veritabanına eklendi ");

    }
}
