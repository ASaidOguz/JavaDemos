package business;

import core.logging.ILogger;
import dataAccess.ITeacherDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class TeacherManager implements IManager {
    private ITeacherDao _iteacherdao;
    private List<ILogger> loggers;

    private List<String> teachernames=new ArrayList<>();
    public TeacherManager(ITeacherDao _iteacherdao,List<ILogger>loggers){
                 this._iteacherdao=_iteacherdao;
                 this.loggers=loggers;
    }
    public void add(Course course) throws Exception {
         if (teachernames.size()==0){
             teachernames.add(course.getTeachername());
             _iteacherdao.add(course);
             for(ILogger logger:loggers){
                 logger.log(course.getTeachername());
             }
         }else{
             for(String name :teachernames){
                 if(name.equals(course.getTeachername())){
                    throw new Exception("Girilen eğitmen mevcut : "+ course.getTeachername());

                 }

                 }
                   teachernames.add(course.getTeachername());
                  _iteacherdao.add(course);
                  for(ILogger logger:loggers){
                     logger.log(course.getTeachername());

                  }

               }

             }
         }



