package com.example.wei;

public class text_img {
   private String text;
    private int imageId;

    public text_img(String text, int imageId) {
        this.text = text;
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
