package org.techtown.android_study_in_lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Chap6Exam1516Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap6_exam1516);

        Button btn_Prev, btn_Next;
        final ViewFlipper vFlipper;

        btn_Prev = (Button) findViewById(R.id.btn_Prev);
        btn_Next = (Button) findViewById(R.id.btn_Next);
        vFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);
        
        //이전화면 버튼을 눌렀을 경우
        btn_Prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showPrevious(); //이전 화면 보여주기
            }
        });
        //다음화면 버튼을 눌렀을 경우
        btn_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showNext(); //다음 화면 보여주기
            }
        });
    }
}