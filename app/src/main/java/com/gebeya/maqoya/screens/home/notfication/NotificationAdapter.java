package com.gebeya.maqoya.screens.home.notfication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gebeya.maqoya.framework.R;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder> {

    private Context mCtx;
    private List<NotficationData> notficationData;

    public NotificationAdapter(Context mCtx, List<NotficationData> notficationData) {
        this.mCtx = mCtx;
        this.notficationData = notficationData;
    }

    @NonNull
    @Override
    public NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.notification_card,null);

        return new NotificationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationViewHolder holder, int position) {

        NotficationData notficationData1 = notficationData.get(position);

        holder.notficationText.setText(notficationData1.getNotficationText());
    }

    @Override
    public int getItemCount() {
        return notficationData.size();
    }

    public class NotificationViewHolder extends RecyclerView.ViewHolder
    {

        TextView notficationText;

        public NotificationViewHolder(@NonNull View itemView) {
            super(itemView);



            notficationText = itemView.findViewById(R.id.notificaionText);
        }
    }
}
