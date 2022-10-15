package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import dataAccess.StudentDao;
import entities.Category;
import entities.Student;

public class StudentManager {
    private StudentDao studentDao;
    private Logger[] loggers;

    public StudentManager(StudentDao studentDao, Logger[] loggers) {
        this.studentDao = studentDao;
        this.loggers = loggers;
    }

    public void add(Student student){
        System.out.println("Ögrenci eklendi");
        studentDao.add(student);

        for (Logger logger : loggers) {
            logger.log(student.getName());
        }
    }
}
