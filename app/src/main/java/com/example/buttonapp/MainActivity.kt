package com.example.buttonapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Color.parseColor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var Bmins:Button
    lateinit var Bplus:Button
    lateinit var mytext:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Bmins=findViewById(R.id.Bmins);
        Bplus =findViewById(R.id.Bplus);
        mytext=findViewById(R.id.tvmytext)

        Bplus.setOnClickListener{
          var Btext = Bplus.text.toString()
            PlusMin(Btext)
            //without Bonus
        // var num= mytext.text.toString();
          // var num1:Int=num.toInt();
          //  num1++;
          // mytext.text= num1.toString()

        }
        Bmins.setOnClickListener{
            var Btext = Bmins.text.toString()
            PlusMin(Btext)
            //without Bonus
          //  var num= mytext.text.toString();
          //  var num1:Int=num.toInt();
          //  num1--;
          //  mytext.text= num1.toString()

        }

        }
    fun PlusMin(text:String){

        var num= mytext.text.toString();
        var num1:Int=num.toInt();
        if("+" == text ){
          num1++
          mytext.text= num1.toString()

        }else{
           num1--
           mytext.text= num1.toString()


        }
        if(num1<0){
            mytext.setTextColor(Color.RED)
           
        }
        else if(num1>0){
            mytext.setTextColor(Color.GREEN)

        }else{
            mytext.setTextColor(Color.BLACK)

        }

    }


    }
