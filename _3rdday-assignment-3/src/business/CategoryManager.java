package business;

import core.logging.ILogger;
import dataAccess.ICategoryDao;
import entities.Category;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements IManager{

    private ICategoryDao _icategorydao;
    private List<ILogger> loggers;

    private List<String> categorynames=new ArrayList<>();

    public CategoryManager(ICategoryDao _icategorydao,List<ILogger>loggers){
        this._icategorydao=_icategorydao;
        this.loggers=loggers;
    }
    public void add(Course course) throws Exception {
        if(categorynames.size()==0){
            categorynames.add(course.getCategoryName());
            _icategorydao.add(course);
            for(ILogger logger:loggers){
                logger.log(course.getCategoryName());
            }
        }else {
            for (String cgory : categorynames) {
                if (cgory.equals(course.getCategoryName())) {
                   throw new Exception("Girilen kategori mevcut : " + course.getCategoryName());
                }
            }
            categorynames.add(course.getCategoryName());
            _icategorydao.add(course);
            for (ILogger logger : loggers) {
                logger.log(course.getCategoryName());
            }


        }
    }


}
