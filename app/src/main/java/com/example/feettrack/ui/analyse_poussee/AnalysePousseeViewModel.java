package com.example.feettrack.ui.analyse_poussee;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AnalysePousseeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AnalysePousseeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}