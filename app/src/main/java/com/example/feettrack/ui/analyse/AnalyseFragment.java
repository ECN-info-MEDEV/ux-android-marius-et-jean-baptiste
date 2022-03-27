package com.example.feettrack.ui.analyse;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.feettrack.R;
import com.example.feettrack.databinding.AnalyseFragmentBinding;

public class AnalyseFragment extends Fragment {

    private AnalyseFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.analyse_fragment, container, false);

        Button analyseBtn = (Button) rootView.findViewById(R.id.analyze);

        analyseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(rootView).navigate(R.id.nav_analyse_to_analysePousseeFragment);
            }
        });

        final Button KPI1 = (Button) rootView.findViewById(R.id.KPI1);
        KPI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KPI1.setSelected(!KPI1.isSelected());
            }
        });

        final Button KPI2 = (Button) rootView.findViewById(R.id.KPI2);
        KPI2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KPI2.setSelected(!KPI2.isSelected());
            }
        });

        final Button KPI3 = (Button) rootView.findViewById(R.id.KPI3);
        KPI3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KPI3.setSelected(!KPI3.isSelected());
            }
        });

        final Button KPI4 = (Button) rootView.findViewById(R.id.KPI4);
        KPI4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KPI4.setSelected(!KPI4.isSelected());
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