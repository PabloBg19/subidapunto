package com.example.cunning_proyect;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class PickLocationActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LatLng selectedLocation;
    private Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_location); // Asegúrate de tener este XML

        btnConfirm = findViewById(R.id.btnConfirmLocation); // Botón "Confirmar Ubicación"

        // Inicializamos el mapa
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }

        // Botón para devolver las coordenadas
        btnConfirm.setOnClickListener(v -> {
            if (selectedLocation != null) {
                Intent resultIntent = new Intent();

                resultIntent.putExtra("LAT", selectedLocation.latitude);
                resultIntent.putExtra("LON", selectedLocation.longitude);
                setResult(RESULT_OK, resultIntent);
                finish(); // Cerramos el mapa y volvemos
            } else {
                Toast.makeText(this, "Por favor, selecciona un punto en el mapa", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        // Ubicación inicial (Madrid)
        LatLng madrid = new LatLng(40.4168, -3.7038);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(madrid, 12));

        // Instrucción visual
        Toast.makeText(this, "Toca el mapa para elegir ubicación", Toast.LENGTH_LONG).show();

        // Listener al tocar el mapa
        mMap.setOnMapClickListener(latLng -> {
            selectedLocation = latLng;
            mMap.clear(); // Borramos marcadores anteriores
            mMap.addMarker(new MarkerOptions().position(latLng).title("Ubicación Seleccionada"));
            btnConfirm.setEnabled(true);
        });
    }
}