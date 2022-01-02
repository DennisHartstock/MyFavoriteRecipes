package com.example.myfavoriterecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecipeItem> recipeItems = new ArrayList<>();
        recipeItems.add(new RecipeItem(R.drawable.pizza_1,
                Utils.PIZZA_1_TITLE, Utils.PIZZA_1_DESCRIPTION, Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_1_RECIPE));
    }
}