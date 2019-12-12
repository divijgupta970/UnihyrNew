package com.unihyr.Unihyr.positions;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.unihyr.Unihyr.positions.model.Position;
import com.unihyr.Unihyr.service.Repository;

import java.util.List;

public class PositionsFragmentViewmodel extends AndroidViewModel {
    private LiveData<List<Position>> positionList;
    private Repository repository;

    public PositionsFragmentViewmodel(@NonNull Application application) {
        super(application);
        repository =new Repository(application);
    }

    public LiveData<List<Position>> getPositionList() {
        positionList=repository.getPositions();
        return positionList;
    }
}
