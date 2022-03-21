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
                Utils.PIZZA_1_TITLE, Utils.PIZZA_1_DESCRIPTION, Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_1_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.pizza_2,
                Utils.PIZZA_2_TITLE, Utils.PIZZA_2_DESCRIPTION, Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_2_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.pizza_3,
                Utils.PIZZA_3_TITLE, Utils.PIZZA_3_DESCRIPTION, Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_3_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.pizza_4,
                Utils.PIZZA_4_TITLE, Utils.PIZZA_4_DESCRIPTION, Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_4_RECIPE));

        recipeItems.add(new RecipeItem(R.drawable.pizza_5,
                Utils.PIZZA_5_TITLE, Utils.PIZZA_5_DESCRIPTION, Utils.PIZZA_1_INGREDIENTS, Utils.PIZZA_5_RECIPE));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecipeAdapter(recipeItems, this);
        layoutManager = new GridLayoutManager(this, columnCount);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}