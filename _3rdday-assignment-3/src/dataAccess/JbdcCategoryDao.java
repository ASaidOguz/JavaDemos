package dataAccess;

import entities.Category;

public class JbdcCategoryDao implements ICategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Added into Database:Jbdc Type!!: "+category.getCategoryName());
    }
}
