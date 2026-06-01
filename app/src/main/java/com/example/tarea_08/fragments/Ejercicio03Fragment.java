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

public class Ejercicio03Fragment extends Fragment {

    private EditText edtBase, edtAltura;
    private TextView txtResultado;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Asociar el fragment con el XML
        View v = inflater.inflate(R.layout.activity_ejercicio03, container, false);

        edtBase = v.findViewById(R.id.edtBase);
        edtAltura = v.findViewById(R.id.edtAltura);
        txtResultado = v.findViewById(R.id.txtResultado);

        v.findViewById(R.id.btnCalcular).setOnClickListener(view -> calcular());

        return v;
    }
    private void calcular() {
        try {
            double area = Double.parseDouble(edtBase.getText().toString()) *
                    Double.parseDouble(edtAltura.getText().toString()) / 2;

            txtResultado.setText("La respuesta es: " + area);
        } catch (NumberFormatException e) {
            txtResultado.setText("Error: Ingrese números");
        }
    }
}