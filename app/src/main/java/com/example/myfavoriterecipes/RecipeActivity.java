package com.example.myfavoriterecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        ImageView dishImageView = findViewById(R.id.dishImageView);
        TextView title = findViewById(R.id.titleTextView);
        TextView description = findViewById(R.id.descriptionTextView);
        TextView ingredients = findViewById(R.id.ingredientsTextView);
        TextView recipe = findViewById(R.id.methodTextView);

        Intent intent = getIntent();
        if (intent != null) {
//            dishImageView.setImageResource(intent.get);
            title.setText(intent.getStringExtra("title"));
            description.setText(intent.getStringExtra("description"));
            ingredients.setText(intent.getStringExtra("ingredients"));
            recipe.setText(intent.getStringExtra("recipe"));
        }
    }
}