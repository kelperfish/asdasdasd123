package example.asdasdasd123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        Toast.makeText(this, "Roll", Toast.LENGTH_SHORT).show()
        val randomNum = (1..6).random()
        val numTxt: TextView = findViewById(R.id.numberTxt)
        numTxt.text = randomNum.toString()
    }
}