package com.preeti.wikigetapi.ModelsNew;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WikiResponse {

    @SerializedName("batchcomplete")
    @Expose
    private Boolean batchcomplete;

    @SerializedName("query")
    @Expose
    private QueryPojo query;

    public Boolean getBatchcomplete() {
        return batchcomplete;
    }

    public void setBatchcomplete(Boolean batchcomplete) {
        this.batchcomplete = batchcomplete;
    }

    public QueryPojo getQuery() {
        return query;
    }

    public void setQuery(QueryPojo query) {
        this.query = query;
    }
}
