package com.example.dishrecipes;

public class Food {
    private String name;

    private String ingredients;

    private String foodDescription;

    private int foodResource;

    public Food (String name, String ingredients, String foodDescription, int foodResource){
        this.name = name;
        this.ingredients = ingredients;
        this.foodDescription = foodDescription;
        this.foodResource = foodResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public int getFoodResource() {
        return foodResource;
    }

    public void setFoodResource(int foodResource) {
        this.foodResource = foodResource;
    }
}
