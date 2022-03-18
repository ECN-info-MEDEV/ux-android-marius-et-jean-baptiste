package com.example.feettrack.ui.parametres;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.feettrack.databinding.ParametresFragmentBinding;
import com.example.feettrack.ui.parametres.ParametresViewModel;

public class ParametresFragment extends Fragment {

    private ParametresFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ParametresViewModel ParametresViewModel =
                new ViewModelProvider(this).get(ParametresViewModel.class);

        binding = ParametresFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textParametres;
        ParametresViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}