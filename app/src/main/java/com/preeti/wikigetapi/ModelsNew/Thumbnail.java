package com.preeti.wikigetapi.ModelsNew;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumbnail {
    @SerializedName("width")
    @Expose
    private String width;

    @SerializedName("source")
    @Expose
    private String source;

    @SerializedName("height")
    @Expose
    private String height;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
