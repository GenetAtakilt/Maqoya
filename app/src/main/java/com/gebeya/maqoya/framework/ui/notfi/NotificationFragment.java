package com.gebeya.maqoya.framework.ui.notfi;

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
import com.gebeya.maqoya.framework.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class NotificationFragment extends Fragment {

    RecyclerView recyclerView;
    List<NotficationData> notficationDataList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_notification,container,false);

        recyclerView = view.findViewById(R.id.notfication_recycler);
        NotificationAdapter notificationAdapter = new NotificationAdapter(getActivity(),notficationDataList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(notificationAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        notficationDataList = new ArrayList<>();

        notficationDataList.add(new NotficationData(1,"ncvncmnvmdnfjknvmncmvnmdnxmnvmnkmnnmnmnm \n nkfjncvjhsjdfhvnxbcjvnbnbxznbcnbnxzbbcnbn  \n bcvsshdbcxnxjbjnbjbjhbjnxzbjcghjbxnbhj \n xbcvhcshvzbxvcbvhsdvbzvxbcvuyvbs nzbvhxvcbd"));
    }
}

