package it.edu.graficicalcolo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

/**
 *     Grafici Java
 *     Copyright (C) 2021  Mario Cosenza
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

public class MainActivity extends AppCompatActivity {
Spinner app_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app_spinner = findViewById(R.id.app_spinner);
    }
    public void selectActivity(View view) {
        if (app_spinner.getSelectedItem().toString().equals("Root") || app_spinner.getSelectedItem().toString().equals("Radice") ) {
            startActivity(new Intent(getApplicationContext(), RootChart.class));
        }
        else
        {
            startActivity(new Intent(getApplicationContext(), ChartActivity_.class));
        }
    }
    public void onClickSettings (View view) {
        startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
    }



}
