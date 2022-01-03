package com.example.myfavoriterecipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {
    ArrayList<RecipeItem> recipeItems;
    Context context;

    public RecipeAdapter(ArrayList<RecipeItem> recipeItems, Context context) {
        this.recipeItems = recipeItems;
        this.context = context;
    }

    @NonNull
    @Override
    public RecipeAdapter.RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_item, parent, false);
        RecipeViewHolder recipeViewHolder = new RecipeViewHolder(view);
        return recipeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        RecipeItem recipeItem = recipeItems.get(position);

        holder.dishImageView.setImageResource(recipeItem.getImageResource());
        holder.titleTextView.setText(recipeItem.getTitle());
        holder.descriptionTextView.setText(recipeItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return recipeItems.size();
    }

    class RecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView dishImageView;
        public TextView titleTextView;
        public TextView descriptionTextView;

        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            dishImageView = itemView.findViewById(R.id.dishImageView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
        }

        @Override
        public void onClick(View view) {
            int position = getAbsoluteAdapterPosition();
            RecipeItem recipeItem = recipeItems.get(position);

            Intent intent = new Intent(context, RecipeActivity.class);
            intent.putExtra("imageResource", recipeItem.getImageResource());
            intent.putExtra("title", recipeItem.getTitle());
            intent.putExtra("description", recipeItem.getDescription());
            intent.putExtra("ingredients", recipeItem.getIngredients());
            intent.putExtra("recipe", recipeItem.getRecipe());

            context.startActivity(intent);
        }
    }
}
