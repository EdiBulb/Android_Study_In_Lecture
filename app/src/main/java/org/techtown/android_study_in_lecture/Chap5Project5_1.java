package org.techtown.android_study_in_lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/*xml파일 없이 자바 파일로만 화면 만드는 연습*/
public class Chap5Project5_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //xml 삭제
//        setContentView(R.layout.activity_chap5_project51);

        //리니어 레이아웃 파라미터 생성
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        //리니어 레이아웃 생성
        LinearLayout baseLayout = new LinearLayout(this);
        //리니어 레이아웃 orientation 설정
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        //리니어 레이아웃 배경색 설정
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));
        //설정하기
        setContentView(baseLayout,params);

        //버튼 만들기
        Button btn = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.MAGENTA);
        baseLayout.addView(btn);

        //버튼 클릭 이벤트 처리
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "코드로 생성한 버튼입니다.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}