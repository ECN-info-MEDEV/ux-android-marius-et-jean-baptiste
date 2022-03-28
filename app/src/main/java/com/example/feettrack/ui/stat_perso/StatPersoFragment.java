package com.example.feettrack.ui.stat_perso;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.feettrack.R;
import com.example.feettrack.databinding.FragmentStatPersoBinding;
//import com.example.feettrack.databinding.FragmentAnalyseBinding;

public class StatPersoFragment extends Fragment{

    private FragmentStatPersoBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_stat_perso, container, false);

        ImageButton analyseBtn = (ImageButton) rootView.findViewById(R.id.nav_heatmap);

        analyseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(rootView).navigate(R.id.nav_stat_perso_to_nav_analyse);
            }
        });
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
