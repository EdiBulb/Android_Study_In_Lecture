package org.techtown.android_study_in_lecture;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Chap7PracticeDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap7_practice_dialog);

        //버튼 객체 생성
        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //String 배열 생성
                final String[] foodArray = new String[]{"한식", "일식","중식"};

                //다이얼로그 객체 생성
                AlertDialog.Builder dlg = new AlertDialog.Builder(Chap7PracticeDialog.this);
                dlg.setTitle("좋아하는 음식은."); // 제목 설정
//                dlg.setMessage("이곳이 내용입니다.");//내용 입력 (주의)목록 출력과 동시에 쓰일 수 없다.
                dlg.setIcon(R.mipmap.ic_launcher);//아이콘 설정

                //setItems() : 목록 출력
//                dlg.setItems(foodArray,
//                        new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                button1.setText(foodArray[i]); // 눌린 목록으로 버튼의 텍스트를 바꾼다.
//                            }
//                        });
                //setSingleChoiceItems() : 라디오 버튼 형태로 목록 출력
//                dlg.setSingleChoiceItems(foodArray, 0, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        button1.setText(foodArray[i]);//클릭된 값으로 바꾼다.
//                    }
//                });
                //setMultichoiceItems() : 체크박스 형태로 목록 출력
                //질문1 : checkArray의 역할을 모르겠음. 
                //해결1 : checkArray의 역할은 실행시 체크박스가 체크되어있을 것인가 결정하는 것임
                final boolean[] checkArray = new boolean[]{false,false,false};
                dlg.setMultiChoiceItems(foodArray, checkArray, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        button1.setText(foodArray[i]);
                    }
                });

//                dlg.setPositiveButton("확인",null);//ok 버튼 만들기
                //ok버튼 클릭 시 동작하게 만들기 : null대신 클릭 이벤트 만들기
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Chap7PracticeDialog.this,"확인을 눌렀네요.",Toast.LENGTH_SHORT).show();
                    }
                });
                //밑의 dlg.show()가 없으면 위의 setPositiveButton()도 실행 안됨.
                dlg.show();//대화상자 출력
            }
        });
    }
}