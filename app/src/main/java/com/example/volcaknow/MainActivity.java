package com.example.volcaknow;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.volcaknow.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate layout using view binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // If you have a toolbar in activity_main.xml and want to use it, uncomment the line below:
        // setSupportActionBar(binding.toolbar);

        // You can also set up other buttons or views from activity_main.xml here
        // For example:
        // binding.myButton.setOnClickListener(v -> { ... });
    }


}
