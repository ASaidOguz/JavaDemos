package business;

import core.logging.ILogger;
import dataAccess.ICourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager implements IManager {
    private ICourseDao _icoursedao;
    private List<ILogger> loggers;

    private  List<String> coursenames=new ArrayList<>();

    //Coursemanager contructor
    public CourseManager(ICourseDao _icoursedao,List<ILogger>loggers){
        this._icoursedao=_icoursedao;
        this.loggers=loggers;
    }
    //This function adds course
    public void add(Course course) throws Exception {
         nameValidator(course);
         priceValidator(course);
         coursenames.add(course.getCoursename());
        _icoursedao.add(course);

        for(ILogger logger:loggers) {
            logger.log(course.getCoursename());
                                    }
        }

    //This function validates the course name ;
    private void nameValidator(Course course)throws Exception{
        if(course.getCoursename().equals("")){
            throw new Exception("Kurs ismi boş olamaz");
        }
        if(coursenames.size()==0){
            coursenames.add(course.getCoursename());
          }else{
        for(String coursename:coursenames){
            if(coursename.equals(course.getCoursename())){
                throw new Exception("Girilen kurs mevcut : "+ course.getCoursename());
            }
          }
        }
    }
    //This function validate the course price;
    private void priceValidator(Course course)throws Exception{
        if(course.getCourseprice()<=0){
            throw new Exception("Kursun fiyatı sıfır veya sıfırdan küçük olamaz : " + course.getCourseprice());
        }
    }
}
