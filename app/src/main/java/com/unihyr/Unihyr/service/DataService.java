package com.unihyr.Unihyr.service;

import com.unihyr.Unihyr.positions.model.Position;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DataService {
    @GET("/demo/api/allpost")
    Call<List<Position>> getPositions();

}
