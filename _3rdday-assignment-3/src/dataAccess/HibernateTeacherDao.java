package dataAccess;

import entities.Teacher;

public class HibernateTeacherDao implements ITeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Added into Database:Hibernate Type!!"+" Name:"+teacher.getTeachername());
    }
}
