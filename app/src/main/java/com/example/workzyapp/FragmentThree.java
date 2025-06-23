package com.example.workzyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class FragmentThree extends Fragment {
    private int counter = 0;

    public FragmentThree() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        TextView textCounter = view.findViewById(R.id.text_counter);
        Button buttonIncrement = view.findViewById(R.id.button_increment);

        buttonIncrement.setOnClickListener(v -> {
            counter++;
            textCounter.setText("Counter: " + counter);
        });

        return view;
    }
}