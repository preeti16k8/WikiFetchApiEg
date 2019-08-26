package com.preeti.wikigetapi.ModelsNew;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TermsPojo {
    @SerializedName("description")
    @Expose
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
