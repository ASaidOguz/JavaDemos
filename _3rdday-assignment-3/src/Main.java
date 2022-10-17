import business.CategoryManager;
import business.CourseManager;
import business.IManager;
import business.TeacherManager;
import core.logging.DataBaseLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import core.logging.MailLogger;
import dataAccess.JbdcCategoryDao;
import dataAccess.JbdcCourseDao;
import dataAccess.JbdcTeacherDao;
import entities.Course;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ILogger[]loggers={new DataBaseLogger(),new FileLogger(),new MailLogger()};
        IManager[]managers={
                new CategoryManager(new JbdcCategoryDao(), List.of(loggers)),
                new CourseManager(new JbdcCourseDao(), List.of(loggers)),
                new TeacherManager(new JbdcTeacherDao(), List.of(loggers))
        };

        Course course=new Course(
                "Java",
                2.10,
                1,
                1,
                "Programlama",
                1,
                "Ahmet Said"
        );
        Course course1=new Course(
                "Go-Lang",
                2.10,
                1,
                1,
                "Fonksiyonel Programlama",
                1,
                "Murat Selam"
        );
        Course course2=new Course(
                "Typescript",
                2.10,
                1,
                1,
                "Web Dizayn",
                1,
                "Kemal Sayın"
        );


       for (IManager manager:managers){
           manager.add(course);
           manager.add(course1);
       }
    }
}