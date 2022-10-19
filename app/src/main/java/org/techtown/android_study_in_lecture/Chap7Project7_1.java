package org.techtown.android_study_in_lecture;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class Chap7Project7_1 extends AppCompatActivity {

    //전역변수 2개
    LinearLayout baseLayout;
    Button button1;

    //onCreateOptionsMenu()를 오버라이딩
    //옵션 메뉴를 만든다. - 이 메서드가 없으면 옵션 메뉴가 생기지 않는다.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //코드 작성 - 코드의 의미가 뭔지는 모르겠음. - 책 찾아보기
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    //메뉴를 클릭했을 떄 동작할 메소드 onOptionsItemSelected() 오버라이딩
    //메뉴를 선택했을 때 어떤 동작을 할 것 인지 정의한다.
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //코드 작성
        switch (item.getItemId()){
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;

            case R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.subRotate:
                button1.setRotation(45);
                return true;
            case R.id.subSize:
                button1.setScaleX(2);
                return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap7_project71);

        setTitle("배경색 바꾸기"); // 이건 뭐지?

        //아이디 지정
        baseLayout = findViewById(R.id.baseLayout);
        button1 = findViewById(R.id.button1);

    }
}