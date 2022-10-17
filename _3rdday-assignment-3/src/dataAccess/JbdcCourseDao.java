package dataAccess;

import entities.Course;

public class JbdcCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Added into Database:Jbdc Type!!: "+course.getCoursename());
    }
}
