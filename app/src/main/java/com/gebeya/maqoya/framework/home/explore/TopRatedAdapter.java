package com.gebeya.maqoya.framework.home.explore;

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

public class TopRatedAdapter extends RecyclerView.Adapter<TopRatedAdapter.ExploreViewHolder> {

    private Context mCtx;
    private onItemClickListener mListener;


    public interface onItemClickListener
    {
        void onItemClick(int position);
    }

    public void setonItemClickListener(onItemClickListener listener)
    {
        mListener = listener;
    }


    public TopRatedAdapter(Context mCtx, List<DayCareData> dayCareDataList) {
        this.mCtx = mCtx;
        this.dayCareDataList = dayCareDataList;
    }

    private List<DayCareData> dayCareDataList;

    @NonNull
    @Override
    public ExploreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.explore_card, null);

        return new ExploreViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ExploreViewHolder holder, int position) {

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


    class ExploreViewHolder extends RecyclerView.ViewHolder
    {
        TextView name, location, availableSlot;
        ImageView picture;


        public ExploreViewHolder(@NonNull View itemView,final onItemClickListener listener) {
            super(itemView);

            name = itemView.findViewById(R.id.dayCareName);
            location = itemView.findViewById(R.id.dayCarePlace);
            availableSlot = itemView.findViewById(R.id.availableSlot);
            picture = itemView.findViewById(R.id.dayCareImage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                  if (listener != null)
                  {

                      int position = getAdapterPosition();

                      if (position != RecyclerView.NO_POSITION)
                      {
                          listener.onItemClick(position);

                      }

                  }
                }
            });
        }
    }
}
