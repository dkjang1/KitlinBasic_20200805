package com.kakao.kitlinbasic_20200805

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ctrl+/ : 주석처리
        clickMeBtn.setOnClickListener {
//            중괄호내부코드 클릭할경우 실행코드
            Log.d("버튼클릭됨","ClickMe버튼눌림!")
            Toast.makeText(this,"ClickMe버튼이 눌림", Toast.LENGTH_SHORT).show()
        }

        secondBtn.setOnClickListener {
            Log.d("버튼눌림","두번째버튼눌림!!")
//            Log.d("로그종류","로그내용") log debug
//            Log.e("에러로그","에러내용") log error
//            Log.i("정보로그","정보내용") log information
        }

    }
}