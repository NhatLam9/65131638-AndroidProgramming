package com.example.bt4_linearlayout_tong2so_2;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtSo1, edtSo2, edtKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);
        edtKetqua = findViewById(R.id.edtKetqua);
    }

    public void xulyCong(View v){
        double a = Double.parseDouble(edtSo1.getText().toString());
        double b = Double.parseDouble(edtSo2.getText().toString());
        double kq = a + b;
        edtKetqua.setText(String.valueOf(kq));
    }

    public void xulyTru(View v){
        double a = Double.parseDouble(edtSo1.getText().toString());
        double b = Double.parseDouble(edtSo2.getText().toString());
        double kq = a - b;
        edtKetqua.setText(String.valueOf(kq));
    }

    public void xulyNhan(View v){
        double a = Double.parseDouble(edtSo1.getText().toString());
        double b = Double.parseDouble(edtSo2.getText().toString());
        double kq = a * b;
        edtKetqua.setText(String.valueOf(kq));
    }

    public void xulyChia(View v){
        double a = Double.parseDouble(edtSo1.getText().toString());
        double b = Double.parseDouble(edtSo2.getText().toString());

        if(b == 0){
            edtKetqua.setText("Không thể chia cho 0");
        } else {
            double kq = a / b;
            edtKetqua.setText(String.valueOf(kq));
        }
    }
}
