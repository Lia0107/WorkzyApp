package com.example.workzyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {
    public FragmentOne() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        Button button = view.findViewById(R.id.button_fragment_one);
        button.setOnClickListener(v -> Toast.makeText(getActivity(), "Hello from Fragment One!", Toast.LENGTH_SHORT).show());
        return view;

    }
}
