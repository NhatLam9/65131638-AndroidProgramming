package com.example.bt2_2_giaodien;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void xulyCong(View view) {
        // Tìm, tham chiếu đến điều khiển tập XML
        EditText editTextSoA = findViewById(R.id.inputA);
        EditText editTextSoB = findViewById(R.id.inputB);
        EditText editTextKetQua = findViewById(R.id.ketqua);

        // Lấy dữ liệu về
        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        // Chuyển dữ liệu text -> number
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);

        // Tính toán
        int tong = soA + soB;

        // Chuyển dữ liệu number -> text
        String strTong = String.valueOf(tong);

        editTextKetQua.setText(strTong);
    }
}