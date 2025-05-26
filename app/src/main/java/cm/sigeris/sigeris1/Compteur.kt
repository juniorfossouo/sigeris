package cm.sigeris.sigeris1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Compteur : AppCompatActivity() {
    private lateinit var txt_resul : TextView;
    private lateinit var btn_voir : Button;
    private lateinit var btn_plus : Button;
    private lateinit var btn_reset : Button;
    private lateinit var btn_moins : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_compteur)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txt_resul = findViewById(R.id.txt_resul);
        btn_voir = findViewById(R.id.btn_voir);
        btn_plus = findViewById(R.id.btn_plus);
        btn_reset = findViewById(R.id.btn_reset);
        btn_moins = findViewById(R.id.btn_moins);
//        btn_voir.setOnClickListener {
//            }
        btn_plus.setOnClickListener {
            txt_resul.text = (txt_resul.text.toString().toInt()+1).toString()
        }
        btn_reset.setOnClickListener {
            txt_resul.text = "0"
        }
        btn_moins.setOnClickListener {
           if (txt_resul.text.toString().toInt()>0){
               txt_resul.text =(txt_resul.text.toString().toInt() -1).toString()
           }
        }

    }
}