package com.example.ejerciciogridiconos;

public class ViewItem {

    private int imageResource;
    private String title;

public ViewItem(int imageResource, String title){
    this.imageResource = imageResource;
    this.title = title;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle(){
        return title;
    }
}
