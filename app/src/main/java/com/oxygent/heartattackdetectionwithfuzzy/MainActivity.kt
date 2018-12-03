package com.oxygent.heartattackdetectionwithfuzzy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeValid()
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
