package com.example.feettrack.ui.profil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.feettrack.databinding.ProfilFragmentBinding;
import com.example.feettrack.ui.profil.ProfilViewModel;

public class ProfilFragment extends Fragment {

    private ProfilFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProfilViewModel ProfilViewModel =
                new ViewModelProvider(this).get(ProfilViewModel.class);

        binding = ProfilFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //final TextView textView = binding.textProfil;
        // ProfilViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}