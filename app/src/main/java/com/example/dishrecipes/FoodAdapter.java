package com.example.dishrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter {

    private final LayoutInflater inflater;

    private final List<Food> meal;

    public FoodAdapter (Context context, List<Food> meal){
        this.inflater = LayoutInflater.from(context);
        this.meal = meal;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        final ImageView foodView;
        final TextView nameView,ingredientsView,foodDescriptionView;

        ViewHolder(View view){
            super(view);
            foodView = view.findViewById(R.id.foodResource);
            nameView = view.findViewById(R.id.name);
            ingredientsView = view.findViewById(R.id.ingredients);
            neqeqeabsmncbmdanc
        }
    }


}
