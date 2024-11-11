package com.example.joeks;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity; //
import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.FusedLocationProviderClient;

import java.util.ArrayList;
import java.util.Random;





public class MainActivity extends AppCompatActivity {




    //XML ELEMS
    private TextView textViewJoke;
    private ArrayList<String> jokesList = new ArrayList<>();

    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;
    private FusedLocationProviderClient fusedLocationClient;
    private ArrayList<Location> locations = new ArrayList<Location>();




    //ONCREATE
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicjalizacja elementów interfejsu
        textViewJoke = findViewById(R.id.textViewJoke);
        ImageButton generateJokeButton = findViewById(R.id.generateJokeButton);

        // Lista sucharów
        jokesList.add("Dlaczego komputerowi jest zimno? Bo ma dużo cache!");
        jokesList.add("Jaka jest ulubiona gra programisty? Debugowanie!");
        jokesList.add("Czemu programista nie używa map? Bo już ma GPS!");

        // Ustawienie listenera na przycisk
        generateJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomJoke();
            }
        });
    }




    //VOIDS
//    private void getLocation() {
//        // Sprawdzenie uprawnień
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, LOCATION_PERMISSION_REQUEST_CODE);
//        } else {
//            // Uzyskanie lokalizacji
//            fusedLocationClient.getLastLocation()
//                    .addOnSuccessListener(this, location -> {
//                        if (location != null) {
//                            // Dodanie współrzędnych do tablicy
//                            locations.add(location);
//                            Toast.makeText(MainActivity.this, "Współrzędne: " + location.getLatitude() + ", " + location.getLongitude(), Toast.LENGTH_SHORT).show();
//                        } else {
//                            Toast.makeText(MainActivity.this, "Nie można uzyskać lokalizacji.", Toast.LENGTH_SHORT).show();
//                        }
//                    });
//        }
//    }

    private void showRandomJoke() {
        Random random = new Random();
        int index = random.nextInt(jokesList.size());
        String joke = jokesList.get(index);
        textViewJoke.setText(joke);
    }
}
