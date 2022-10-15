package dataAccess.Hibernate;

import dataAccess.CategoryDao;
import entities.Base;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi ");

    }
}
