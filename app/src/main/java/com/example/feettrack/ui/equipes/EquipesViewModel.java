package com.example.feettrack.ui.equipes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EquipesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public EquipesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is équipes fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}