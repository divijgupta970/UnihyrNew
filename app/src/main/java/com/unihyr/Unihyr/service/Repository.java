package com.unihyr.Unihyr.service;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.unihyr.Unihyr.positions.model.Position;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {
    private MutableLiveData<List<Position>> positionsLiveData=new MutableLiveData<>();
    private Application application;

    public Repository(Application application){
        this.application=application;
    }
    public MutableLiveData<List<Position>> getPositions(){
        DataService dataService=RetrofitInstance.getService();
        Call<List<Position>> call=dataService.getPositions();
        call.enqueue(new Callback<List<Position>>() {
            @Override
            public void onResponse(Call<List<Position>> call, Response<List<Position>> response) {
                positionsLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Position>> call, Throwable t) {
                positionsLiveData.setValue(new ArrayList<Position>());
            }
        });
        return positionsLiveData;
    }
}
