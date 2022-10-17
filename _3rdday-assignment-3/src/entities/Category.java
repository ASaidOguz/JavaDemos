package entities;

public class Category {
    private int id ;
    private String categoryName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category(int _id, String _categoryname){
        this.categoryName=_categoryname;
        this.id=_id;
    }

}
