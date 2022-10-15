import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import business.StudentManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.CategoryDao;
import dataAccess.Hibernate.HibernateCategoryDao;
import dataAccess.Hibernate.HibernateCourseDao;
import dataAccess.Hibernate.HibernateInstructorDao;
import dataAccess.Hibernate.HibernateStudentDao;
import dataAccess.Jdbc.JdbcCategoryDao;
import dataAccess.Jdbc.JdbcCourseDao;
import dataAccess.Jdbc.JdbcInstructorDao;
import dataAccess.Jdbc.JdbcStudentDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import entities.Student;

public class Main {

    public static void main(String[] args) throws Exception {
        /*
        kodlama.io web sitesinin ana sayfasında bulunan eğitmen,kategori ve kurs bölümlerini katmanlı mimaride kodlamak istiyoruz.
        Önceki derste yaptığımız tekniklerle hem jdbc hem de hibernate üzerinde yazmış gibi simüle ediniz.
        Çoklu loglama yapısını simule ediniz.Aşağıdaki isterleri gerçekleştiriniz.
        Kurs ismi tekrar edemez
        Kategori ismi tekrar edemez
        Bir kursun fiyatı 0 dan küçük olamaz
         */

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Ceyda Önal");

        StudentManager studentManager1 = new StudentManager(new HibernateStudentDao(), loggers);
        StudentManager studentManager2 = new StudentManager(new JdbcStudentDao(), loggers);
        studentManager1.add(student1);
        studentManager2.add(student1);

        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setName("Engin Demiroğ");

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
        InstructorManager instructorManager1 = new InstructorManager(new JdbcInstructorDao(),loggers);
        instructorManager.add(instructor);
        instructorManager1.add(instructor);

        Category category = new Category();
        category.setId(1);
        category.setName("Yazılım");

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        CategoryManager categoryManager1 = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.Add(category);

        Course course = new Course();
        course.setName("Java Egitimi");
        course.setInfo("2022 Yazılım Geliştirici Yetiştirme Kampı JAVA");
        CourseManager courseManager =new CourseManager(new HibernateCourseDao(), loggers);
        CourseManager courseManager2 =new CourseManager(new JdbcCourseDao(), loggers);
        courseManager.Add(course);
    }

}
