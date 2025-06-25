package com.example.volcaknow;

import android.content.Intent;
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

        binding.okButton.setOnClickListener(v -> {
            String volcanoName = binding.volcanoNameInput.getText().toString().trim();

            Intent intent = new Intent(MainActivity.this, VideoActivity.class);
            intent.putExtra("volcano_name", volcanoName); // 🔐 Send value
            startActivity(intent);
        });


    }


}
