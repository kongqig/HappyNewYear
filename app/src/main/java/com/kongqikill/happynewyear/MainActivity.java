package com.kongqikill.happynewyear;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;
import android.graphics.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout root;
    private TextView text_title;
    private Button launcher;
    //动画播放器
    private VideoView v1;
    private VideoView v2;
    private VideoView v3;
    private VideoView v4;
    private VideoView v5;
    //火箭
    private ImageView hj1;
    private ImageView hj2;
    private ImageView hj3;
    private ImageView hj4;
    private ImageView hj5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        root = findViewById(R.id.root);
        text_title = (TextView) findViewById(R.id.text_title);
        launcher = (Button) findViewById(R.id.button_launcher);
        v1 = findViewById(R.id.video1);
        v2 = findViewById(R.id.video2);
        v3 = findViewById(R.id.video3);
        v4 = findViewById(R.id.video4);
        v5 = findViewById(R.id.video5);
        hj1 = findViewById(R.id.hj1);
        hj2 = findViewById(R.id.hj2);
        hj3 = findViewById(R.id.hj3);
        hj4 = findViewById(R.id.hj4);
        hj5 = findViewById(R.id.hj5);

        v1.setVisibility(View.GONE);
        v2.setVisibility(View.GONE);
        v3.setVisibility(View.GONE);
        v4.setVisibility(View.GONE);
        v5.setVisibility(View.GONE);

        launcher.setOnClickListener(MainActivity.this);

    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view) {
        if (view == launcher) {;
            //text_title.setTextColor(R.color.red);
            text_title.setTextColor(0xffff0000);
            text_title.setText(R.string.text_happynewyear);
            root.setBackground(getDrawable(R.drawable.newyear1));
            Animation jbdh2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.dh_jb2);
            root.startAnimation(jbdh2);
            /*ViewGroup.LayoutParams lp = text_title.getLayoutParams();
            lp.height = 1000;
            text_title.setLayoutParams(lp);*/
            //播放动画{
            //渐变动画
            Animation jbdh1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.dh_jb);
            text_title.startAnimation(jbdh1);
            //缩放动画
            Animation sfdh1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.dh_sf);
            text_title.startAnimation(sfdh1);
            //平移动画
            Animation pydh1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.dh_py);
            hj1.startAnimation(pydh1);
        }
    }
}