package com.gebeya.maqoya.framework.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gebeya.maqoya.framework.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ChildFragment extends Fragment {

    RecyclerView recyclerView;

    List<ChildData> childData;

    FloatingActionButton addChildInfo;


    //private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_child,container,false);

        recyclerView = view.findViewById(R.id.child_recycler);
        ChildAdapter childAdapter = new ChildAdapter(getContext(),childData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(childAdapter);

        addChildInfo = view.findViewById(R.id.floatingActionButton);
        addChildInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              MyChildDialog myChildDialog = new MyChildDialog();
              myChildDialog.show(getFragmentManager()," MyChildDialog");
            }
        });

        return view;

        /*
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_child, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        notificationsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;


         */
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        childData = new ArrayList<>();

        childData.add(new ChildData(1,R.drawable.register_add_photo_icon,"Jane","selamdaycare","3 hour"));

        childData.add(new ChildData(1,R.drawable.add_photo,"Jane","selamdaycare","3 hour"));

        childData.add(new ChildData(1,R.drawable.add_photo,"Jane","selamdaycare","3 hour"));
        childData.add(new ChildData(1,R.drawable.register_add_photo_icon,"Jane","selamdaycare","3 hour"));
        childData.add(new ChildData(1,R.drawable.register_add_photo_icon,"Jane","selamdaycare","3 hour"));

        childData.add(new ChildData(1,R.drawable.add_photo,"Jane","selamdaycare","3 hour"));
    }
}