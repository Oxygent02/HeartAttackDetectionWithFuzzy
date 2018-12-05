package com.oxygent.heartattackdetectionwithfuzzy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.KeyEvent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.view.KeyEvent.KEYCODE_BACK



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeValid()
    }

    override fun onBackPressed() {
//         super.onBackPressed(); commented this line in order to disable back press
        //Write your code here
        Toast.makeText(applicationContext, "Back press disabled!", Toast.LENGTH_SHORT).show()
    }

    private fun initializeValid() {

        btn_define.setOnClickListener {

            if (!edt_systolic.text.toString().trim().isNotEmpty()){
                edt_systolic?.error = "Required"
            }
            else if (!edt_diastolic.text.toString().trim().isNotEmpty()){
                edt_diastolic?.error = "Required"
            }
            else if (!edt_hdl.text.toString().trim().isNotEmpty()){
                edt_hdl?.error = "Required"
            }
            else if (!edt_ldl.text.toString().trim().isNotEmpty()){
                edt_ldl?.error = "Required"
            }
            else if (!edt_trigliceride.text.toString().trim().isNotEmpty()){
                edt_trigliceride?.error = "Required"
            }
            else{
                Toast.makeText(this, "Data on processed, Please wait..", Toast.LENGTH_SHORT).show()
                showResult()
            }

        }

    }

    private fun showResult() {
        tv_result.text = getString(R.string.result1)
    }
}
