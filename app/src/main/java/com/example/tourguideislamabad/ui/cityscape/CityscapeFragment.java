package com.example.tourguideislamabad.ui.cityscape;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tourguideislamabad.R;

public class CityscapeFragment extends Fragment {

    private CityscapeViewModel mViewModel;

    public static CityscapeFragment newInstance() {
        return new CityscapeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.cityscape_fragment, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(CityscapeViewModel.class);
        // TODO: Use the ViewModel
    }

}
