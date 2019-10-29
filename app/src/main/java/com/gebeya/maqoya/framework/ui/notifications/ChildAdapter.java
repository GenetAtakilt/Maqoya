package com.gebeya.maqoya.framework.ui.notifications;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gebeya.maqoya.framework.R;

import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ChildViewHolder> {

    private Context mCtx;
    private List<ChildData> childDataList;

    public ChildAdapter(Context mCtx, List<ChildData> childDataList) {
        this.mCtx = mCtx;
        this.childDataList = childDataList;
    }

    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.child_card,null);
        return new ChildViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder holder, int position) {

        ChildData childData = childDataList.get(position);

        holder.childName.setText(childData.getChildName());
        holder.careName.setText(childData.getDayCareName());
        holder.hourSpent.setText(childData.getHourSpent());
        holder.childPicture.setImageDrawable(mCtx.getResources().getDrawable(childData.getChildPhoto()));

    }

    @Override
    public int getItemCount() {
        return childDataList.size();
    }

    class ChildViewHolder extends RecyclerView.ViewHolder
    {
        TextView childName, careName, hourSpent;
        ImageView childPicture;

        public ChildViewHolder(@NonNull View itemView) {
            super(itemView);

            childName = itemView.findViewById(R.id.childName);
            careName = itemView.findViewById(R.id.carename);
            hourSpent = itemView.findViewById(R.id.hourspent);
            childPicture = itemView.findViewById(R.id.childphoto);
        }
    }
}
