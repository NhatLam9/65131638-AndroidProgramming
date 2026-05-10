package com.vonhatlam.vieccanlam;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class ThemTaskActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_task);
        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton3);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextName = findViewById(R.id.editTextTenCV);
                EditText editTextMessage = findViewById(R.id.editTextMessage);
                EditText editTextPriority = findViewById(R.id.editTextPriority);
                EditText editTextDate = findViewById(R.id.editTextDate);

                String tenCV = editTextName.getText().toString();
                String message = editTextMessage.getText().toString();
                String priority = editTextPriority.getText().toString();
                String date = editTextDate.getText().toString();

                Task task = new Task(message, tenCV, date, priority);

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference databaseReference = database.getReference("Task");

                String key = databaseReference.push().getKey();

                HashMap<String, Object> item = new HashMap<String, Object>();
                item.put(key, task.toFireBaseObject());

                databaseReference.updateChildren(item, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                        if (error == null) finish();
                    }
                });
            }
        });
    }
}

