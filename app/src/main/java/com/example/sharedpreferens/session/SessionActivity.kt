package com.example.sharedpreferens.session

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreferens.R

class SessionActivity(context : Context){

    var session : SharedPreferences? =null
    var editor :SharedPreferences.Editor? = null

    //variabel key (nama variabel bagian edit text login)

    val  keypreferens ="login"
    val keyName = "username"
    val keyPass = "password"

    init {
        session=context.getSharedPreferences(keypreferens, Context.MODE_PRIVATE)
        editor = session?.edit()

    }

    fun sessionLogin(iduser:String ,idpass:String){
        editor?.putString(keyName,iduser)
        editor?.putString(keyPass,idpass)
        editor?.apply()
    }

    fun sessionLogout(){
        editor?.remove(keyName)
        editor?.remove(keyPass)
        editor?.apply()
    }

    val iduser: String?
        get() = session?.getString(keyName, null)
    val idpass: String?
        get() = session?.getString(keyPass, null)

    fun isLogin(): Boolean {
        if (iduser != null && idpass != null) {
            return true
        }
        return false
    }



}