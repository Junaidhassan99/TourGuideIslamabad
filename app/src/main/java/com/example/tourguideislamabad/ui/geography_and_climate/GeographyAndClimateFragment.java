package com.example.tourguideislamabad.ui.geography_and_climate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.tourguideislamabad.R;

public class GeographyAndClimateFragment extends Fragment {

    private GeographyAndClimateViewModel geographyAndClimateViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        geographyAndClimateViewModel =
                ViewModelProviders.of(this).get(GeographyAndClimateViewModel.class);
        View root = inflater.inflate(R.layout.fragment_geography_and_climate, container, false);

        geographyAndClimateViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}
