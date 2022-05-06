package com.example.week4uipractice_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.week4uipractice_v1.utils.ContextUtil

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
//2.        autoLogin이라는 자동 로그인 확인 불린 변수 생성 및 ContextUtil의 오토로그인 값대입
        val autoLogin = ContextUtil.getAutoLogin(this)

//        1. 2.5초의 딜레이를 주는 Hantler

        val myHandler = Handler(Looper.getMainLooper())
        myHandler.postDelayed({
            val myIntent = if (autoLogin) {
                Intent(this, MainActivity::class.java)
            } else {
                Intent(this, LoginActivity::class.java)
            }
            startActivity(myIntent)

        }, 2500)
    }
}