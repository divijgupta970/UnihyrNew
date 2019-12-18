package com.unihyr.Unihyr.service;

import com.unihyr.Unihyr.positions.viewposition.model.ViewPosition;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataServiceTemp {
    @GET("/api/hrmanagepositionlistapi")
    Call<List<ViewPosition>> getTempPositions(@Query("postId")Long id,@Query("filterBy")String filter,@Query("selected_channel")int channel);
}
