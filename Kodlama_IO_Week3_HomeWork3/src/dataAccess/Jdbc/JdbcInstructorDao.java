package dataAccess.Jdbc;

import dataAccess.InstructorDao;
import entities.Base;
import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eklendi ");
    }
}
