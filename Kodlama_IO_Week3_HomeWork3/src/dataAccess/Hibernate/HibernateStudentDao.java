package dataAccess.Hibernate;

import dataAccess.StudentDao;
import entities.Base;
import entities.Student;

public class HibernateStudentDao implements StudentDao {
    @Override
    public void add(Student student) {
        System.out.println("Hibernate ile veritabanına eklendi ");
    }
}
