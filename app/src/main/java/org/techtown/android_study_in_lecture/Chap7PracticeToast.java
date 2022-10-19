package org.techtown.android_study_in_lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Chap7PracticeToast extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap7_practice_toast);

        //이름
        setTitle("토스트 연습");

        final Button button1 = findViewById(R.id.button1);

        //button1이 눌렸을 떄
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast 객체 생성
                Toast tMsg = Toast.makeText(Chap7PracticeToast.this, "토스트 연습",Toast.LENGTH_SHORT);

                //질문 - Display가 뭔지는 잘 모르겠음.
                Display display = ((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();

                int xOffset = (int)(Math.random()*display.getWidth());
                int yOffset = (int)(Math.random()*display.getHeight());

                //setGravity()로 위치 변경
                tMsg.setGravity(Gravity.TOP | Gravity.LEFT, xOffset,yOffset);
                tMsg.show();
            }
        });
    }
}