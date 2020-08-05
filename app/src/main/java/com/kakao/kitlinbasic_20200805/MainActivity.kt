package com.kakao.kitlinbasic_20200805

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ctrl+/ : 주석처리
        clickMeBtn.setOnClickListener {
//            중괄호내부코드 클릭할경우 실행코드
            Log.d("버튼클릭됨","ClickMe버튼눌림!")
        }


    }
}