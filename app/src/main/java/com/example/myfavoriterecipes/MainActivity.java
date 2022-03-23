package com.example.myfavoriterecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecipeAdapter adapter;
    private GridLayoutManager layoutManager;
    private int columnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        columnCount = getResources().getInteger(R.integer.column_count);

        ArrayList<RecipeItem> recipeItems = new ArrayList<>();
        recipeItems.add(new RecipeItem(R.drawable.pizza_1,
                getResources().getString(R.string.pizza_1_title), getResources().getString(R.string.pizza_1_description),
                Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_1_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.pizza_2,
                getResources().getString(R.string.pizza_2_title), getResources().getString(R.string.pizza_2_description),
                Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_2_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.pizza_3,
                getResources().getString(R.string.pizza_3_title), getResources().getString(R.string.pizza_3_description),
                Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_3_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.pizza_4,
                getResources().getString(R.string.pizza_4_title), getResources().getString(R.string.pizza_4_description),
                Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_4_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.pizza_5,
                getResources().getString(R.string.pizza_5_title), getResources().getString(R.string.pizza_5_description),
                Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_5_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.pizza_5,
                getResources().getString(R.string.pizza_6_title), getResources().getString(R.string.pizza_6_description),
                Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_5_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.pizza_5,
                getResources().getString(R.string.pizza_7_title), getResources().getString(R.string.pizza_7_description),
                Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_5_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.pizza_5,
                getResources().getString(R.string.pizza_8_title), getResources().getString(R.string.pizza_8_description),
                Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_5_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.pizza_5,
                getResources().getString(R.string.pizza_9_title), getResources().getString(R.string.pizza_9_description),
                Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_5_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.pizza_5,
                getResources().getString(R.string.pizza_10_title), getResources().getString(R.string.pizza_10_description),
                Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_5_RECIPE));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecipeAdapter(recipeItems, this);
        layoutManager = new GridLayoutManager(this, columnCount);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}