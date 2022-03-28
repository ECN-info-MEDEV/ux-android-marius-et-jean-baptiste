package com.example.feettrack.ui.aide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

// import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
// import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
// import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import com.example.feettrack.databinding.AideFragmentBinding;
import com.example.feettrack.ui.aide.AideViewModel;

public class AideFragment extends Fragment {

    private AideFragmentBinding binding;

    // private YouTubePlayerView youTubePlayerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AideViewModel AideViewModel =
                new ViewModelProvider(this).get(AideViewModel.class);

        binding = AideFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}