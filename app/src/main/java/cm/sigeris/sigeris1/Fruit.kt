package cm.sigeris.sigeris1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Fruit : AppCompatActivity() {
    private lateinit var txt_banane : EditText;
    private lateinit var btn_Ajouter : Button;
    private lateinit var btn_Supprime : Button;
    private lateinit var rest_banane : TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fruit)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txt_banane =findViewById(R.id.txt_banane)
        btn_Ajouter =findViewById(R.id.btn_Ajouter)
        btn_Supprime =findViewById(R.id.btn_Supprime)
        rest_banane =findViewById(R.id.rest_banane)
        btn_Ajouter.setOnClickListener {
            var fruit = arrayOfNulls<String>(5)
            var i = 0
            var Fruit = txt_banane.text.toString()
            i++
            for (i in fruit){
                rest_banane.text = Fruit
            }
        }
        btn_Supprime.setOnClickListener {
           rest_banane.text = " "
        }


    }
}