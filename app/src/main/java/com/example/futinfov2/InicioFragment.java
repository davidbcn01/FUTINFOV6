package com.example.futinfov2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.futinfov2.databinding.FragmentInicioBinding;

public class InicioFragment extends AppCompatActivity {

    FragmentInicioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_log_in);

    }
}