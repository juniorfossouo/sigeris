package cm.sigeris.sigeris1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class devinettes : AppCompatActivity() {
    private lateinit var txt_resut : EditText
    private lateinit var btn_submit : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_devinettes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txt_resut = findViewById(R.id.txt_resut)
        btn_submit = findViewById(R.id.btn_submit)
        btn_submit.setOnClickListener {
//            txt_resut.text =null
           val number = txt_resut.text.toString().toInt()
            if(number < 0 || number > 20){
                txt_resut.setText("ce nombre est incorrecte, veuillez saisir un nouveau nombre")
            }
            else{
                txt_resut.setText("ce nombre est tres tres tres correcte. felicitation junior")
            }
        }
    }
}