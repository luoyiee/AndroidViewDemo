package com.hr.nipuream.luckpan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.hr.nipuream.luckpan.view.LuckPanLayout;
import com.hr.nipuream.luckpan.view.RotatePan;

/**
 * @author 学客
 */
public class MainActivity extends AppCompatActivity implements LuckPanLayout.AnimationEndListener {

    private RotatePan rotatePan;
    private LuckPanLayout luckPanLayout;
    private ImageView goBtn;
    private ImageView yunIv;
    private String[] strArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        strArray = getResources().getStringArray(R.array.names);
        luckPanLayout = findViewById(R.id.luckpan_layout);
        luckPanLayout.setAnimationEndListener(this);
        goBtn = findViewById(R.id.go);
        yunIv = findViewById(R.id.yun);
    }

    public void rotation(View view) {
        luckPanLayout.rotate(-1, 100);
    }

    @Override
    public void endAnimation(int position) {
        Toast.makeText(this, "Position = " + position + "," + strArray[position], Toast.LENGTH_SHORT).show();
    }


}
