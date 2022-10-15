package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import dataAccess.InstructorDao;
import entities.Category;
import entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        System.out.println("Eğitmen eklendi. ");
        instructorDao.add(instructor);

        for (Logger logger : loggers){
            logger.log(instructor.getName());
        }
    }
}
