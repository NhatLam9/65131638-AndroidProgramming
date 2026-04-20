package thigk2.vonhatlam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ChucNang3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.chucnang3);

        ListView lvDanhNhan = findViewById(R.id.lvDanhNhan);
        ArrayList<DanhNhan> list = new ArrayList<>();

        list.add(new DanhNhan(R.mipmap.ic_launcher, "Trần Hưng Đạo", "Nam Định"));
        list.add(new DanhNhan(R.mipmap.ic_launcher, "Quang Trung", "Bình Định"));
        list.add(new DanhNhan(R.mipmap.ic_launcher, "Võ Nguyên Giáp", "Quảng Bình"));
        list.add(new DanhNhan(R.mipmap.ic_launcher, "Lê Lợi", "Thanh Hóa"));
        list.add(new DanhNhan(R.mipmap.ic_launcher, "Hai Bà Trưng", "Mê Linh"));

        CustomAdapter adapter = new CustomAdapter(list);
        lvDanhNhan.setAdapter(adapter);
    }

    class CustomAdapter extends ArrayAdapter<DanhNhan> {
        public CustomAdapter(ArrayList<DanhNhan> data) {
            super(ChucNang3.this, 0, data);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.danhnhan, parent, false);
            }

            DanhNhan dn = getItem(position);

            ImageView img = convertView.findViewById(R.id.imgAvatar);
            TextView tvTen = convertView.findViewById(R.id.tvTen);
            TextView tvQue = convertView.findViewById(R.id.tvQue);

            img.setImageResource(dn.hinhAnh);
            tvTen.setText(dn.ten);
            tvQue.setText("Quê quán: " + dn.queQuan);

            return convertView;
        }
    }
}