package com.example.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NumeroPrimoView extends AppCompatActivity implements Primo.View{

    private TextView tvPrimo;
    private EditText edPrimo;
    private Primo.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPrimo = (TextView)findViewById(R.id.tvPrimo);
        edPrimo = (EditText)findViewById(R.id.edPrimo);
        presenter = new PrimoPresenter(this);
    }

    public void calcular(View view){
        presenter.Primo(edPrimo.getText().toString());
    }

    @Override
    public void showResult(String result) {
        tvPrimo.setText(result);
    }
}
