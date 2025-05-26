package cm.sigeris.sigeris1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var txt_nb1: EditText;
    private lateinit var txt_nb2: EditText;
    private lateinit var btn_plus: Button;
    private lateinit var btn_moins: Button;
    private lateinit var txt_resultat: TextView;
    private lateinit var btn_mult: Button ;
    private lateinit var btn_div: Button ;
    private lateinit var btn_reset: Button ;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txt_nb1 = findViewById(R.id.txt_nb1)
        txt_nb2 = findViewById(R.id.txt_nb2)
        btn_plus = findViewById(R.id.btn_plus)
        btn_moins = findViewById(R.id.btn_moins)
        btn_mult = findViewById(R.id.btn_mult)
        btn_div = findViewById(R.id.btn_div)
        btn_reset = findViewById(R.id.btn_reset)
        txt_resultat = findViewById(R.id.txt_resultat)
        btn_plus.setOnClickListener {
            //Toast.makeText(this, "${ txt_nb1.text.toString().toInt() } ${ txt_nb2.text.toString().toInt() }", Toast.LENGTH_SHORT).show()
            txt_resultat.setText((txt_nb1.text.toString().toInt() + txt_nb2.text.toString().toInt()).toString());
        }
        btn_moins.setOnClickListener {
            txt_resultat.setText((txt_nb1.text.toString().toInt() - txt_nb2.text.toString().toInt()).toString());
        }
        btn_mult.setOnClickListener {
            txt_resultat.setText((txt_nb1.text.toString().toInt() * txt_nb2.text.toString().toInt()).toString());
        }
        btn_div.setOnClickListener {
            txt_resultat.setText((txt_nb1.text.toString().toInt() / txt_nb2.text.toString().toInt()).toString());
        }
        btn_reset.setOnClickListener {
            txt_nb1.text.clear()
            txt_nb2.text.clear()
            txt_resultat.text = "0"}

    }
}