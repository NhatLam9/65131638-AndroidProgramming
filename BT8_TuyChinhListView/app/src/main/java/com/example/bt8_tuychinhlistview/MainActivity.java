package com.example.bt8_tuychinhlistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvDSMonAn = (ListView) findViewById(R.id.lvdsMonAn);

        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        MonAn m1 = new MonAn("Cơm gà", R.drawable.comga, "Cơm và gà chiên giòn", 25000);
        MonAn m2 = new MonAn("Cơm chiên hải sản", R.drawable.comchienhaisan, "Cơm chiên cùng các loại hải sản", 30000);
        MonAn m3 = new MonAn("Cơm heo quay", R.drawable.comheoquay, "Cơm và heo quay giòn", 25000);
        MonAn m4 = new MonAn("Cơm sườn", R.drawable.comsuon, "Cơm sườn trứng", 25000);

        dsMonAn.add(m1);
        dsMonAn.add(m2);
        dsMonAn.add(m3);
        dsMonAn.add(m4);

        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);

        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonAn monAnChon = dsMonAn.get(position);
                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}