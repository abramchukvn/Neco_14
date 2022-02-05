package com.example.neco_14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.neco_14.Constans.Constans
import com.example.neco_14.databinding.ActivityMainBinding
import android.content.Intent as Intent

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding
    private var login: String = "empty"
    private var password: String = "empty"
    private var name: String = "empty"
    private var name2: String = "empty"
    private var name3: String = "empty"
    private var avatarImageId: Int = 0


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == Constans.REQUEST_CODE_SING_IN) {

        } else if (requestCode == Constans.REQUEST_CODE_SING_UP) {


        }


    }

    fun onClickSingIn(view: View) {
        val intent = Intent(this, SingInUpActivity::class.java)
        intent.putExtra(Constans.SING_STATE, Constans.SING_IN_STATE)
        startActivityForResult(intent, Constans.REQUEST_CODE_SING_IN)

    }

    fun onClickSingUp(view: View) {
        val intent = Intent(this, SingInUpActivity::class.java)
        intent.putExtra(Constans.SING_STATE, Constans.SING_UP_STATE)
        startActivityForResult(intent, Constans.REQUEST_CODE_SING_UP)

    }
}