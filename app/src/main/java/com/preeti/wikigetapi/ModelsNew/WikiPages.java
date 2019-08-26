package com.preeti.wikigetapi.ModelsNew;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WikiPages {

    @SerializedName("pageid")
    @Expose
    private String pageid;

    @SerializedName("ns")
    @Expose
    private String ns;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("index")
    @Expose
    private String index;

    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;

    @SerializedName("terms")
    @Expose
    private Terms terms;

    public String getPageid() {
        return pageid;
    }

    public void setPageid(String pageid) {
        this.pageid = pageid;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Terms getTerms() {
        return terms;
    }

    public void setTerms(Terms terms) {
        this.terms = terms;
    }
}
