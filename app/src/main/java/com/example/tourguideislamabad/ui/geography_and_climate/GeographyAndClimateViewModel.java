package com.example.tourguideislamabad.ui.geography_and_climate;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GeographyAndClimateViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GeographyAndClimateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Geography and climate fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}