package com.example.feettrack.ui.stat_perso;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StatPersoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public StatPersoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}