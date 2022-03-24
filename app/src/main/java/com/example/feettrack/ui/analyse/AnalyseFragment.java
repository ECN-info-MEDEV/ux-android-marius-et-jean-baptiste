package com.example.feettrack.ui.analyse;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.feettrack.databinding.AnalyseFragmentBinding;

public class AnalyseFragment extends Fragment {

    private AnalyseFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AnalyseViewModel statPersoModel =
                new ViewModelProvider(this).get(AnalyseViewModel.class);

        binding = AnalyseFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}