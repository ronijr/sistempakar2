package com.example.apps.com.sistempakar2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.submit) Button submit;
    @BindView(R.id.g01) CheckBox g01;
    @BindView(R.id.g02) CheckBox g02;
    @BindView(R.id.g03) CheckBox g03;
    @BindView(R.id.g04) CheckBox g04;
    @BindView(R.id.g05) CheckBox g05;
    @BindView(R.id.g06) CheckBox g06;
    @BindView(R.id.g07) CheckBox g07;
    @BindView(R.id.g08) CheckBox g08;
    @BindView(R.id.g09) CheckBox g09;
    @BindView(R.id.g010) CheckBox g10;
    @BindView(R.id.g011) CheckBox g11;
    @BindView(R.id.g012) CheckBox g12;
    @BindView(R.id.g013) CheckBox g13;
    @BindView(R.id.g014) CheckBox g14;
    @BindView(R.id.g015) CheckBox g15;
    @BindView(R.id.g016) CheckBox g16;
    @BindView(R.id.g017) CheckBox g17;
    @BindView(R.id.g018) CheckBox g18;
    @BindView(R.id.g019) CheckBox g19;
    @BindView(R.id.g020) CheckBox g20;
    @BindView(R.id.g021) CheckBox g21;
    @BindView(R.id.g022) CheckBox g22;
    @BindView(R.id.g023) CheckBox g23;
    @BindView(R.id.g024) CheckBox g24;
    @BindView(R.id.g025) CheckBox g25;
    @BindView(R.id.g026) CheckBox g26;
    @BindView(R.id.g027) CheckBox g27;
    @BindView(R.id.g028) CheckBox g28;
    @BindView(R.id.g029) CheckBox g29;

    Database database;
    Diagnosa modeldiagnosa;
    String penyakit1,penyakit2,penyakit3,penyakit4,penyakit5 = "";
    String persen1,persen2,persen3,persen4,persen5 ="";
    String code1,code2,code3,code4,code5="";
    Intent intents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database = new Database(this);
        ButterKnife.bind(this);
        intents = getIntent();
        inisialisasiView();
        setTitle("Pilih Gejala");
    }

    private void inisialisasiView(){

        setDiagnosa();


    }

    private void setDiagnosa(){

        //Penyakit 1
        database.addDiagnosa(new Diagnosa("G01",0.7,0.4,"P1","Memiliki Interaksi sosial yang sedikit dengan orang lain (merasa canggung)"));
        database.addDiagnosa(new Diagnosa("G02",0.6,0.2,"P1","Sulit mengerti isyarat sosial"));
        database.addDiagnosa(new Diagnosa("G03",0.6,0.1,"P1","Tidak dapat mengenali perbedaan nada bicara"));
        database.addDiagnosa(new Diagnosa("G04",0.8,0.3,"P1","Sensitif atau kepekaan yang tinggi terhadap rangsangan sensorik"));
        database.addDiagnosa(new Diagnosa("G05",0.7,0.4,"P1","Memiliki keterlambatan motorik"));
        database.addDiagnosa(new Diagnosa("G06",0.6,0.3,"P1","Mempunyai minat yang terbatas terhadap suatu hal"));
        database.addDiagnosa(new Diagnosa("G07",0.6,0.4,"P1","Terobsesi dengan hal-hal yang kompleks"));
        database.addDiagnosa(new Diagnosa("G08",0.8,0.2,"P1","Memliki kemampuan kognitif nonverbal dibawah rata-rata dna kemampuan kognitif verbalnya diatas rata-rata"));

        //Penyakit 2
        database.addDiagnosa(new Diagnosa("G09",0.6,0.1,"P2","Pertumbuhan kepala yang lambat"));
        database.addDiagnosa(new Diagnosa("G10",0.7,0.4,"P2","Saat anak menginjak usia 1 sampai 4 tahun, kemampuan bersosialisasi dan berbicara si anak akan memburuk"));
        database.addDiagnosa(new Diagnosa("G11",0.8,0.2,"P2","Anak akan berjalan secara canggung atau memiliki gaya jalan yang kaku"));

        //Penyakit 3
        database.addDiagnosa(new Diagnosa("G12",0.6,0.3,"P3","Penurunan kemampuan berbicara dan percakapan yang jelek"));
        database.addDiagnosa(new Diagnosa("G13",0.6,0.2,"P3","Keterampilan sosial buruk"));
        database.addDiagnosa(new Diagnosa("G14",0.8,0.4,"P3","Kehilangan minat bermain imajiner dan dalam berbagai permainan dan aktivitas"));
        database.addDiagnosa(new Diagnosa("G15",0.6,0.2,"P3","Penurunan dalam kemampuan berjalan, memanjat, pegang benda dan melakukan gerakan lainnya"));
        database.addDiagnosa(new Diagnosa("G16",0.6,0.3,"P3","Seringnya terjadi kecelakaan pada anak yang sedang dilatih ke toilet"));

        //Penyakit 4
        database.addDiagnosa(new Diagnosa("G17",0.5,0.2,"P4","Perkembangan berkomunikasi berjalan lambat"));
        database.addDiagnosa(new Diagnosa("G18",0.7,0.2,"P4","Lebih suka menyendiri"));
        database.addDiagnosa(new Diagnosa("G19",0.7,0.4,"P4","Tidak tertarik bermain bersama teman"));
        database.addDiagnosa(new Diagnosa("G20",0.6,0.1,"P4","Mengalami gangguan sensoris"));
        database.addDiagnosa(new Diagnosa("G21",0.6,0.3,"P4","Mempunyai pola bermain yang berbeda dengan anak-anak normal lain"));
        database.addDiagnosa(new Diagnosa("G22",0.8,0.2,"P4","Berperilaku berlebihan (hiperaktif) dan kadang kala kekurangan (hipoaktif)"));
        database.addDiagnosa(new Diagnosa("G23",0.6,0.2,"P4","Memiliki emosi yang labil (sering marah-marah, tertawa atau menangis tanpa alasan yang jelas)"));

        //Penyakit 5
        database.addDiagnosa(new Diagnosa("G24",0.5,0.2,"P4","Tidak mampu untuk memulai suatu pembicaraan atau memelihara suatu pembicaraan dua arah yang baik"));
        database.addDiagnosa(new Diagnosa("G25",0.6,0.2,"P4","Tidak mampu untuk mencari teman, berbagi kesenangan dan melakukan sesuatu bersama-sama"));
        database.addDiagnosa(new Diagnosa("G26",0.8,0.4,"P4","Aktivitas, perilaku dan interesnya sangat terbatas, diulang-ulang dan stereotipik"));
        database.addDiagnosa(new Diagnosa("G27",0.8,0.1,"P4","Adanya preokupasi dengan bagian benda/mainan tertentu yang tak berguna"));
        database.addDiagnosa(new Diagnosa("G28",0.7,0.4,"P4","Rasa takut yang tak wajar"));
        database.addDiagnosa(new Diagnosa("G29",0.5,0.1,"P4","Menunjukkan ekspresi fasial"));



        g01.setText(database.getDiagnosa("G01").getName());
        g02.setText(database.getDiagnosa("G02").getName());
        g03.setText(database.getDiagnosa("G03").getName());
        g04.setText(database.getDiagnosa("G04").getName());
        g05.setText(database.getDiagnosa("G05").getName());
        g06.setText(database.getDiagnosa("G06").getName());
        g07.setText(database.getDiagnosa("G07").getName());
        g08.setText(database.getDiagnosa("G08").getName());
        g09.setText(database.getDiagnosa("G09").getName());
        g10.setText(database.getDiagnosa("G10").getName());
        g11.setText(database.getDiagnosa("G11").getName());
        g12.setText(database.getDiagnosa("G12").getName());
        g13.setText(database.getDiagnosa("G13").getName());
        g14.setText(database.getDiagnosa("G14").getName());
        g15.setText(database.getDiagnosa("G15").getName());
        g16.setText(database.getDiagnosa("G16").getName());
        g17.setText(database.getDiagnosa("G17").getName());
        g18.setText(database.getDiagnosa("G18").getName());
        g19.setText(database.getDiagnosa("G19").getName());
        g20.setText(database.getDiagnosa("G20").getName());
        g21.setText(database.getDiagnosa("G21").getName());
        g22.setText(database.getDiagnosa("G22").getName());
        g23.setText(database.getDiagnosa("G23").getName());
        g24.setText(database.getDiagnosa("G24").getName());
        g25.setText(database.getDiagnosa("G25").getName());
        g26.setText(database.getDiagnosa("G26").getName());
        g27.setText(database.getDiagnosa("G27").getName());
        g28.setText(database.getDiagnosa("G28").getName());
        g29.setText(database.getDiagnosa("G29").getName());

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!g01.isChecked() && !g02.isChecked()  && !g03.isChecked() && !g04.isChecked() && !g05.isChecked() && !g06.isChecked() && !g07.isChecked() && !g08.isChecked() && !g09.isChecked() && !g10.isChecked() && !g11.isChecked()
                        && !g12.isChecked() && !g13.isChecked() && !g14.isChecked() && !g15.isChecked() && !g16.isChecked()
                        && !g17.isChecked() && !g18.isChecked() && !g19.isChecked() &&
                        !g20.isChecked() && !g21.isChecked() && !g22.isChecked() && !g23.isChecked()
                        && !g24.isChecked() &&  !g25.isChecked() &&  !g26.isChecked() &&  !g27.isChecked()
                        && !g28.isChecked() && !g29.isChecked()){
                    Toast.makeText(getApplicationContext(),"Pilih gejala",Toast.LENGTH_SHORT).show();
                }else{
                    caculationDiagnosa();
                }
            }
        });

    }

    private void caculationDiagnosa(){
        Intent intent = new Intent(MainActivity.this, HasilDiagnosaActivity.class);

        if(g01.isChecked() || g02.isChecked() || g03.isChecked() || g04.isChecked() || g05.isChecked() || g06.isChecked() || g07.isChecked() || g08.isChecked()){
            double cf1p1 = 0,cf2p1 =0;
            double cf3p1 = 0,cf4p1= 0;
            double cf5p1 = 0,cf6p1= 0;
            double cf7p1 = 0,cf8p1= 0;

            if(g01.isChecked()){
                cf1p1 = Math.floor((database.getDiagnosa("G01").getMb() * database.getDiagnosa("G01").getMd()) *100)/100;
            }

            if(g02.isChecked()){
                cf2p1 = Math.floor((database.getDiagnosa("G02").getMb() * database.getDiagnosa("G02").getMd())*100)/100;
            }

            if(g03.isChecked()){
                cf3p1 = Math.floor((database.getDiagnosa("G03").getMb() * database.getDiagnosa("G03").getMd() * 100)) / 100;
            }

            if(g04.isChecked()){
                cf4p1 = Math.floor((database.getDiagnosa("G04").getMb() * database.getDiagnosa("G04").getMd()) * 100) /100;
            }

            if(g05.isChecked()){
                cf4p1 = Math.floor((database.getDiagnosa("G05").getMb() * database.getDiagnosa("G05").getMd()) * 100) /100;
            }

            if(g06.isChecked()){
                cf4p1 = Math.floor((database.getDiagnosa("G06").getMb() * database.getDiagnosa("G06").getMd()) * 100) /100;
            }

            if(g07.isChecked()){
                cf4p1 = Math.floor((database.getDiagnosa("G07").getMb() * database.getDiagnosa("G07").getMd()) * 100) /100;
            }

            if(g08.isChecked()){
                cf4p1 = Math.floor((database.getDiagnosa("G08").getMb() * database.getDiagnosa("G08").getMd()) * 100) /100;
            }

            double cfpp1_2 = cf1p1 + cf2p1 * (1 - cf1p1);
            double cfpp1_3 = cfpp1_2 + cf3p1 * (1 - cfpp1_2);
            double cfpp2_4 = cfpp1_3 + cf4p1 * (1 - cfpp1_3);
            double cfpp1_5 = cfpp2_4 + cf5p1 * (1 - cfpp2_4);
            double cfpp1_6 = cfpp1_5 + cf6p1 * (1 - cfpp1_5);
            double cfpp1_7 = cfpp1_6 + cf7p1 * (1 - cfpp1_6);
            double cfpp1_8 = cfpp1_7 + cf8p1 * (1 - cfpp1_7);
            cfpp1_8 = Math.floor(cfpp1_8 * 100) / 100;
            double persen = cfpp1_8 * 100;
            persen1 = String.valueOf(Math.round(persen));
            penyakit1 = "Sindrom Asperger";
            code1 ="P1";
            intent.putExtra("persen1",persen1);
            intent.putExtra("penyakit1",penyakit1);
            intent.putExtra("code1",code1);

        }


        if(g09.isChecked() || g10.isChecked() || g11.isChecked()){
            double cf1p2 = 0,cf2p2 =0;
            double cf3p2 = 0;
            if(g09.isChecked()){
                cf1p2 = Math.floor((database.getDiagnosa("G09").getMb() * database.getDiagnosa("G09").getMd()) *100)/100;
            }

            if(g10.isChecked()){
                cf2p2 = Math.floor((database.getDiagnosa("G10").getMb() * database.getDiagnosa("G10").getMd())*100)/100;
            }

            if(g11.isChecked()){
                cf3p2 = Math.floor((database.getDiagnosa("G11").getMb() * database.getDiagnosa("G11").getMd() * 100)) / 100;
            }


            double cfpp2_1 = cf1p2 + cf2p2 * (1 - cf1p2);
            double cfpp2_2 = cfpp2_1 + cf3p2 * (1 - cfpp2_1);
            cfpp2_2 = Math.floor(cfpp2_2 * 100) / 100;
            double persen = cfpp2_2 * 100;
            persen2 = String.valueOf(Math.round(persen));
            penyakit2 = "Rett Syndrome";
            code2 = "P2";

            //Penyakit 2
            intent.putExtra("persen2",persen2);
            intent.putExtra("penyakit2",penyakit2);
            intent.putExtra("code2",code2);

        }

        if(g12.isChecked() || g13.isChecked() || g14.isChecked() || g15.isChecked() || g16.isChecked()){
            double cf1p3 = 0,cf2p3 =0;
            double cf3p3 = 0,cf4p3= 0;
            double cf5p3 = 0;

            if(g12.isChecked()){
                cf1p3 = Math.floor((database.getDiagnosa("G12").getMb() * database.getDiagnosa("G12").getMd()) *100)/100;
            }

            if(g13.isChecked()){
                cf2p3 = Math.floor((database.getDiagnosa("G13").getMb() * database.getDiagnosa("G13").getMd())*100)/100;
            }

            if(g14.isChecked()){
                cf3p3 = Math.floor((database.getDiagnosa("G14").getMb() * database.getDiagnosa("G14").getMd() * 100)) / 100;
            }

            if(g15.isChecked()){
                cf4p3 = Math.floor((database.getDiagnosa("G15").getMb() * database.getDiagnosa("G15").getMd()) * 100) /100;
            }

            if(g16.isChecked()){
                cf5p3 = Math.floor((database.getDiagnosa("G16").getMb() * database.getDiagnosa("G16").getMd()) * 100) /100;
            }

            double cfpp3_1 = cf1p3 + cf2p3 * (1 - cf1p3);
            double cfpp3_2 = cfpp3_1 + cf3p3 * (1 - cfpp3_1);
            double cfpp3_3 = cfpp3_2 + cf4p3 * (1 - cfpp3_2);
            double cfpp3_4 = cfpp3_3 + cf5p3 * (1 - cfpp3_3);
            cfpp3_4 = Math.floor(cfpp3_4 * 100) / 100;
            double persen = cfpp3_4 * 100;
            persen3 = String.valueOf(Math.round(persen));
            penyakit3 = "Childhood Disintegrative Disorder";
            code3 = "P3";
            //Penyakit 3
            intent.putExtra("persen3",persen3);
            intent.putExtra("penyakit3",penyakit3);
            intent.putExtra("code3",code3);

        }

        if(g17.isChecked() || g18.isChecked() || g19.isChecked() || g20.isChecked() || g21.isChecked() || g22.isChecked() || g23.isChecked()){
            double cf1p4 = 0,cf2p4 =0;
            double cf3p4 = 0,cf4p4= 0;
            double cf5p4 = 0,cf6p4= 0;
            double cf7p4 = 0;

            if(g17.isChecked()){
                cf1p4 = Math.floor((database.getDiagnosa("G17").getMb() * database.getDiagnosa("G17").getMd()) *100)/100;
            }

            if(g18.isChecked()){
                cf2p4 = Math.floor((database.getDiagnosa("G18").getMb() * database.getDiagnosa("G18").getMd())*100)/100;
            }

            if(g19.isChecked()){
                cf3p4 = Math.floor((database.getDiagnosa("G19").getMb() * database.getDiagnosa("G19").getMd() * 100)) / 100;
            }

            if(g20.isChecked()){
                cf4p4 = Math.floor((database.getDiagnosa("G20").getMb() * database.getDiagnosa("G20").getMd()) * 100) /100;
            }

            if(g21.isChecked()){
                cf4p4 = Math.floor((database.getDiagnosa("G21").getMb() * database.getDiagnosa("G21").getMd()) * 100) /100;
            }

            if(g22.isChecked()){
                cf4p4 = Math.floor((database.getDiagnosa("G22").getMb() * database.getDiagnosa("G22").getMd()) * 100) /100;
            }

            if(g23.isChecked()){
                cf4p4 = Math.floor((database.getDiagnosa("G23").getMb() * database.getDiagnosa("G23").getMd()) * 100) /100;
            }

            double cfpp4_1 = cf1p4 + cf2p4 * (1 - cf1p4);
            double cfpp4_2 = cfpp4_1 + cf3p4 * (1 - cfpp4_1);
            double cfpp4_3 = cfpp4_2 + cf4p4 * (1 - cfpp4_2);
            double cfpp4_4 = cfpp4_3 + cf5p4 * (1 - cfpp4_3);
            double cfpp4_5 = cfpp4_4 + cf6p4 * (1 - cfpp4_4);
            double cfpp4_6 = cfpp4_5 + cf7p4 * (1 - cfpp4_5);
            cfpp4_6 = Math.floor(cfpp4_6 * 100) / 100;
            double persen = cfpp4_6 * 100;
            persen4 = String.valueOf(Math.round(persen));
            penyakit4 = "PDD-NOS";
            code4 ="P4";

            //Penyakit 4
            intent.putExtra("persen4",persen4);
            intent.putExtra("penyakit4",penyakit4);
            intent.putExtra("code4",code4);
        }


        if(g24.isChecked() || g25.isChecked() || g26.isChecked() || g27.isChecked() || g28.isChecked() || g29.isChecked()){
            double cf1p5 = 0,cf2p5 =0;
            double cf3p5 = 0,cf4p5= 0;
            double cf5p5 = 0, cf6p5=0;

            if(g24.isChecked()){
                cf1p5 = Math.floor((database.getDiagnosa("G24").getMb() * database.getDiagnosa("G24").getMd()) *100)/100;
            }

            if(g25.isChecked()){
                cf2p5 = Math.floor((database.getDiagnosa("G25").getMb() * database.getDiagnosa("G25").getMd())*100)/100;
            }

            if(g26.isChecked()){
                cf3p5 = Math.floor((database.getDiagnosa("G26").getMb() * database.getDiagnosa("G26").getMd() * 100)) / 100;
            }

            if(g27.isChecked()){
                cf4p5 = Math.floor((database.getDiagnosa("G27").getMb() * database.getDiagnosa("G27").getMd()) * 100) /100;
            }

            if(g28.isChecked()){
                cf5p5 = Math.floor((database.getDiagnosa("G28").getMb() * database.getDiagnosa("G28").getMd()) * 100) /100;
            }

            if(g29.isChecked()){
                cf5p5 = Math.floor((database.getDiagnosa("G29").getMb() * database.getDiagnosa("G29").getMd()) * 100) /100;
            }

            double cfpp5_1 = cf1p5 + cf2p5 * (1 - cf1p5);
            double cfpp5_2 = cfpp5_1 + cf3p5 * (1 - cfpp5_1);
            double cfpp5_3 = cfpp5_2 + cf4p5 * (1 - cfpp5_2);
            double cfpp5_4 = cfpp5_3 + cf5p5 * (1 - cfpp5_3);
            double cfpp5_5 = cfpp5_4 + cf6p5 * (1 - cfpp5_4);
            cfpp5_5 = Math.floor(cfpp5_5 * 100) / 100;
            double persen = cfpp5_5 * 100;
            persen5 = String.valueOf(Math.round(persen));
            penyakit5 = "Childbood Autism";
            code5 ="P5";

            //Penyakit 5
            intent.putExtra("persen5",persen5);
            intent.putExtra("penyakit5",penyakit5);
            intent.putExtra("code5",code5);
        }


        intent.putExtra("nama",intents.getStringExtra("nama"));
        intent.putExtra("umur",intents.getStringExtra("umur"));
        intent.putExtra("jk",intents.getStringExtra("jk"));

        startActivity(intent);

    }

    @Override
    protected void onResume() {
        super.onResume();
        g01.setChecked(false);
        g02.setChecked(false);
        g03.setChecked(false);
        g04.setChecked(false);
        g05.setChecked(false);
        g06.setChecked(false);
        g07.setChecked(false);
        g08.setChecked(false);
        g09.setChecked(false);
        g10.setChecked(false);
        g11.setChecked(false);
        g12.setChecked(false);
        g13.setChecked(false);
        g14.setChecked(false);
        g15.setChecked(false);
        g16.setChecked(false);
        g17.setChecked(false);
        g18.setChecked(false);
        g19.setChecked(false);
        g20.setChecked(false);
        g21.setChecked(false);
        g22.setChecked(false);
        g23.setChecked(false);
        g24.setChecked(false);
        g25.setChecked(false);
        g26.setChecked(false);
        g27.setChecked(false);
        g28.setChecked(false);
        g29.setChecked(false);

    }
}
