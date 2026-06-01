package com.example.tarea_08.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tarea_08.R;

public class Ejercicio04Fragment extends Fragment {

    private EditText edtRadio;
    private TextView txtResultadoArea, txtResultadoPerimetro;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_ejercicio04, container, false);

        edtRadio = v.findViewById(R.id.edtRadio);
        txtResultadoArea = v.findViewById(R.id.txtResultadoArea);
        txtResultadoPerimetro = v.findViewById(R.id.txtResultadoPerimetro);

        v.findViewById(R.id.btnCalcular).setOnClickListener(view -> calcular());

        return v;
    }

    private void calcular() {
        try {
            double radio = Double.parseDouble(edtRadio.getText().toString());

            double area = Math.PI * Math.pow(radio, 2);
            double perimetro = 2 * Math.PI * radio;

            txtResultadoArea.setText(String.format("Área: %.2f", area));
            txtResultadoPerimetro.setText(String.format("Perímetro: %.2f", perimetro));

        } catch (NumberFormatException e) {
            txtResultadoArea.setText("Error: Ingrese un número válido");
            txtResultadoPerimetro.setText("");
        }
    }
}