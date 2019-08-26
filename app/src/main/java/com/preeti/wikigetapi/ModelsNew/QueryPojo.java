package com.preeti.wikigetapi.ModelsNew;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QueryPojo {

    @SerializedName("pages")
    @Expose
    private List<WikiPages> pages;

    public List<WikiPages> getPages() {
        return pages;
    }

    public void setPages(List<WikiPages> pages) {
        this.pages = pages;
    }
}
