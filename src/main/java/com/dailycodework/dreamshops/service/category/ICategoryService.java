package com.dailycodework.dreamshops.service.category;

import com.dailycodework.dreamshops.model.Category;

import java.util.List;

public interface ICategoryService {
    Category getCategoryById(long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updateCategory(Category category, Long id);
    void deleteCategoryById(long id);
}
