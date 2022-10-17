package entities;

public class Teacher extends Category{
private String teachername;
private int teacherId;

    public Teacher(int _id, String _categoryname,int _teacherid,String _teachername) {
        super(_id, _categoryname);
        this.teachername=_teachername;
        this.teacherId=_teacherid;
    }


    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;

    }
}