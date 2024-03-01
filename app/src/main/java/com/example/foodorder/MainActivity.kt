package com.example.foodorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.foodorder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnorder.setOnClickListener {
            val rg=binding.rgfood.checkedRadioButtonId
            val food=findViewById<RadioButton>(rg)
            val cheese=binding.cbcheese.isChecked
            val onion=binding.cbonion.isChecked
            val salad=binding.salad.isChecked
            val order="You have ordered ${food.text} Burger"+
                    (if(cheese) "\nWith Cheese" else "") +
                    (if(onion) "\nWith Onions" else "") +
                    (if(salad) "\nWith Salad" else "")
            binding.tvresult.text=order
        }
    }
}