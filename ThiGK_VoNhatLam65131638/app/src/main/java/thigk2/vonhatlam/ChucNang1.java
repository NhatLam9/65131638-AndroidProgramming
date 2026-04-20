package thigk2.vonhatlam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ChucNang1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chucnang1);

        EditText edtTien = findViewById(R.id.edtTien);
        EditText edtTyGia = findViewById(R.id.edtTyGia);
        TextView tvKetQua = findViewById(R.id.tvKetQua);
        Button btnTinh = findViewById(R.id.btnTinh);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double tien = Double.parseDouble(edtTien.getText().toString());
                    double tyGia = Double.parseDouble(edtTyGia.getText().toString());
                    double dola = tien / tyGia;
                    tvKetQua.setText("Kết quả: " + dola + " USD");
                } catch (Exception e) {
                    tvKetQua.setText("Vui lòng nhập số hợp lệ!");
                }
            }
        });
    }
}