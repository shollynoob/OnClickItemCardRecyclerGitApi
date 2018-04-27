package com.nightbit.onclickitemcardrecyclergitapi.api;


import com.nightbit.onclickitemcardrecyclergitapi.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;


public interface Service {
    @GET("/search/users?q=language:java+location:lagos")
    Call<ItemResponse> getItems();
}
