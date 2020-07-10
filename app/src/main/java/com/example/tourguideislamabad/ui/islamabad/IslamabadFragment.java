package com.example.tourguideislamabad.ui.islamabad;

import android.content.Intent;
import android.net.Uri;
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

public class IslamabadFragment extends Fragment {

    private IslamabadViewModel islamabadViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        islamabadViewModel =
                ViewModelProviders.of(this).get(IslamabadViewModel.class);
        View root = inflater.inflate(R.layout.fragment_islamabad, container, false);

        islamabadViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        TextView coordinates=root.findViewById(R.id.coordinate_islamabad_layout_txt18);
        coordinates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/place/Islamabad,+Islamabad+Capital+Territory,+Pakistan/@33.6160373,72.9460225,11z/data=!3m1!4b1!4m5!3m4!1s0x38dfbfd07891722f:0x6059515c3bdb02b6!8m2!3d33.6844202!4d73.0478848";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });
        TextView link=root.findViewById(R.id.weblink_islamabad_layout_txt20);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Islamabad";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });


        return root;
    }
}
