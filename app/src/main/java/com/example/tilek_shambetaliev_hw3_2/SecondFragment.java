package com.example.tilek_shambetaliev_hw3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondFragment extends Fragment {

    private TextView txt2;
    Integer countResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();
        getData();
    }

    private void getData() {
        if (getArguments() != null) {
            countResult = getArguments().getInt(FirstFragment.KEY_OF_TXT);
        txt2.setText(countResult.toString());
    }
    }

    private void initView() {
        txt2 = requireActivity().findViewById(R.id.txt_view2);
    }
}