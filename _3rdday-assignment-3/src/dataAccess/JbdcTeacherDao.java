package dataAccess;

import entities.Teacher;

public class JbdcTeacherDao implements ITeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Added into Database:Jbdc Type!!"+" Name:"+teacher.getTeachername());
    }
}
