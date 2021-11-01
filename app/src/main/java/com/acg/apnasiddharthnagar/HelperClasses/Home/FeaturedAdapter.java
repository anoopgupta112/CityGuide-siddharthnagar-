package com.acg.apnasiddharthnagar.HelperClasses.Home;

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

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.FeaturedViewHolder> {
    ArrayList<AllHelperClass> featuredLocations;
    Context context;

    public FeaturedAdapter(ArrayList<AllHelperClass> featuredLocations) {
        this.featuredLocations = featuredLocations;

    }

    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_card_design,parent,false);
       FeaturedViewHolder featuredViewHolder = new FeaturedViewHolder(view);
       context = parent.getContext();
        return featuredViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {
AllHelperClass allHelperClass = featuredLocations.get(position);
holder.image.setImageResource(allHelperClass.getImage());
holder.title.setText(allHelperClass.getTitle());
holder.discription.setText(allHelperClass.getDescription());

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
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
        return featuredLocations.size();
    }

    public static class FeaturedViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title, discription;
        public FeaturedViewHolder(@NonNull View itemView) {
            super(itemView);
//            Hooks
            image = itemView.findViewById(R.id.featured_image);
            title = itemView.findViewById(R.id.featured_titile);
            discription = itemView.findViewById(R.id.featured_discription);
        }
    }
}
