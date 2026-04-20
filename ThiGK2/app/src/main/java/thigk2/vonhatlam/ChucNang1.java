package thigk2.vonhatlam;

import android.os.Bundle;
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

        btnTinh.setOnClickListener(v -> {
            try {
                double tien = Double.parseDouble(edtTien.getText().toString());
                double tyGia = Double.parseDouble(edtTyGia.getText().toString());

                // Công thức quy đổi
                double dola = tien / tyGia;

                // Hiển thị kết quả
                tvKetQua.setText("Kết quả: " + dola + " USD");
            } catch (Exception e) {
                // Xử lý lỗi nếu người dùng không nhập số mà bấm nút
                tvKetQua.setText("Vui lòng nhập số hợp lệ!");
            }
        });
    }
}