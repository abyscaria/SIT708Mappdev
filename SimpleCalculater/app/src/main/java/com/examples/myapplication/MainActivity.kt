package com.examples.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.text.*
import com.examples.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var mainBind : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       //setContentView(R.layout.activity_main)
       mainBind = ActivityMainBinding.inflate(layoutInflater)
       setContentView(mainBind.root)
       var num1  = "1.00"
       var num2 = "1.00"

          mainBind.addButton.setOnClickListener {
              num1 = mainBind.txtView1.text.toString()
              num2  = mainBind.txtView2.text.toString()
              val res1 = num1.toDouble()
              val res2 = num2.toDouble()
              var res3: Double

              res3 = (res1 + res2 )
           mainBind.txtView.text = res3.toString()
           val toast = Toast.makeText(
             this,
              "numb1: " + num1 + " And Num2: " +num2+ " reult: "+res1+res2,Toast.LENGTH_SHORT)
         //  toast.show()
            //  val toast = Toast.makeText(
             //     this,
            //      "numb1: " + res2 + " And Num2: " + res2 + " reult: "+res1+res2,Toast.LENGTH_SHORT)
              toast.show()

       }
       mainBind.subtractButton.setOnClickListener {
           num1 = mainBind.txtView1.text.toString()
           num2  = mainBind.txtView2.text.toString()
           val res1 = num1.toDouble()
           val res2 = num2.toDouble()
           var res3: Double

           res3 = res1-res2
           mainBind.txtView.text = res3.toString()
           val toast = Toast.makeText(
               this,
               "Num1: " + num1 + " And Num2: " + num2 + " reult: " + res3,
               Toast.LENGTH_SHORT
           )
           toast.show()
       }

       mainBind.divideButton.setOnClickListener {
           num1 = mainBind.txtView1.text.toString()
           num2  = mainBind.txtView2.text.toString()
           val res1 = num1.toDouble()
           val res2 = num2.toDouble()
           var res3: Double
           res3 = res1 / res2
           mainBind.txtView.text = String.format("%.2f",res3)
           val toast = Toast.makeText(
               this,
               "Num1: " + num1 + " And Num2: " + num2 + " reult: " + res3,
               Toast.LENGTH_SHORT
           )
           toast.show()
       }

       mainBind.multiplyButton.setOnClickListener {
           num1 = mainBind.txtView1.text.toString()
           num2  = mainBind.txtView2.text.toString()
           val res1 = num1.toDouble()
           val res2 = num2.toDouble()
           var res3: Double

           res3 = res1 * res2
           mainBind.txtView.text = res3.toString()
           val toast = Toast.makeText(this,"num1: "+num1+"And Num2: "+num2+" reult: "+res3,Toast.LENGTH_SHORT
           )
           toast.show()
       }
}

 }





