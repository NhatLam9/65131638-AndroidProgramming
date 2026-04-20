package thigk2.vonhatlam;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ChucNang2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chucnang2);

        ListView lvBaiHat = findViewById(R.id.lvBaiHat);


        String[] arrBaiHat = {
                "Tiến Quân Ca", "Lên Đàng", "Màu Hoa Đỏ",
                "Cô Gái Mở Đường", "Chào em cô gái Lam Hồng",
                "Trường Sơn Đông Trường Sơn Tây", "Nơi Đảo Xa",
                "Tự Nguyện", "Giai Điệu Tổ Quốc", "Võ Nhật Lâm"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrBaiHat);
        lvBaiHat.setAdapter(adapter);
    }
}