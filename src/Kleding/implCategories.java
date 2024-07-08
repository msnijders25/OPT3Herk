package Kleding;

import java.util.ArrayList;

public class implCategories implements ICategoryRepository {
    ArrayList<Category> categories = new ArrayList<Category>();

    @Override
    public ArrayList<Category> getCategory() {
        return categories;
    }

    @Override
    public void voegCategoryToe(Category category) {
        categories.add(category);
    }
}
