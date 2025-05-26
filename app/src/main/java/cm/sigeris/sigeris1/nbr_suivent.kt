package cm.sigeris.sigeris1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class nbr_suivent : AppCompatActivity() {
    private lateinit var txt_nb : EditText
    private lateinit var txt_result : TextView
    private lateinit var btn_ : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nbr_suivent)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txt_nb = findViewById(R.id.txt_nb)
        txt_result = findViewById(R.id.txt_result)
        btn_ = findViewById(R.id.btn_)
        btn_.setOnClickListener {
            txt_result.text = null
            val debut = txt_nb.text.toString().toInt()
            for (i in debut+1 .. debut+10){
                txt_result.text ="${txt_result.text.toString()}$i,"
            }
        }
    }
}