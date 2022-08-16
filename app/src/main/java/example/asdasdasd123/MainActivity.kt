package example.asdasdasd123

import android.content.Context
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.databinding.DataBindingUtil
import example.asdasdasd123.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var diceImg: ImageView
    lateinit var numbText: TextView
    lateinit var nameTxt: EditText
    lateinit var playerNameTxt: TextView
    lateinit var binding: ActivityMainBinding
    private val gameInfo: GameInfo = GameInfo("Ng", "0")
    private var totalScore: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        diceImg = findViewById(R.id.diceImg)
//        numbText = findViewById(R.id.numberTxt)
//        nameTxt = findViewById(R.id.editPlayerNameET)
//        playerNameTxt = findViewById(R.id.playerName)

//        val rollButton: Button = findViewById(R.id.button)
//        val updateBtn: Button = findViewById(R.id.updateButton)
//        updateBtn.setOnClickListener { updateName(it) }
        binding.gameInfo = gameInfo
        binding.rollButton.setOnClickListener{rollDice()}
        binding.updateButton.setOnClickListener{updateName(it)}
    }

    private fun updateName(view: View){
//        playerNameTxt.text = nameTxt.text
//        nameTxt.text.clear()
//        nameTxt.clearFocus()
//
//        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        imm.hideSoftInputFromWindow(view.windowToken, 0)
        binding.apply {
            gameInfo?.playerName = editPlayerNameET.text.toString()
            invalidateAll()
        }
    }

    private fun rollDice() {
        Toast.makeText(this, "Roll", Toast.LENGTH_SHORT).show()
        val randomNum = (1..6).random()
//        val numTxt: TextView = findViewById(R.id.numberTxt)
            binding.numberTxt.text = randomNum.toString()

//        val diceImage : ImageView = findViewById(R.id.diceImg)
        val imgSrc = when (randomNum){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.diceImg.setImageResource(imgSrc)

        Toast.makeText(this,randomNum.toString(),
        Toast.LENGTH_SHORT).show()
    }
}