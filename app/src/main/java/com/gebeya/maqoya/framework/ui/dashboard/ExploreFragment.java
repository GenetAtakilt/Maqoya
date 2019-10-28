package com.gebeya.maqoya.framework.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gebeya.maqoya.framework.R;

import java.util.ArrayList;
import java.util.List;

public class ExploreFragment extends Fragment {

    List<DayCareData> dayCareData;

    RecyclerView recyclerView;

   // private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_explore,container,false);


        recyclerView = view.findViewById(R.id.explore_recycler);
        ExploreAdapter exploreAdapter = new ExploreAdapter(getContext(),dayCareData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(exploreAdapter);





        return view;


        /* dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_explore, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        dashboardViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root; */

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dayCareData = new ArrayList<>();

        dayCareData.add(new DayCareData(1,R.drawable.daycare,"Ethiopia","bola","23"));
        dayCareData.add(new DayCareData(1,R.drawable.daycare,"Ethiopia","bola","23"));
        dayCareData.add(new DayCareData(1,R.drawable.daycare,"Ethiopia","bola","23"));
    }
}