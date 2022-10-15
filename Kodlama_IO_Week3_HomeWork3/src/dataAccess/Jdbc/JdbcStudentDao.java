package dataAccess.Jdbc;

import dataAccess.StudentDao;
import entities.Base;
import entities.Student;


public class JdbcStudentDao implements StudentDao {
    @Override
    public void add(Student student) {
        System.out.println("JDBC ile veritabanına eklendi ");
    }

}
