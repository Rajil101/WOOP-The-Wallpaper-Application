package com.example.wallpaperapplication;

public class CategoryRVModal {

    private String category;
    private String categoryIVUrl;

    //mouse right click se generate click karke jo bhi create karna ho vo bann jata hai.like here generate  constructor then geter,seter
    public CategoryRVModal(String category, String categoryIVUrl) {
        this.category = category;
        this.categoryIVUrl = categoryIVUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryIVUrl() {
        return categoryIVUrl;
    }

    public void setCategoryIVUrl(String categoryIVUrl) {
        this.categoryIVUrl = categoryIVUrl;
    }
}
