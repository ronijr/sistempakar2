package com.example.apps.com.sistempakar2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HasilDiagnosaActivity extends AppCompatActivity {
    @BindView(R.id.persen1)
    TextView persen1;
    @BindView(R.id.penyakit1) TextView penyakit1;
    @BindView(R.id.deskripsi1) TextView desk1;
    @BindView(R.id.solusi1_1)TextView solusi1_1;
    @BindView(R.id.solusi1_2)TextView solusi1_2;


    @BindView(R.id.persen2) TextView persen2;
    @BindView(R.id.penyakit2) TextView penyakit2;
    @BindView(R.id.deskripsi2) TextView desk2;
    @BindView(R.id.solusi2_1)TextView solusi2_1;
    @BindView(R.id.solusi2_2)TextView solusi2_2;
    @BindView(R.id.solusi2_3)TextView solusi2_3;

    @BindView(R.id.persen3) TextView persen3;
    @BindView(R.id.penyakit3) TextView penyakit3;
    @BindView(R.id.deskripsi3) TextView desk3;
    @BindView(R.id.solusi3_1) TextView solusi3_1;
    @BindView(R.id.solusi3_2) TextView solusi3_2;
    @BindView(R.id.solusi3_3) TextView solusi3_3;
    @BindView(R.id.solusi3_4) TextView solusi3_4;
    @BindView(R.id.solusi3_5) TextView solusi3_5;
    @BindView(R.id.solusi3_6) TextView solusi3_6;

    @BindView(R.id.persen4) TextView persen4;
    @BindView(R.id.penyakit4) TextView penyakit4;
    @BindView(R.id.deskripsi4) TextView desk4;
    @BindView(R.id.solusi4_1)TextView solusi4_1;
    @BindView(R.id.solusi4_2)TextView solusi4_2;
    @BindView(R.id.solusi4_3)TextView solusi4_3;

    @BindView(R.id.persen5) TextView persen5;
    @BindView(R.id.penyakit5) TextView penyakit5;
    @BindView(R.id.deskripsi5) TextView desk5;
    @BindView(R.id.solusi5)TextView solusi5;

    @BindView(R.id.layout1)
    LinearLayout layout1;
    @BindView(R.id.layout2) LinearLayout layout2;
    @BindView(R.id.layout3) LinearLayout layout3;
    @BindView(R.id.layout4) LinearLayout layout4;
    @BindView(R.id.layout5) LinearLayout layout5;

    @BindView(R.id.nama) TextView nama;
    @BindView(R.id.jk) TextView jk;
    @BindView(R.id.umur) TextView umur;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_diagnosa);
        ButterKnife.bind(this);
        intent = getIntent();
        inisialisasiView();
    }

    @SuppressLint("SetTextI18n")
    private void inisialisasiView(){
        nama.setText(intent.getStringExtra("nama"));
        jk.setText(intent.getStringExtra("jk"));
        umur.setText(intent.getStringExtra("umur")+" Tahun");

        if(intent.getStringExtra("code1") != null){
            layout1.setVisibility(View.VISIBLE);
            persen1.setText(intent.getStringExtra("persen1")+"%");
            penyakit1.setText(intent.getStringExtra("penyakit1"));
            desk1.setText(getString(R.string.desk1));
            solusi1_1.setText(getString(R.string.solusi1_1));
            solusi1_2.setText(getString(R.string.solusi1_2));

        }else{
            layout1.setVisibility(View.GONE);
        }

        if(intent.getStringExtra("code2") != null){
            layout2.setVisibility(View.VISIBLE);
            persen2.setText(intent.getStringExtra("persen2")+"%");
            penyakit2.setText(intent.getStringExtra("penyakit2"));
            desk2.setText(getString(R.string.desk2));
            solusi2_1.setText(getString(R.string.solusi2_1));
            solusi2_2.setText(getString(R.string.solusi2_2));
            solusi2_3.setText(getString(R.string.solusi2_3));

        }else{
            layout2.setVisibility(View.GONE);
        }


        if(intent.getStringExtra("code3") != null){
            layout3.setVisibility(View.VISIBLE);
            persen3.setText(intent.getStringExtra("persen3")+"%");
            penyakit3.setText(intent.getStringExtra("penyakit3"));
            desk3.setText(getString(R.string.desk3));
            solusi3_1.setText(getString(R.string.solusi3_1));
            solusi3_2.setText(getString(R.string.solusi3_2));
            solusi3_3.setText(getString(R.string.solusi3_3));
            solusi3_4.setText(getString(R.string.solusi3_4));
            solusi3_5.setText(getString(R.string.solusi3_5));
            solusi3_6.setText(getString(R.string.solusi3_6));
        }else{
            layout3.setVisibility(View.GONE);
        }

        if(intent.getStringExtra("code4") != null){
            layout4.setVisibility(View.VISIBLE);
            persen4.setText(intent.getStringExtra("persen4")+"%");
            penyakit4.setText(intent.getStringExtra("penyakit4"));
            desk4.setText(getString(R.string.desk4));
            solusi4_1.setText(getString(R.string.solusi4_1));
            solusi4_2.setText(getString(R.string.solusi4_2));
            solusi4_3.setText(getString(R.string.solusi4_3));

        }else{
            layout4.setVisibility(View.GONE);
        }


        if(intent.getStringExtra("code5") != null){
            layout5.setVisibility(View.VISIBLE);
            persen5.setText(intent.getStringExtra("persen5")+"%");
            penyakit5.setText(intent.getStringExtra("penyakit5"));
            desk5.setText(getString(R.string.desk5));
            solusi5.setText(getString(R.string.solusi5));
        }else{
            layout5.setVisibility(View.GONE);
        }
    }
}
