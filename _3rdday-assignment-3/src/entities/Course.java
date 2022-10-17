package entities;

public class Course extends Teacher {
    private String coursename;
    private double courseprice;
    private int courseId;

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public double getCourseprice() {
        return courseprice;
    }

    public void setCourseprice(double courseprice) {
        this.courseprice = courseprice;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Course(String _coursename, double _courseprice, int _courseId,int _id,String _categoryname,int _teacherid,String _teachername){
        super(_id,_categoryname,_teacherid,_teachername);
        this.coursename=_coursename;
        this.courseprice=_courseprice;
        this.courseId=_courseId;
    }


}
