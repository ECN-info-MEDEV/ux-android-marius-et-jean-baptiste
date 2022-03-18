package com.example.feettrack.ui.aide;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AideViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AideViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is actualites fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}