package com.gebeya.maqoya.framework.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.gebeya.maqoya.framework.R;
import com.gebeya.maqoya.framework.ui.dashboard.DayCareDetial;

public class HomeFragment extends Fragment {

    Button home;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);


       home = view.findViewById(R.id.near);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DayCareDetial dayCareDetial = new DayCareDetial();
                FragmentManager manager =  getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment,dayCareDetial)
                        .addToBackStack(null)
                        .commit();


            }
        });


        return view;


//        homeViewModel =
//                ViewModelProviders.of(this).get(HomeViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
//        return root;
    }
}