package com.example.neco_14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.neco_14.Constans.Constans
import com.example.neco_14.databinding.ActivitySingUpInBinding


class SingInUpActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivitySingUpInBinding
    private var signState = "empty"

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(bindingClass.root)

        signState = intent.getStringExtra(Constans.SING_STATE)!!
        if (signState ==Constans.SING_IN_STATE){

        }
    }
    fun onClickDone(view : View){
        if (signState ==Constans.SING_IN_STATE){
            bindingClass.edName.visibility = View.GONE
            bindingClass.edName2.visibility = View.GONE
            bindingClass.edName3.visibility = View.GONE
            bindingClass.bAvatar.visibility = View.INVISIBLE
        }
    }
        fun onClickAvatar(view : View){

            bindingClass.imAvatar.visibility = View.VISIBLE
        }
}