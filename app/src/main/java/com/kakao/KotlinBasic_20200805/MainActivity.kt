package com.kakao.KotlinBasic_20200805

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ctrl+/ : 주석처리
        clickMeBtn.setOnClickListener {
//            중괄호내부코드 클릭할경우 실행코드
            Log.d("버튼클릭됨", "ClickMe버튼눌림!")
            Toast.makeText(this, "ClickMe버튼이 눌림", Toast.LENGTH_SHORT).show()
        }

        secondBtn.setOnClickListener {
            Log.d("버튼눌림", "두번째버튼눌림!!")
//            Log.d("로그종류","로그내용") log debug
//            Log.e("에러로그","에러내용") log error
//            Log.i("정보로그","정보내용") log information

            Toast.makeText(this, "두번째버튼눌림!", Toast.LENGTH_SHORT).show()
        }

//        복사하기 버튼클릭할경우
        copyBtn.setOnClickListener {
//            messageEdt -> copyResultTxt 복사
            val inputMessage = messageEdt.text.toString()

//            입력한내용이 5자미만일경우 토스트 "5자이상입력하세요"
//            입력한내용이 5자이상 10자미만 일경우 로그 "10자이상 입력하세요"
//            입력한내용이 5자이상일경우 문구반영
            if (inputMessage.length < 5) {
                Toast.makeText(this,"5자이상 입력하세요.",Toast.LENGTH_SHORT).show()
            } else if (inputMessage.length < 10){
                Log.d("입력메세지", "10자이상 입력하세요")
            } else {

            }


            copyResultTxt.text = inputMessage

        }

    }
}