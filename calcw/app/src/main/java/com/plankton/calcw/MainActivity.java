package com.plankton.calcw;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    double input1=0, input2=0;
    EditText edit1;
    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal;
    Button tombol1, tombol2, tombol3, tombol4, tombol5, tombol6, tombol7, tombol8, tombol9,
           tombol0, tombol00, clear, persen, kur1, bagi, kali, kurang, tambah, titik, hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Calculator");

        tombol00= (Button) findViewById(R.id.tombol00);
        tombol0 = (Button) findViewById(R.id.tombol0);
        tombol1 = (Button) findViewById(R.id.tombol1);
        tombol2 = (Button) findViewById(R.id.tombol2);
        tombol3 = (Button) findViewById(R.id.tombol3);
        tombol4 = (Button) findViewById(R.id.tombol4);
        tombol5 = (Button) findViewById(R.id.tombol5);
        tombol6 = (Button) findViewById(R.id.tombol6);
        tombol7 = (Button) findViewById(R.id.tombol7);
        tombol8 = (Button) findViewById(R.id.tombol8);
        tombol9 = (Button) findViewById(R.id.tombol9);
        clear =   (Button) findViewById(R.id.clear);
        persen =  (Button) findViewById(R.id.persen);
        kur1 =    (Button) findViewById(R.id.kur1);
        bagi =    (Button) findViewById(R.id.bagi);
        kali =    (Button) findViewById(R.id.kali);
        kurang =  (Button) findViewById(R.id.kurang);
        tambah =  (Button) findViewById(R.id.tambah);
        titik =   (Button) findViewById(R.id.titik);
        hasil =   (Button) findViewById(R.id.hasil);

        edit1 = (EditText) findViewById(R.id.teks1);

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"1");
            }
        });
        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"2");
            }
        });
        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"3");
            }
        });
        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"4");
            }
        });
        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"5");
            }
        });
        tombol6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"6");
            }
        });
        tombol7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"7");
            }
        });
        tombol8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"8");
            }
        });
        tombol9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"9");
            }
        });
        tombol0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"0");
            }
        });
        tombol00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(edit1.getText()+"00");
            }
        });
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit1.getText().length() !=0){
                    input1= Float.parseFloat(edit1.getText()+"");
                    Addition = true;
                    decimal = false;
                    edit1.setText(null);
                }
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit1.getText().length() !=0){
                    input1= Float.parseFloat(edit1.getText()+"");
                    Subtract = true;
                    decimal = false;
                    edit1.setText(null);
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit1.getText().length() !=0){
                    input1= Float.parseFloat(edit1.getText()+"");
                    Multiplication = true;
                    decimal = false;
                    edit1.setText(null);
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit1.getText().length() !=0){
                    input1= Float.parseFloat(edit1.getText()+"");
                    Division = true;
                    decimal = false;
                    edit1.setText(null);
                }
            }
        });
        persen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit1.getText().length() !=0){
                    input1= Float.parseFloat(edit1.getText()+"");
                    mRemainder = true;
                    decimal = false;
                    edit1.setText(null);
                }
            }
        });
        kur1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edit1.getText().toString();
                if (str.length() >= 1){
                    str = str.substring(0, str.length() -1);
                    edit1.setText(str);
                }else if (str.length()<= 1){
                    edit1.setText("0");

                }
            }
        });
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division || mRemainder){
                    input2= Float.parseFloat(edit1.getText()+"");
                }
                if (Addition) {

                    edit1.setText(input1 + input2 + "");
                    Addition = false;
                }
                if (Subtract) {
                    edit1.setText(input1 - input2 + "");
                    Subtract = false;
                }
                if (Multiplication) {
                    edit1.setText(input1 * input2 + "");
                    Multiplication = false;
                }
                if (Division) {
                    edit1.setText(input1 / input2 + "");
                    Division = false;
                }
                if (mRemainder) {
                    edit1.setText(input1 % input2 + "");
                    mRemainder = false;
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText("");
                input1=0.0;
                input2=0.0;
            }
        });
        titik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal){

                }else {
                    edit1.setText(edit1.getText()+".");
                    decimal= true;
                }
            }
        });
     }
   }

