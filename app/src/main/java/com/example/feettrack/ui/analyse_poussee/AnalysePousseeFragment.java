package com.example.feettrack.ui.analyse_poussee;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.feettrack.R;

public class AnalysePousseeFragment extends Fragment {

    private AnalysePousseeViewModel mViewModel;

    public static AnalysePousseeFragment newInstance() {
        return new AnalysePousseeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.analyse_poussee_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AnalysePousseeViewModel.class);
        // TODO: Use the ViewModel
    }

}