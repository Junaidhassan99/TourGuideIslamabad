package com.example.tourguideislamabad.ui.recreation_places_in_Islamabad;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tourguideislamabad.R;

public class RecreationPlacesInIslamabadFragment extends Fragment {

    private RecreationPlacesInIslamabadViewModel mViewModel;

    public static RecreationPlacesInIslamabadFragment newInstance() {
        return new RecreationPlacesInIslamabadFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recreation_places_in_islamabad_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(RecreationPlacesInIslamabadViewModel.class);
        // TODO: Use the ViewModel
    }

}
