package com.example.sum2num

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val edtxt1: EditText = findViewById(R.id.num1)
        val edtxt2: EditText = findViewById(R.id.num2)
        val resultTV: TextView = findViewById(R.id.Result)
        var flag: String = "sum"
        val spinnerVal: Spinner = findViewById(R.id.spSelect)
        var options = arrayOf("sum", "multiply")
        spinnerVal.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)

    spinnerVal.onItemSelectedListener= object : AdapterView.OnItemSelectedListener {
        override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            flag=options.get(p2)
        }

        override fun onNothingSelected(p0: AdapterView<*>?) {
            TODO("Not yet implemented")
        }
    }
    button.setOnClickListener{
        var x: Int = edtxt1.text.toString().toInt()
        var y: Int = edtxt2.text.toString().toInt()
        if(flag=="sum")
            resultTV.text=sum(x,y).toString()
        else   resultTV.text=mul(x,y).toString()

    }
}
    public fun mul(x:Int , y:Int):Int {
        return x*y
    }
    public fun sum(x:Int, y:Int):Int {
        return y+x
    }
}