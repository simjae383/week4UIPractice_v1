package com.example.week4uipractice_v1.utils

import android.content.Context

class ContextUtil {
//    1. 전역에서 ContextUtil의 함수를 사용하기 위해 companion object 안에서 함수 코딩
    companion object {
//    2. 메모를 적을 메모장(prefName)의 이름을 지정, get/set 함수에서 사용할 태그 작성(AUTO_LOGIN)
        private val prefName = "UIPracticepref"
        private val AUTO_LOGIN = "AUTO_LOGIN"
//    3. set 함수
        fun setAutoLogin(context: Context, autoLogin: Boolean){
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putBoolean(AUTO_LOGIN, autoLogin)
        }
//    4. get 함수 생성 -> 함수 옆에 자료형을 붙여줌으로서 return으로 결과값 부여
        fun getAutoLogin(context: Context) : Boolean {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return  pref.getBoolean(AUTO_LOGIN, false)
        }
//    5. 로그아웃시 모든 메모를 삭제하기
        fun clear(context: Context) {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit()
                .clear()
                .apply()
        }
    }
}