package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.jvm.internal.Ref

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener()
        {
            val weight:Double = editWeight.text.toString().toDouble();
            val height:Double = editHeight.text.toString().toDouble();
            var status:String = "";
            val bmi = weight / (height*height);

            when{
                bmi < 18.5 -> {
                    imageViewProfile.setImageResource(R.drawable.under)
                    status = "over"
                }
                bmi < 24.9 -> {
                    imageViewProfile.setImageResource(R.drawable.normal)
                    status = "over"
                }
                else -> {
                    imageViewProfile.setImageResource(R.drawable.over)
                    status = "over"
                }
            }

            textViewBMI.text = "BMI: %.2f".format(bmi, status);
        }

        buttonReset.setOnClickListener()
        {
            editHeight.text = null;
            editWeight.text = null;
            textViewBMI.text = null;
            imageViewProfile.setImageResource(R.drawable.empty);

        }
    }
}
