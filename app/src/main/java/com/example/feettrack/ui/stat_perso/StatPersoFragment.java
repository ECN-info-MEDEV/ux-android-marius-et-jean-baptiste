package com.example.feettrack.ui.stat_perso;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.feettrack.databinding.FragmentStatPersoBinding;

public class StatPersoFragment extends Fragment {

    private FragmentStatPersoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        StatPersoModel statPersoModel =
                new ViewModelProvider(this).get(StatPersoModel.class);

        binding = FragmentStatPersoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textStatPerso;
        statPersoModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}