package thigk2.vonhatlam;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(v -> startActivity(new Intent(this, ChucNang1.class)));
        findViewById(R.id.btn2).setOnClickListener(v -> startActivity(new Intent(this, ChucNang2.class)));
        findViewById(R.id.btn3).setOnClickListener(v -> startActivity(new Intent(this, ChucNang3.class)));
        findViewById(R.id.btn4).setOnClickListener(v -> startActivity(new Intent(this, ChucNang4.class)));
    }
}