package com.publicicat.mismascotastres;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterTwo extends RecyclerView.Adapter<AdapterTwo.MascotaViewHolder> {

    ArrayList<Constructor> mascota;

    public AdapterTwo(ArrayList<Constructor> mascota) {
        this.mascota = mascota;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_profile, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder holder, int position) {
        Constructor mascotaItem = mascota.get(position);

        holder.cvivPicP.setImageResource(mascotaItem.getPic());
        holder.cvtvVotesP.setText(Integer.toString(mascotaItem.getVotes()));
    }

    @Override
    public int getItemCount() {
        return mascota.size();
    }

    //Class inside class
    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView cvivPicP;
        private TextView cvtvVotesP;

        public MascotaViewHolder(@NonNull View itemView){
            super(itemView);
            cvivPicP = (ImageView) itemView.findViewById(R.id.cv_iv_picP);
            cvtvVotesP = (TextView) itemView.findViewById(R.id.cv_tv_votesP);
        }

    }
}
