package com.example.esatgozcu.buttonnavigationviewyapimi;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AnasayfaFragment extends Fragment {

    public static AnasayfaFragment newInstance() {

        return new AnasayfaFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_anasayfa, container, false);
    }
}
