package com.acg.apnasiddharthnagar.HelperClasses.Categories;

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

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoryHolder> {
    ArrayList<AllHelperClass> CategoryLocation;
    Context context;


    public CategoriesAdapter(ArrayList<AllHelperClass> categoryLocation) {
        this.CategoryLocation = categoryLocation;

//        this.inflater=LayoutInflater.from(context);



    }




    @NonNull
    @Override
    public CategoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories_card_design,parent,false);
       CategoryHolder categoryHolder = new CategoryHolder(view);
       context = parent.getContext();
        return categoryHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryHolder holder, int position) {
        AllHelperClass allHelperClass = CategoryLocation.get(position);
        holder.image.setImageResource(allHelperClass.getImage());
        holder.title.setText(allHelperClass.getTitle());


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
        return CategoryLocation.size();
    }

    public static class CategoryHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;
        public CategoryHolder(@NonNull View itemView) {
            super(itemView);
//            hooks
            title = itemView.findViewById(R.id.Categorytext);
            image = itemView.findViewById(R.id.categoryImage);
        }
    }
  }

