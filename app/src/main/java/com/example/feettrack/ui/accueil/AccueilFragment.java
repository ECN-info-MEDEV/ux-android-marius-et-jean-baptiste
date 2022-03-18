package com.example.feettrack.ui.accueil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.feettrack.databinding.FragmentAccueilBinding;

public class AccueilFragment extends Fragment {

    private FragmentAccueilBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AccueilViewModel accueilViewModel =
                new ViewModelProvider(this).get(AccueilViewModel.class);

        binding = FragmentAccueilBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAccueil;
        accueilViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}