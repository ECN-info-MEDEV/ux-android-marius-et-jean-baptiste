package com.example.feettrack.ui.parametres;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ParametresViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ParametresViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is actualites fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}