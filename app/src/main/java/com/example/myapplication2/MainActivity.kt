package com.example.myapplication2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.myapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    //1-enable the binding object  : generated file name
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            binding = ActivityMainBinding.inflate(layoutInflater) //question here
            val view = binding.root // reference layout file
            setContentView(view) // link layout


        binding.button.setOnClickListener {
            calculateVat()
        } // End setOnClickListener

        }  // End onCreate
    private fun calculateVat() {
        TODO("Not yet implemented")
    }

}// End MainActivity



