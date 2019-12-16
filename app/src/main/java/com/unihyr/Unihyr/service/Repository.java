package com.unihyr.Unihyr.service;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.unihyr.Unihyr.positions.model.Position;
import com.unihyr.Unihyr.positions.viewposition.model.ViewPosition;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {
    private MutableLiveData<List<Position>> positionsLiveData=new MutableLiveData<>();
    private MutableLiveData<List<ViewPosition>> viewPositionsLiveData=new MutableLiveData<>();
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
    public MutableLiveData<List<ViewPosition>> getViewPositions(Long id,String filter,int channel){
        DataServiceTemp dataServiceTemp=RetrofitInstance.getTempService();
        Call<List<ViewPosition>> call=dataServiceTemp.getTempPositions(id,filter,channel);
        call.enqueue(new Callback<List<ViewPosition>>() {
            @Override
            public void onResponse(Call<List<ViewPosition>> call, Response<List<ViewPosition>> response) {
                viewPositionsLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<ViewPosition>> call, Throwable t) {
                viewPositionsLiveData.setValue(new ArrayList<ViewPosition>());
                Log.d("PositionsFragment",call.request().url().toString());
                Log.d("PositionsFragment",t.getMessage());
            }
        });
        return viewPositionsLiveData;
    }
}
