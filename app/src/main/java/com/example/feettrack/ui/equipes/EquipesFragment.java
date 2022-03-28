package com.example.feettrack.ui.equipes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.feettrack.databinding.FragmentEquipesBinding;

public class EquipesFragment extends Fragment {

    private FragmentEquipesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EquipesViewModel equipesViewModel =
                new ViewModelProvider(this).get(EquipesViewModel.class);

        binding = FragmentEquipesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textEquipes;
        //equipesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}