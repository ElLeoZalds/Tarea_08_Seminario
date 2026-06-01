package com.example.tarea_08.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.tarea_08.R;
import org.w3c.dom.Text;

public class Ejercicio01Fragment extends Fragment {
    private EditText edt1, edt2;
    private TextView txtResultado;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    // Asociar el fragment con el XML
        View v = inflater.inflate(R.layout.activity_ejercicio01, container, false);

        edt1 = v.findViewById(R.id.edtNum1);
        edt2 = v.findViewById(R.id.edtNum2);
        txtResultado = v.findViewById(R.id.txtResultado);

        v.findViewById(R.id.btnCalcular).setOnClickListener(view -> calcular());

        return v;
    }
    private void calcular() {
        try {
            double suma = Double.parseDouble(edt1.getText().toString()) +
                    Double.parseDouble(edt2.getText().toString());

            txtResultado.setText("La respuesta es: " + suma);
        } catch (NumberFormatException e) {
            txtResultado.setText("Error: Ingrese números");
        }
    }
}