package com.publicicat.mismascotastres;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterOne extends RecyclerView.Adapter<AdapterOne.MascotasViewHolder> {

    ArrayList<Constructor> mascotas;

    public AdapterOne(ArrayList<Constructor> mascotas) {
        this.mascotas = mascotas;
    }

    @NonNull
    @Override
    public MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_timeline, parent, false);
        return new MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotasViewHolder holder, int position) {
        Constructor mascotasItem = mascotas.get(position);

        holder.cvivPic.setImageResource(mascotasItem.getPic());
        holder.cvtvName.setText(mascotasItem.getName());
        holder.cvtvVotes.setText(Integer.toString(mascotasItem.getVotes()));

        holder.cvivBoneg.setOnClickListener(new View.OnClickListener() {
            int n = mascotasItem.getVotes();
            int z = n + 5;
            @Override
            public void onClick(View v) {
                if (n <= z){
                    z=z;
                    n = n + 1;
                    holder.cvtvVotes.setText(Integer.toString(n));
                } else {
                    holder.cvtvVotes.setText("Lol");
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    //Class inside class
    public static class MascotasViewHolder extends RecyclerView.ViewHolder {

        private ImageView cvivPic;
        private TextView cvtvName;
        private TextView cvtvVotes;
        private ImageView cvivBoneg;

        public MascotasViewHolder(@NonNull View itemView) {
            super(itemView);
            cvivPic = (ImageView) itemView.findViewById(R.id.cv_iv_pic);
            cvtvName = (TextView) itemView.findViewById(R.id.cv_tv_name);
            cvtvVotes = (TextView) itemView.findViewById(R.id.cv_tv_votes);
            cvivBoneg = (ImageView) itemView.findViewById(R.id.cv_iv_boundg);
        }
    }
}


