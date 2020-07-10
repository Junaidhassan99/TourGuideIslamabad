package com.example.tourguideislamabad.ui.islamabad;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IslamabadViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IslamabadViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Islamabad fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}