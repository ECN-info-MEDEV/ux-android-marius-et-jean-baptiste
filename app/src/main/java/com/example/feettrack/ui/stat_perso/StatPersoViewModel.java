package com.example.feettrack.ui.stat_perso;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StatPersoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public StatPersoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Statistiques personnelles fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}