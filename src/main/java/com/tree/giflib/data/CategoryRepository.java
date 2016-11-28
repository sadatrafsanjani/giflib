package com.tree.giflib.data;

import com.tree.giflib.model.Category;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {

    private static final List<Category> categories = Arrays.asList(
            new Category(1,"Technology"),
            new Category(2,"People"),
            new Category(3,"Destruction")
    );

    public List<Category> getCategories(){
        return categories;
    }

    public Category findById(int id){
        for(Category category : categories){
            if(category.getId()==id){
                return category;
            }
        }
        return null;
    }
}
