package com.example.coderecycleview.Model;

public class Cat {
    private int resouceImg;
    private String name;

    public Cat(int resouceImg, String name) {
        this.resouceImg = resouceImg;
        this.name = name;
    }

    public int getResouceImg() {
        return resouceImg;
    }

    public void setResouceImg(int resouceImg) {
        this.resouceImg = resouceImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
