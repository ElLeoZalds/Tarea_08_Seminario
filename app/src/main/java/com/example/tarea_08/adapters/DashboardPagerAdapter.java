package com.example.tarea_08.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tarea_08.fragments.ConfiguracionFragment;
import com.example.tarea_08.fragments.Ejercicio01Fragment;
import com.example.tarea_08.fragments.Ejercicio02Fragment;
import com.example.tarea_08.fragments.Ejercicio03Fragment;
import com.example.tarea_08.fragments.Ejercicio04Fragment;

public class DashboardPagerAdapter extends FragmentStateAdapter {

    public DashboardPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // En este punto se hace necesario el BACKEND (JAVA) de cada fragmento
        switch (position) {
            case 0: return new Ejercicio01Fragment();
            case 1: return new Ejercicio02Fragment();
            case 2: return new Ejercicio03Fragment();
            case 3: return new Ejercicio04Fragment();
            default: return new ConfiguracionFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
