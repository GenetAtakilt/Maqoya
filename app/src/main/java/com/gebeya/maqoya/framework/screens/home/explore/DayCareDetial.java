package com.gebeya.maqoya.framework.screens.home.explore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.gebeya.maqoya.framework.R;

public class DayCareDetial extends Fragment {

    private ImageView back;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_daycare_detail,container,false);

        back = view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ExploreFragment exploreFragment = new ExploreFragment();
                FragmentManager manager =  getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment,exploreFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
}
