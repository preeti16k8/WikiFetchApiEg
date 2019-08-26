package com.preeti.wikigetapi.api;

import com.preeti.wikigetapi.ModelsNew.WikiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiInterface {

/*
    @Headers({
            "Accept: application/json",
            "Content-type: application/json"
    })*/

   @GET("/w/api.php")
    Call<WikiResponse> getWikiQuery(

            @Query("action") String query,

            @Query("format") String json,

            @Query("prop") String prop,


            @Query("generator") String g,

            @Query("redirects") String redirect,

            @Query("formatversion") String v,

            @Query("piprop") String rp,
            @Query("pithumbsize") String size,
            @Query("pilimit") String plimit,

            @Query("wbptterms") String wbp,
            @Query("gpssearch") String keywordsearch,
            @Query("gpslimit") String gplimit


    );

}
