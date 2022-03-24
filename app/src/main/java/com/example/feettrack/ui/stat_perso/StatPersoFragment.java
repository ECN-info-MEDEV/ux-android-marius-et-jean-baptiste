package com.example.feettrack.ui.stat_perso;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.feettrack.databinding.FragmentStatPersoBinding;
//import com.example.feettrack.databinding.FragmentAnalyseBinding;

public class StatPersoFragment extends Fragment {

    private FragmentStatPersoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        StatPersoViewModel statPersoViewModel =
                new ViewModelProvider(this).get(StatPersoViewModel.class);

        binding = FragmentStatPersoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
/*
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment implements View.OnClickListener {

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        Button aboutBtn = (Button) rootView.findViewById(R.id.aboutusButton);
        Button phonebookBtn = (Button) rootView.findViewById(R.id.phbookButton);

        aboutBtn.setOnClickListener(this);
        phonebookBtn.setOnClickListener(this);


        return rootView;
    }

    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.aboutusButton:
                fragment = new AboutFragment();
                replaceFragment(fragment);
                break;

            case R.id.phbookButton:
                fragment = new PhoneBookFragment();
                replaceFragment(fragment);
                break;
        }
    }

    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


}
 */