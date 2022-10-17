package dataAccess;

import entities.Category;

public class HibernateCategory implements ICategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Added into Database:Hibernate Type!!: "+category.getCategoryName());
    }
}
