package com.gebeya.maqoya.framework.ui.dashboard;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gebeya.maqoya.framework.R;
import com.gebeya.maqoya.framework.ui.notfi.NotificationFragment;

import java.util.ArrayList;
import java.util.List;

public class ExploreFragment extends Fragment  {

    List<DayCareData> dayCareData;

    RecyclerView recyclerView;

    CardView cardView;

    ImageView notification;


   // private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_explore,container,false);


        recyclerView = view.findViewById(R.id.topRated_recycler);
        TopRatedAdapter topRatedAdapter = new TopRatedAdapter(getContext(),dayCareData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(topRatedAdapter);

        //  toprated cardview onclick to be modified
        topRatedAdapter.setonItemClickListener(new TopRatedAdapter.onItemClickListener() {
            @Override
            public void onItemClick(int position) {


                cardView = view.findViewById(R.id.card);
                cardView.setOnClickListener(new View.OnClickListener() {
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


            }
        });

        recyclerView = view.findViewById(R.id.recommended_recycler);
        RecommendedAdapter recommendedAdapter = new RecommendedAdapter(getContext(),dayCareData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(recommendedAdapter);



// notfication on click to be modified
     notification = view.findViewById(R.id.notfication);
     notification.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             NotificationFragment notificationFragment = new NotificationFragment();
             getFragmentManager()
                     .beginTransaction()
                     .replace(R.id.nav_host_fragment,notificationFragment)
                     .addToBackStack(null)
                     .commit();
         }
     });




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
        dayCareData.add(new DayCareData(1,R.drawable.daycare,"Ethiopia","bola","23"));
        dayCareData.add(new DayCareData(1,R.drawable.daycare,"Ethiopia","bola","23"));
        dayCareData.add(new DayCareData(1,R.drawable.daycare,"Ethiopia","bola","23"));
    }
}