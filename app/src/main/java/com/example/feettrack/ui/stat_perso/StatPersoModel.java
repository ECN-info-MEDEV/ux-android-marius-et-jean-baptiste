package com.example.feettrack.ui.stat_perso;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StatPersoModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public StatPersoModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Statistiques personnelles fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}