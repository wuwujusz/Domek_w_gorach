package com.example.domek_w_gorach;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    private Button but_like;
    private Button but_delete;
    private Button but_save;
    private TextView likes;
    private int likes_count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        but_like = findViewById(R.id.like);
        but_delete = findViewById(R.id.delete);
        but_save =  findViewById(R.id.delete);
        likes =  findViewById(R.id.No_likes);


        but_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                likes_count++;
                likes.setText(likes_count + " polubień");
            }
        });

        but_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(likes_count > 0) {
                    likes_count--;
                    likes.setText(likes_count + " polubień");
                }
            }
        });
    }

}