package com.example.esatgozcu.buttonnavigationviewyapimi;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TrendlerFragment extends Fragment {

    public static TrendlerFragment newInstance() {

        return new TrendlerFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_trendler, container, false);
    }
}
