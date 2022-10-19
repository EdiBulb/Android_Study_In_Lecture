package org.techtown.android_study_in_lecture;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Chap7Project7_2 extends AppCompatActivity {

    //전역변수 선언
    LinearLayout baseLayout;
    Button button1, button2;

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
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
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflater = getMenuInflater();

        //선택한 위젯에 따라서 인플레이트 하는 메뉴XML을 다르게 한다.
        if(v == button1){
            menu.setHeaderTitle("배경색 변경");
            mInflater.inflate(R.menu.menu2_1, menu);
        }
        if(v == button2){
            mInflater.inflate(R.menu.menu2_2, menu);
        }

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap7_project72);

        setTitle("배경색 바꾸기(컨텍스트 메뉴)");

        //위젯 연결
        baseLayout = findViewById(R.id.baseLayout);
        button1 = findViewById(R.id.button1);

        //이게 뭐지?
        //버튼 위젯을 registerForContextMenu()에 등록한다.
        //버튼 1을 메뉴를 사용할 위젯을 등록하는 것
        registerForContextMenu(button1);

        button2 = findViewById(R.id.button2);
        //버튼 2를 메뉴를 사용할 위젯으로 등록한다.
        registerForContextMenu(button2);
    }
}