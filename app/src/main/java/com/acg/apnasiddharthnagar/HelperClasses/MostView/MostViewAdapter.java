package com.acg.apnasiddharthnagar.HelperClasses.MostView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.acg.apnasiddharthnagar.HelperClasses.AllHelperClass;
import com.acg.apnasiddharthnagar.MainActivity;
import com.acg.apnasiddharthnagar.R;

import java.util.ArrayList;

public class MostViewAdapter extends RecyclerView.Adapter<MostViewAdapter.MostViewHolder> {
    ArrayList<AllHelperClass> MostViewedLocation;
Context context;
    public MostViewAdapter(ArrayList<AllHelperClass> mostViewedLocation) {
        MostViewedLocation = mostViewedLocation;
    }

    @NonNull
    @Override
    public MostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.most_viewed_card,parent,false);
        MostViewHolder mostViewHolder = new MostViewHolder(view);
context = parent.getContext();
        return mostViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MostViewHolder holder, int position) {
        AllHelperClass allHelperClass = MostViewedLocation.get(position);
        holder.image.setImageResource(allHelperClass.getImage());
        holder.title.setText(allHelperClass.getTitle());
        holder.Discription.setText(allHelperClass.getDescription());
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,MainActivity.class);
                intent.putExtra("image",allHelperClass.getImage());
                intent.putExtra("header",allHelperClass.getTitle());
                intent.putExtra("Discription",allHelperClass.getDescription());
                intent.putExtra("fulldetail",allHelperClass.getFullDetail());

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return MostViewedLocation.size();
    }

    public static class MostViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title,Discription;
        public MostViewHolder(@NonNull View itemView) {
            super(itemView);
            image =itemView.findViewById(R.id.mv_image);
            title = itemView.findViewById(R.id.mv_title);
            Discription = itemView.findViewById(R.id.mv_discription);

        }
    }
}
