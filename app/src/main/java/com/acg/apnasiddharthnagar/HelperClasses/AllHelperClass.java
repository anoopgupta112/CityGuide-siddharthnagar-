package com.acg.apnasiddharthnagar.HelperClasses;



public class AllHelperClass {
    int image;
    String title;
    String fulldetail;


    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    public String getFullDetail() {
        return fulldetail;
    }

    public AllHelperClass(int image, String title, String description,String fulldetail) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.fulldetail = fulldetail;

    }

    String description;
}
