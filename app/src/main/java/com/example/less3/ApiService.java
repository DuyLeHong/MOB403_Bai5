package com.example.less3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/")
    Call<List<SinhvienModel>> getSinhviens();


}
