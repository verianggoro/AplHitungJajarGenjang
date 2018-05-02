package com.devlat.veri.hitungjajargenjang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button BtnKell, BtnLuas, BtnReset;
    EditText InAlas, InTinggi, InSisiB;
    TextView OutHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnKell = (Button)findViewById(R.id.BtnKell);
        BtnLuas = (Button)findViewById(R.id.BtnLuas);
        BtnReset = (Button)findViewById(R.id.BtnReset);
        InAlas = (EditText)findViewById(R.id.InputAlas);
        InTinggi = (EditText)findViewById(R.id.InputTinggi);
        InSisiB = (EditText)findViewById(R.id.InputSisiB);
        OutHasil = (TextView)findViewById(R.id.TvHasil);

        BtnKell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (InAlas.length() == 0 && InSisiB.length() == 0 && InTinggi.length()==0){
                    Toast.makeText(getApplication(), "Hanya Kolom Sisi b dan Alas Yang terisi", Toast.LENGTH_LONG).show();
                }else if (InSisiB.length() == 0){
                    Toast.makeText(getApplication(), "Kolom Sisi b Harus terisi dan Kolom Tinggi Harus Kosong", Toast.LENGTH_LONG).show();
                }else if (InAlas.length() == 0){
                    Toast.makeText(getApplication(), "Kolom Alas harus terisi dan Kolom tinggi harus kosong", Toast.LENGTH_LONG).show();
                }else if (InTinggi.length() == 0){
                    int sisiA = Integer.parseInt(InAlas.getText().toString());
                    int sisiB = Integer.parseInt(InSisiB.getText().toString());
                    int hasil = 2 * (sisiA + sisiB);
                    OutHasil.setText(String.valueOf(hasil));
                }else if (InTinggi.length() == 0 && InAlas.length() == 0){
                    Toast.makeText(getApplication(), "Kolom Alas harus terisi", Toast.LENGTH_LONG).show();
                }else if (InTinggi.length() == 0 && InSisiB.length() == 0){
                    Toast.makeText(getApplication(), "Kolom Sisi b Harus Terisi", Toast.LENGTH_LONG).show();
                }else if (InSisiB.length() == 0 && InAlas.length() == 0){
                    Toast.makeText(getApplication(), "Kolom Sisi b dan Kolom Alas Harus Terisi", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplication(), "Kolom Tinggi Harus Kosong", Toast.LENGTH_LONG).show();
                }
            }
        });
        BtnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (InAlas.length() == 0 && InSisiB.length() == 0 && InTinggi.length() == 0){
                    Toast.makeText(getApplication(), "Kolom Alas dan Tinggi harus terisi", Toast.LENGTH_LONG).show();
                }else if (InSisiB.length() == 0){
                    int alas = Integer.parseInt(InAlas.getText().toString());
                    int tinggi = Integer.parseInt(InTinggi.getText().toString());
                    int hasil = alas * tinggi;
                    OutHasil.setText(String.valueOf(hasil));
                }else if (InTinggi.length() == 0){
                    Toast.makeText(getApplication(), "Kolom Tinggi Harus Terisi", Toast.LENGTH_LONG).show();
                }else if (InAlas.length() == 0){
                    Toast.makeText(getApplication(), "Kolom Alas Harus Terisi", Toast.LENGTH_LONG).show();
                }else if (InAlas.length() == 0 && InTinggi.length() == 0){
                    Toast.makeText(getApplication(), "Kolom Alas dan Tinggi Harus Terisi", Toast.LENGTH_LONG).show();
                }else if (InTinggi.length() == 0 && InSisiB.length() == 0){
                    Toast.makeText(getApplication(), "Kolom Tinggi Harus Terisi", Toast.LENGTH_LONG).show();
                }else if (InSisiB.length() == 0 && InAlas.length() == 0){
                    Toast.makeText(getApplication(), "Kolom Alas Harus Terisi", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplication(), "Kolom Sisi b Harus Kosong", Toast.LENGTH_LONG).show();
                }
            }
        });
        BtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InAlas.getText().clear();
                InTinggi.getText().clear();
                InSisiB.getText().clear();
                OutHasil.setText("0");
            }
        });
    }
}
