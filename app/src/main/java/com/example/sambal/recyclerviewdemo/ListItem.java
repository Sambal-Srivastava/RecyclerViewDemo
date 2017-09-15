package com.example.sambal.recyclerviewdemo;

/**
 * Created by Sambal on 9/1/2017.
 */

public class ListItem {
    private String name;
    private String about,imageURL;

    public ListItem(String name, String about, String imageURL) {
        this.name = name;
        this.about = about;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }

    public String getImageURL() {
        return imageURL;
    }
}
