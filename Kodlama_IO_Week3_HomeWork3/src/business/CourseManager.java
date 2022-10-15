package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import dataAccess.CourseDao;
import entities.Category;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers){
        this.courseDao=courseDao;
        this.loggers = loggers;
    }

    List<String> courseNames = new ArrayList<String>();

    public void Add(Course course) throws Exception {

        for (String courseName : courseNames) {
            if (courseName==course.getName()) {
                throw new Exception("Bu isimde bir kurs zaten mevcut!");
            }
        }

        if (course.getPrice()<0) {
            throw new Exception("Kurs ucreti 0 veya daha fazla olmali");
        }

        courseNames.add(course.getName());
        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getName() + " kursu");
        }
    };
}
