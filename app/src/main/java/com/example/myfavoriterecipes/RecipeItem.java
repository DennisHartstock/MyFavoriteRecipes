package com.example.myfavoriterecipes;

public class RecipeItem {
    private int ImageResource;
    private String title;
    private String description;
    private String ingredients;
    private String recipe;

    public int getImageResource() {
        return ImageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public RecipeItem(int imageResource, String title, String description, String ingredients, String recipe) {
        ImageResource = imageResource;
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.recipe = recipe;
    }
}
