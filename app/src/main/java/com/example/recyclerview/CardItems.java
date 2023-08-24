package com.example.recyclerview;

public class CardItems {
    int image;
    String name,description,time;

    public CardItems(int image, String name, String description, String time) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}