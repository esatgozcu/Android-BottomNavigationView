package com.example.esatgozcu.buttonnavigationviewyapimi;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setupBottomNavigation();

        if (savedInstanceState == null) {

            AnasayfaFragmentYukle();
        }

    }

    private void setupBottomNavigation() {

        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.anasayfa:
                        AnasayfaFragmentYukle();
                        return true;
                    case R.id.trendler:
                        TrendlerFragmentYukle();
                        return true;
                    case R.id.abonelikler:
                        AboneliklerFragmentYukle();
                        return true;
                    case R.id.etkinlikler:
                        EtkinlikFragmentYukle();
                        return true;
                    case R.id.kitaplık:
                        KitaplikFragmentYukle();
                        return true;
                }
                return false;
            }
        });
    }

    private void AnasayfaFragmentYukle() {

        AnasayfaFragment fragment = AnasayfaFragment.newInstance();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_frame, fragment);
        ft.commit();
    }

    private void TrendlerFragmentYukle() {

        TrendlerFragment fragment = TrendlerFragment.newInstance();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_frame, fragment);
        ft.commit();
    }

    private void AboneliklerFragmentYukle() {

        AboneliklerFragment fragment = AboneliklerFragment.newInstance();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_frame, fragment);
        ft.commit();
    }
    private void EtkinlikFragmentYukle() {

        EtkinliklerFragment fragment = EtkinliklerFragment.newInstance();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_frame, fragment);
        ft.commit();
    }
    private void KitaplikFragmentYukle() {

        KitaplikFragment fragment = KitaplikFragment.newInstance();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_frame, fragment);
        ft.commit();
    }
}
