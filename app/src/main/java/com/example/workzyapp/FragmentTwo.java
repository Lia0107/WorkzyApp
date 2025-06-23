package com.example.workzyapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class FragmentTwo extends Fragment {
    public FragmentTwo() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        TextView textView = view.findViewById(R.id.text_fragment_two);
        Button button = view.findViewById(R.id.button_fragment_two);

        button.setOnClickListener(v -> textView.setText("Text Updated!"));
        return view;
    }
}