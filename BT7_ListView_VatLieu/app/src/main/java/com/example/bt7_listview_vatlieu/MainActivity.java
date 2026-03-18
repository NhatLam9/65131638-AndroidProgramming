package com.example.bt7_listview_vatlieu;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    // Dữ liệu mẫu
    String[] vatLieu = {
            "Xi măng",
            "Gạch",
            "Đá ốp lát",
            "Ống nhựa",
            "Sơn chống thấm",
            "..."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // Adapter để đổ dữ liệu vào ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.item,
                vatLieu
        );
        listView.setAdapter(adapter);
        listView.setAdapter(adapter);
    }
}