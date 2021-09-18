package com.gtech.fragment.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gtech.fragment.Model.Station;
import com.gtech.fragment.R;

import java.util.List;

public class StationAdapter extends RecyclerView.Adapter<StationAdapter.StationViewHolder> {

    List<Station> stations;

    public StationAdapter(List<Station> stations) {
        this.stations = stations;
    }

    @NonNull
    @Override
    public StationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.destinationitem, parent, false);
        return new StationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StationViewHolder holder, int position) {

        holder.StationNames.setText(stations.get(position).getStationName());

    }

    @Override
    public int getItemCount() {
        return stations.size();
    }

    static class StationViewHolder extends RecyclerView.ViewHolder {

        TextView StationNames, StationsPrice;

        public StationViewHolder(@NonNull View itemView) {
            super(itemView);

            StationNames = itemView.findViewById(R.id.StationNames);
            StationsPrice = itemView.findViewById(R.id.StationsPrice);

        }
    }

}
