package com.example.volcaknow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;

import androidx.appcompat.app.AppCompatActivity;

import com.example.volcaknow.databinding.ActivityVideoBinding;

public class VideoActivity extends AppCompatActivity {

    private ActivityVideoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout
        binding = ActivityVideoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Set up video playback
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.volcano_video);
        binding.videoView.setVideoURI(videoUri);

        // Optional: Add media controls (play, pause, seek)
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(binding.videoView);
        binding.videoView.setMediaController(mediaController);

        // Start the video
        binding.videoView.start();

        // Open YouTube button (optional)
        binding.youtubeButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/lAmqsMQG3RM?si=aQCvmz6BCgGKrZ_x"));
            startActivity(intent);
        });
    }
}
