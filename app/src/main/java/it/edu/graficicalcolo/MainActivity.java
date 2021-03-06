package it.edu.graficicalcolo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * Grafici Java
 * Copyright (C) 2021  Mario Cosenza
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

public class MainActivity extends AppCompatActivity {
    Spinner app_spinner;
    AdView myadview;
    private String[] spinnerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app_spinner = findViewById(R.id.app_spinnerArea);
        spinnerText = getResources().getStringArray(R.array.functions_array);

        MobileAds.initialize(this, initializationStatus -> {
        });
        myadview = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        myadview.loadAd(adRequest);

    }


    public void selectActivity(View view) {
        if (app_spinner.getSelectedItem().toString().equals(spinnerText[0])) {
            startActivity(new Intent(getApplicationContext(), AreaActivity.class));
        } else if (app_spinner.getSelectedItem().toString().equals(spinnerText[1])) {
            startActivity(new Intent(getApplicationContext(), ChartActivity.class));
        } else if (app_spinner.getSelectedItem().toString().equals(spinnerText[2])) {
            startActivity(new Intent(getApplicationContext(), NumericActivity.class));
        } else {
            startActivity(new Intent(getApplicationContext(), RootChart.class));
        }
    }

    public void onClickSettings(View view) {
        startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
    }


}
