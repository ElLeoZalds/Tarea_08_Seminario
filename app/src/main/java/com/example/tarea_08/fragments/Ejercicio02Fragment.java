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

public class Ejercicio02Fragment extends Fragment {

    private EditText edt1, edt2;
    private TextView txtRespuesta;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Asociar el fragment con el XML
        View v = inflater.inflate(R.layout.activity_tarea01, container, false);

        edt1 = v.findViewById(R.id.edtNum1);
        edt2 = v.findViewById(R.id.edtNum2);
        txtRespuesta = v.findViewById(R.id.txtRespuesta);

        v.findViewById(R.id.btnRespuesta).setOnClickListener(view -> calcular());

        return v;
    }
    private void calcular() {
        try {
            double suma = Double.parseDouble(edt1.getText().toString()) *
                    Double.parseDouble(edt2.getText().toString());

            txtRespuesta.setText("La respuesta es: " + suma);
        } catch (NumberFormatException e) {
            txtRespuesta.setText("Error: Ingrese números");
        }
    }}
