package com.example.tilek_shambetaliev_hw3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FirstFragment extends Fragment {

    private Button plus, minus, next;
    private TextView txt;
    private int count;
    static final String KEY_OF_TXT = "count";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();
        initListener();


    }
    private void initListener() {
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                txt.setText(String.valueOf(count));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                txt.setText(String.valueOf(count));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt(KEY_OF_TXT, Integer.parseInt(txt.getText().toString()));
                SecondFragment secondFragment = new SecondFragment();
                secondFragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.conteiner, secondFragment).addToBackStack(null).commit();
            }
        });
    }
    private void initView() {
        plus = requireActivity().findViewById(R.id.btn_plus);
        minus = requireActivity().findViewById(R.id.btn_minus);
        txt = requireActivity().findViewById(R.id.txt_view);
        next = requireActivity().findViewById(R.id.btn_next);
    }
}