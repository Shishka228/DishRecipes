package com.example.dishrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{

    private final LayoutInflater inflater;

    private final List<Food> meal;

    public FoodAdapter (Context context, List<Food> meal){
        this.inflater = LayoutInflater.from(context);
        this.meal = meal;
    }

    @NonNull
    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FoodAdapter.ViewHolder holder, int position) {
        Food food = meal.get(position);
        holder.foodView.setImageResource(food.getFoodResource());
        holder.nameView.setText(food.getName());
        holder.ingredientsView.setText(food.getIngredients());
        holder.foodDescriptionView.setText(food.getFoodDescription());

    }

    @Override
    public int getItemCount() {
        return meal.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        final ImageView foodView;
        final TextView nameView,ingredientsView,foodDescriptionView;

        ViewHolder(View view){
            super(view);
            foodView = view.findViewById(R.id.foodResource);
            nameView = view.findViewById(R.id.name);
            ingredientsView = view.findViewById(R.id.ingredients);
            foodDescriptionView = view.findViewById(R.id.foodDescription);

        }
    }


}
