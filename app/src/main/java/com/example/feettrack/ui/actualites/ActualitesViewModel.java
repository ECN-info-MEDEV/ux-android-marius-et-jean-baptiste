package com.example.feettrack.ui.actualites;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ActualitesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ActualitesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is actualites fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}