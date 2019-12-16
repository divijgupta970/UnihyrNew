package com.unihyr.Unihyr.positions.viewposition;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.unihyr.Unihyr.positions.model.Position;
import com.unihyr.Unihyr.positions.viewposition.model.ViewPosition;
import com.unihyr.Unihyr.service.Repository;

import java.util.List;

public class ViewPositionsViewmodel extends AndroidViewModel {
    private LiveData<List<ViewPosition>> viewPositionList;
    private Repository repository;
    private Position position;

    public ViewPositionsViewmodel(@NonNull Application application) {
        super(application);
        repository =new Repository(application);
    }

    public LiveData<List<ViewPosition>> getViewPositionList(Long id,String filter,int channel) {
        viewPositionList=repository.getViewPositions(id,filter,channel);
        return viewPositionList;
    }
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
