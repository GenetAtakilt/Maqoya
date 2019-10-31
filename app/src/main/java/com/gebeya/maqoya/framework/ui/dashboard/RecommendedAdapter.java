package com.gebeya.maqoya.framework.ui.dashboard;

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
import java.util.zip.Inflater;

public class RecommendedAdapter extends RecyclerView.Adapter<RecommendedAdapter.RecommendedViewHolder> {

    private Context mCtx;
    private List<DayCareData> dayCareDataList;

    public RecommendedAdapter(Context mCtx, List<DayCareData> dayCareDataList) {
        this.mCtx = mCtx;
        this.dayCareDataList = dayCareDataList;
    }

    @NonNull
    @Override
    public RecommendedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);

        View view  = inflater.inflate(R.layout.explore_card,null);
        return new RecommendedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendedViewHolder holder, int position) {

        DayCareData dayCareData = dayCareDataList.get(position);

        holder.name.setText(dayCareData.getName());
        holder.location.setText(dayCareData.getLocation());
        holder.availableSlot.setText(dayCareData.getAvailableSlots());
        holder.picture.setImageDrawable(mCtx.getResources().getDrawable(dayCareData.getPicture()));

    }

    @Override
    public int getItemCount() {
        return dayCareDataList.size();
    }

    class RecommendedViewHolder extends RecyclerView.ViewHolder
    {
        TextView name, location, availableSlot;
        ImageView picture;

        public RecommendedViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.dayCareName);
            location = itemView.findViewById(R.id.dayCarePlace);
            availableSlot = itemView.findViewById(R.id.availableSlot);
            picture = itemView.findViewById(R.id.dayCareImage);

        }
    }
}
