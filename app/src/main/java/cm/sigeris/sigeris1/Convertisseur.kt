package cm.sigeris.sigeris1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Convertisseur : AppCompatActivity() {
    private lateinit var edt_dollar : EditText
    private lateinit var btn_convert : Button
    private lateinit var txt_rest : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_convertisseur)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        edt_dollar = findViewById(R.id.edt_dollar)
        btn_convert = findViewById(R.id.btn_convert)
        txt_rest = findViewById(R.id.txt_rest)
        btn_convert.setOnClickListener {
            var dollar = 630
            val a = edt_dollar.text.toString()
            txt_rest.text =(a.toInt()*dollar).toString()+"FCFA"
        }
    }
}